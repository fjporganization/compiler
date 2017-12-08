package fjp.compilers;

import fjp.generated.*;
import fjp.structures.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class CompilerVariables extends CBaseListener {

    /** Data which are shared across all compilers classes */
    private final CompilerData data;

    /**
     * Constructor of CompilerVariables
     * @param data contains data which are shared with all compiler classes
     */
    public CompilerVariables(CompilerData data){
        this.data = data;
    }

    /**
     * Processes variable declaration without initialization
     */
    @Override
    public void exitDeclarationOnly(CParser.DeclarationOnlyContext ctx) {
        Addressable addressable = declaration(ctx.IDENTIFIER().getText(), ctx.TYPESPECIFIER().getText(), false);

        if (addressable == null){
            Error.throwError(ctx, "Identifier " + ctx.IDENTIFIER().getText() + " is already declared");
            return;
        }
    }

    /**
     * Processes variable declaration with initialization
     */
    @Override
    public void exitDeclarationAndInitialization(CParser.DeclarationAndInitializationContext ctx) {
        if(Error.inError())return;

        Addressable addressable = declaration(ctx.IDENTIFIER().getText(), ctx.TYPESPECIFIER().getText(), false);

        if (addressable == null){
            Error.throwError(ctx, "Identifier " + ctx.IDENTIFIER().getText() + " is already declared");
            return;
        }

        DataType stackDataType = data.popDataType();
        if (stackDataType != addressable.getDataType()) {
            String message = "Data type " + stackDataType + " is not expected in: " + addressable.getName();
            Error.throwError(ctx, message);
            return;
        }

        for (int i = addressable.getLength() - 1; i >= 0; i--){
            data.addInstruction(new Instruction(InstructionCodes.STORE, 0, addressable.getAddress() + i));
            data.decStackPointer();
        }
    }

    /**
     * Processes constant declaration with initialization
     */
    @Override
    public void exitConstantdeclaration(CParser.ConstantdeclarationContext ctx) {

        if(Error.inError())return;

        Addressable addressable = declaration(ctx.IDENTIFIER().getText(), ctx.TYPESPECIFIER().getText(), true);

        if (addressable == null){
            Error.throwError(ctx, "Identifier " + ctx.IDENTIFIER().getText() + " is already declared");
            return;
        }

        DataType stackDataType = data.popDataType();
        if (stackDataType != addressable.getDataType()) {
            String message = "Data type " + stackDataType + " is not expected in: " + addressable.getName();
            Error.throwError(ctx, message);
            return;
        }

        for (int i = addressable.getLength() - 1; i >= 0; i--){
            data.addInstruction(new Instruction(InstructionCodes.STORE, 0, addressable.getAddress() + i));
            data.decStackPointer();
        }
    }

    private Addressable declaration (String identifier, String dataType, boolean constant){
        int length = 0;
        DataType type = null;

        if(data.symbolTableGet(identifier) != null) {
            return null;
        }

        switch(dataType) {
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
            addressable = new Constant(varAddress, data.getNestingLevel(), identifier, length, type);
        } else {
            addressable = new Variable(varAddress, data.getNestingLevel(), identifier, length, type);
        }
        data.symbolTablePut(identifier, addressable);

        return addressable;
    }

    /**
     * Processes atom identified by identifier (pushes the value of the variable onto the stack)
     */
    @Override
    public void exitIdentifierAtom(CParser.IdentifierAtomContext ctx) {

        if(Error.inError())return;

        //load variable or constant identified by identifier onto the stack
        Addressable variable = getAddressable(ctx.IDENTIFIER().getText(), ctx, true);
        if(variable == null){
            return;
        }

        data.pushDataType(variable.getDataType());

        if (variable.getNestingLevel() == 0) {
            // global variable
            globalVariablesLoad(InstructionCodes.LOAD_FROM_ADDRESS, variable.getAddress(), variable.getLength());
        } else {
            // local variable
            int nestingLevel = data.getNestingLevel() - variable.getNestingLevel();
            localVariablesLoad(InstructionCodes.LOAD, variable.getAddress(), variable.getLength(), nestingLevel);
        }
    }

    /**
     * Processes variable assignment
     */
    @Override
    public void exitStandardAssignment(CParser.StandardAssignmentContext ctx) {

        if(Error.inError())return;

        Addressable variable = getAddressable(ctx.IDENTIFIER().getText(), ctx, false);
        if(variable == null){
            return;
        }

        DataType stackDataType = data.popDataType();
        if (stackDataType != variable.getDataType()) {
            String message = "Data type " + stackDataType + " is not expected in: " + variable.getName();
            Error.throwError(ctx, message);
            return;
        }

        if(variable.getNestingLevel() == 0){
            globalVariablesStore(InstructionCodes.STORE_AT_ADDRESS, variable.getAddress(), variable.getLength());
        } else {
            int nestingLevel = data.getNestingLevel() - variable.getNestingLevel();
            localVariablesStore(InstructionCodes.STORE, variable.getAddress(), variable.getLength(), nestingLevel);
        }
    }

    @Override
    public void exitMultipleAssignment(CParser.MultipleAssignmentContext ctx) {

        if(Error.inError()) return;

        List<TerminalNode> identifiers = ctx.IDENTIFIER();
        DataType valueType = data.popDataType();
        int length = valueType == DataType.FRACTION ? 2 : 1; // size of values on stack

        for(TerminalNode node : identifiers){
            Addressable variable = getAddressable(node.getText(), ctx, false);

            if(variable == null){
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

            if(variable.getNestingLevel() == 0){
                globalVariablesStore(InstructionCodes.STORE_AT_ADDRESS, variable.getAddress(), variable.getLength());
            } else {
                int nestingLevel = data.getNestingLevel() - variable.getNestingLevel();
                localVariablesStore(InstructionCodes.STORE, variable.getAddress(), variable.getLength(), nestingLevel);
            }
        }

        // remove values from stack
        for (int i = 0; i < length; i++) {
            data.addInstruction(new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, data.getCurrentInstructionAddress() + 2));
        }
        data.decStackPointer(length);
    }

    @Override
    public void exitParallelassignment(CParser.ParallelassignmentContext ctx) {

        if(Error.inError()) return;

        if(ctx.identifierlist().IDENTIFIER().size() != ctx.valuelist().expression().size()){
            String message = "Parallel assignment: Number of identifiers is not equal to number of values.\n";
            message += ctx.getText();
            Error.throwError(ctx, message);
            return;
        }

        List<TerminalNode> identifiers = ctx.identifierlist().IDENTIFIER();

        for(int i = identifiers.size() - 1; i >= 0; i--){

            Addressable variable = getAddressable(identifiers.get(i).getText(), ctx, false);

            if(variable == null){
                return;
            }

            DataType stackDataType = data.popDataType();
            if (stackDataType != variable.getDataType()) {
                String msg = "Data type " + stackDataType + " is not compatible with " + variable.getDataType();
                msg += ". Variable: " + variable.getName();
                Error.throwError(ctx, msg);
                return;
            }

            if(variable.getNestingLevel() == 0){
                globalVariablesStore(InstructionCodes.STORE_AT_ADDRESS, variable.getAddress(), variable.getLength());
            } else {
                int nestingLevel = data.getNestingLevel() - variable.getNestingLevel();
                localVariablesStore(InstructionCodes.STORE, variable.getAddress(), variable.getLength(), nestingLevel);
            }
        }
    }


    private Addressable getAddressable(String identifier, ParserRuleContext ctx, boolean includeConstant){
        Addressable variable = data.symbolTableGet(identifier);

        if(variable == null) {
            Error.throwError(ctx, "Unknown identifier: " + identifier);
            return null;
        }

        if(!includeConstant && variable instanceof Constant){
            Error.throwError(ctx, "Variable " + identifier + " is constant.");
            return null;
        }

        if(!(variable instanceof Variable || (includeConstant && variable instanceof Constant))) {
            String msg = identifier + "is not a variable";
            msg += includeConstant ? "or constant." : ".";
            Error.throwError(ctx, msg);
            return null;
        }

        return variable;
    }

    private void localVariablesStore(InstructionCodes code, int address, int length, int nestingLevel){

        for (int i = length - 1; i >= 0; i--){
            data.addInstruction(new Instruction(code, nestingLevel, address + i));
            data.decStackPointer();
        }
    }

    private void globalVariablesStore(InstructionCodes code, int address, int length){

        for (int i = length - 1; i >= 0; i--){
            data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, address + i));
            data.addInstruction(new Instruction(code, 0, 0));
            data.decStackPointer();
        }
    }

    private void localVariablesLoad(InstructionCodes code, int address, int length, int nestingLevel){

        for (int i = 0; i < length; i++){
            data.addInstruction(new Instruction(code, nestingLevel, address + i));
            data.incStackPointer();
        }
    }

    private void globalVariablesLoad(InstructionCodes code, int address, int length){

        for (int i = 0; i < length; i++){
            data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, address + i));
            data.addInstruction(new Instruction(code, 0, 0));
            data.incStackPointer();
        }
    }
}
