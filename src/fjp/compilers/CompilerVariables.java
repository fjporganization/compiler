package fjp.compilers;

import fjp.generated.*;
import fjp.structures.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * Class providing compiler functionality for parsing variables.
 */
public class CompilerVariables extends CBaseListener {

    /**
     * Data which are shared across all compilers classes.
     */
    private final CompilerData data;

    /**
     * Constructor of CompilerVariables.
     *
     * @param data contains data which are shared with all compiler classes
     */
    public CompilerVariables(CompilerData data) {
        this.data = data;
    }

    /**
     * Processes variable declaration without initialization.
     */
    @Override
    public void exitDeclarationOnly(CParser.DeclarationOnlyContext ctx) {
        Addressable addressable = declaration(ctx.IDENTIFIER().getText(), ctx.TYPESPECIFIER().getText(), false);

        if (addressable == null) {
            Error.throwError(ctx, "Identifier " + ctx.IDENTIFIER().getText() + " is already declared");
            return;
        }
    }

    /**
     * Processes variable declaration with initialization.
     */
    @Override
    public void exitDeclarationAndInitialization(CParser.DeclarationAndInitializationContext ctx) {
        if (Error.inError()) return;

        Addressable addressable = declaration(ctx.IDENTIFIER().getText(), ctx.TYPESPECIFIER().getText(), false);

        if (addressable == null) {
            Error.throwError(ctx, "Identifier " + ctx.IDENTIFIER().getText() + " is already declared");
            return;
        }

        DataType stackDataType = data.popDataType();
        if (stackDataType != addressable.getDataType()) {
            String message = "Data type " + stackDataType + " is not expected in: " + addressable.getName();
            Error.throwError(ctx, message);
            return;
        }

        for (int i = addressable.getLength() - 1; i >= 0; i--) {
            data.addInstruction(new Instruction(InstructionCodes.STORE, 0, addressable.getAddress() + i));
            data.decStackPointer();
        }
    }

    /**
     * Processes constant declaration with initialization.
     */
    @Override
    public void exitConstantdeclaration(CParser.ConstantdeclarationContext ctx) {

        if (Error.inError()) return;

        Addressable addressable = declaration(ctx.IDENTIFIER().getText(), ctx.TYPESPECIFIER().getText(), true);

        if (addressable == null) {
            Error.throwError(ctx, "Identifier " + ctx.IDENTIFIER().getText() + " is already declared");
            return;
        }

        DataType stackDataType = data.popDataType();
        if (stackDataType != addressable.getDataType()) {
            String message = "Data type " + stackDataType + " is not expected in: " + addressable.getName();
            Error.throwError(ctx, message);
            return;
        }

        for (int i = addressable.getLength() - 1; i >= 0; i--) {
            data.addInstruction(new Instruction(InstructionCodes.STORE, 0, addressable.getAddress() + i));
            data.decStackPointer();
        }
    }

    /**
     * Create new variable or constant. Check data type, add it to identifiers list and book space in stack.
     *
     * @param identifier which is specified for scope
     * @param dataType string of used data type
     * @param constant true if created variable is constant
     * @return created variable or constant
     */
    private Addressable declaration(String identifier, String dataType, boolean constant) {
        int length = 0;
        DataType type = null;

        if (data.symbolTableGet(identifier) != null) {
            return null;
        }

        switch (dataType) {
            case "int":
                type = DataType.INT;
                length = 1;
                break;
            case "boolean":
                type = DataType.BOOLEAN;
                length = 1;
                break;
            case "ratio":
                type = DataType.FRACTION;
                length = 2;
                break;
        }

        // get alloc address
        int varAddress = CompilerData.BASE_FUNC_STACK_SIZE + data.getVarCounter();
        data.incVarCounter(length);

        // Create Variable or Constant
        Addressable addressable;
        if (constant) {
            addressable = new Constant(varAddress, data.getScopeId(), identifier, length, type);
        } else {
            addressable = new Variable(varAddress, data.getScopeId(), identifier, length, type);
        }
        data.symbolTablePut(identifier, addressable);

        return addressable;
    }

    /**
     * Processes atom identified by identifier (pushes the value of the variable onto the stack)
     */
    @Override
    public void exitIdentifierAtom(CParser.IdentifierAtomContext ctx) {

        if (Error.inError()) return;

        //load variable or constant identified by identifier onto the stack
        Addressable variable = getAddressable(ctx.IDENTIFIER().getText(), ctx, true);
        if (variable == null) {
            return;
        }

        data.pushDataType(variable.getDataType());

        if (variable.getScopeId() == 0) {
            // global variable
            globalVariablesLoad(variable.getAddress(), variable.getLength());
        } else {
            // local variable
            localVariablesLoad(variable.getAddress(), variable.getLength());
        }
    }

    /**
     * Processes standard variable assignment.
     * Find variable by identifier, check data types and add instructions to store data.
     */
    @Override
    public void exitStandardAssignment(CParser.StandardAssignmentContext ctx) {

        if (Error.inError()) return;

        Addressable variable = getAddressable(ctx.IDENTIFIER().getText(), ctx, false);
        if (variable == null) {
            return;
        }

        DataType stackDataType = data.popDataType();
        if (stackDataType != variable.getDataType()) {
            String message = "Data type " + stackDataType + " is not expected in: " + variable.getName();
            Error.throwError(ctx, message);
            return;
        }

        if (variable.getScopeId() == 0) {
            globalVariablesStore(variable.getAddress(), variable.getLength());
        } else {
            localVariablesStore(variable.getAddress(), variable.getLength());
        }
    }

    /**
     * Process multiple assignment.
     * Check all data types and add instructions to store last value to all variables.
     */
    @Override
    public void exitMultipleAssignment(CParser.MultipleAssignmentContext ctx) {

        if (Error.inError()) return;

        List<TerminalNode> identifiers = ctx.IDENTIFIER();
        DataType valueType = data.popDataType();
        int length = valueType == DataType.FRACTION ? 2 : 1; // size of values on stack

        for (TerminalNode node : identifiers) {
            Addressable variable = getAddressable(node.getText(), ctx, false);

            if (variable == null) {
                return;
            }

            if (valueType != variable.getDataType()) {
                String msg = "Data type " + variable.getDataType() + " is not compatible with " + valueType;
                msg += ". Variable: " + variable.getName();
                Error.throwError(ctx, msg);
                return;
            }

            for (int i = 0; i < length; i++) {
                // nestingLevel = 0 because is in same procedure
                Instruction load = new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - length + 1);
                data.addInstruction(load);
                data.incStackPointer();
                data.toShift.add(load);
            }

            if (variable.getScopeId() == 0) {
                globalVariablesStore(variable.getAddress(), variable.getLength());
            } else {
                localVariablesStore(variable.getAddress(), variable.getLength());
            }
        }

        // remove values from stack
        for (int i = 0; i < length; i++) {
            data.addInstruction(new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, data.getCurrentInstructionAddress() + 2));
        }
        data.decStackPointer(length);
    }

    /**
     * Process parallel assignment.
     * Check number of identifiers and number of values, check data types and add instructions to store data.
     */
    @Override
    public void exitParallelassignment(CParser.ParallelassignmentContext ctx) {

        if (Error.inError()) return;

        if (ctx.identifierlist().IDENTIFIER().size() != ctx.valuelist().variableinitializationvalue().size()) {
            String message = "Parallel assignment: Number of identifiers is not equal to number of values.\n";
            message += ctx.getText();
            Error.throwError(ctx, message);
            return;
        }

        List<TerminalNode> identifiers = ctx.identifierlist().IDENTIFIER();

        for (int i = identifiers.size() - 1; i >= 0; i--) {

            Addressable variable = getAddressable(identifiers.get(i).getText(), ctx, false);

            if (variable == null) {
                return;
            }

            DataType stackDataType = data.popDataType();
            if (stackDataType != variable.getDataType()) {
                String msg = "Data type " + stackDataType + " is not compatible with " + variable.getDataType();
                msg += ". Variable: " + variable.getName();
                Error.throwError(ctx, msg);
                return;
            }

            if (variable.getScopeId() == 0) {
                globalVariablesStore(variable.getAddress(), variable.getLength());
            } else {
                localVariablesStore(variable.getAddress(), variable.getLength());
            }
        }
    }

    /**
     * Found identifier in list of identifiers. Return only global variables or variables in scope(in function).
     *
     * @param identifier specific identifier of variable or constant
     * @param ctx Parser rule context
     * @param includeConstant true if found variable can be constant.
     * @return found variable or constant.
     */
    private Addressable getAddressable(String identifier, ParserRuleContext ctx, boolean includeConstant) {
        Addressable variable = data.symbolTableGet(identifier);

        if (variable == null) {
            Error.throwError(ctx, "Unknown identifier: " + identifier);
            return null;
        }

        if (!includeConstant && variable instanceof Constant) {
            Error.throwError(ctx, "Variable " + identifier + " is constant.");
            return null;
        }

        if (!(variable instanceof Variable || (includeConstant && variable instanceof Constant))) {
            String msg = identifier + "is not a variable";
            msg += includeConstant ? "or constant." : ".";
            Error.throwError(ctx, msg);
            return null;
        }

        return variable;
    }

    /**
     * Add instructions to store number of values(length) on top of stack to specific address in stack but only in
     * actual function.
     *
     * @param address in stack where value should be stored
     * @param length number of values which will be stored
     */
    private void localVariablesStore(int address, int length) {

        for (int i = length - 1; i >= 0; i--) {
            data.addInstruction(new Instruction(InstructionCodes.STORE, 0, address + i));
            data.decStackPointer();
        }
    }

    /**
     * Add instructions to store number of values(length) on top of stack to specific address in whole stack.
     *
     * @param address address in stack
     * @param length number of values which will be stored
     */
    private void globalVariablesStore(int address, int length) {

        for (int i = length - 1; i >= 0; i--) {
            data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, address + i));
            data.addInstruction(new Instruction(InstructionCodes.STORE_AT_ADDRESS, 0, 0));
            data.decStackPointer();
        }
    }

    /**
     * Add instructions to load number of values(length) from specific address in stack (only in
     * actual function) to top of stack.
     *
     * @param address in stack from value will be loaded
     * @param length number of values which will be load
     */
    private void localVariablesLoad(int address, int length) {

        for (int i = 0; i < length; i++) {
            data.addInstruction(new Instruction(InstructionCodes.LOAD, 0, address + i));
            data.incStackPointer();
        }
    }

    /**
     * Add instructions to load number of values(length) from specific address in stack to top of stack.
     *
     * @param address in stack from value will be loaded
     * @param length number of values which will be load
     */
    private void globalVariablesLoad(int address, int length) {

        for (int i = 0; i < length; i++) {
            data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, address + i));
            data.addInstruction(new Instruction(InstructionCodes.LOAD_FROM_ADDRESS, 0, 0));
            data.incStackPointer();
        }
    }
}
