package fjp.compilers;

import fjp.generated.*;
import fjp.structures.*;
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
        declaration(ctx.IDENTIFIER().getText(), ctx.TYPESPECIFIER().getText(), false);
    }

    /**
     * Processes variable declaration with initialization
     */
    @Override
    public void exitDeclarationAndInitialization(CParser.DeclarationAndInitializationContext ctx) {
        Addressable addressable = declaration(ctx.IDENTIFIER().getText(), ctx.TYPESPECIFIER().getText(), false);

        if (data.popDataType() != addressable.getDataType()) {
            System.err.println("Data type " + addressable.getDataType() + " is not expected in: " + addressable.getName());
            System.exit(1);
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

        Addressable addressable = declaration(ctx.IDENTIFIER().getText(), ctx.TYPESPECIFIER().getText(), true);

        if (data.popDataType() != addressable.getDataType()) {
            System.err.println("Data type " + addressable.getDataType() + " is not expected in: " + addressable.getName());
            System.exit(1);
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
            System.err.println("Identifier " + identifier + " is already declared");
            System.exit(1);
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
        //load variable or constant identified by identifier onto the stack
        Addressable variable = getAddressable(ctx.IDENTIFIER().getText());

        data.pushDataType(variable.getDataType());

        if (variable.getNestingLevel() == 0) {
            // global variable
            globalVariables(InstructionCodes.LOAD_FROM_ADDRESS, variable.getAddress(), variable.getLength());
        } else {
            // local variable
            int nestingLevel = data.getNestingLevel() - variable.getNestingLevel();
            localVariables(InstructionCodes.LOAD, variable.getAddress(), variable.getLength(), nestingLevel);
        }

        data.incStackPointer(variable.getLength());
    }

    /**
     * Processes variable assignment
     */
    @Override
    public void exitStandardAssignment(CParser.StandardAssignmentContext ctx) {

        Addressable variable = getAddressable(ctx.IDENTIFIER().getText());

        if (data.popDataType() != variable.getDataType()) {
            System.err.println("Invalid data type: " + variable.getName());
            System.exit(1);
        }

        if(variable.getNestingLevel() == 0){
            globalVariables(InstructionCodes.STORE_AT_ADDRESS, variable.getAddress(), variable.getLength());
        } else {
            int nestingLevel = data.getNestingLevel() - variable.getNestingLevel();
            localVariables(InstructionCodes.STORE, variable.getAddress(), variable.getLength(), nestingLevel);
        }

        data.decStackPointer(variable.getLength());
    }

    @Override
    public void exitMultipleAssignment(CParser.MultipleAssignmentContext ctx) {

        List<TerminalNode> identifiers = ctx.IDENTIFIER();
        DataType valueType = data.popDataType();
        int length = valueType == DataType.FRACTION ? 2 : 1; // size of values on stack

        for(TerminalNode node : identifiers){
            Addressable variable = getAddressable(node.getText());

            if (valueType != variable.getDataType()) {
                System.err.println("Invalid data type: " + variable.getName());
                System.exit(1);
            }

            for (int i = 0; i < length; i++) {
                // nestingLevel = 0 because is in same procedure
                Instruction load = new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1);
                data.addInstruction(load);
                data.toShift.add(load);
            }

            if(variable.getNestingLevel() == 0){
                globalVariables(InstructionCodes.STORE_AT_ADDRESS, variable.getAddress(), variable.getLength());
            } else {
                int nestingLevel = data.getNestingLevel() - variable.getNestingLevel();
                localVariables(InstructionCodes.STORE, variable.getAddress(), variable.getLength(), nestingLevel);
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
        if(ctx.identifierlist().IDENTIFIER().size() != ctx.valuelist().expression().size()){
            System.err.println("Parallel assignment: Number of identifiers is not equal to number of values.");
            System.err.println(ctx.getText());
            System.exit(1);
        }

        List<TerminalNode> identifiers = ctx.identifierlist().IDENTIFIER();

        for(int i = identifiers.size() - 1; i >= 0; i--){

            Addressable variable = getAddressable(identifiers.get(i).getText());

            if (data.popDataType() != variable.getDataType()) {
                System.err.println("Invalid data type: " + variable.getName());
                System.exit(1);
            }

            if(variable.getNestingLevel() == 0){
                globalVariables(InstructionCodes.STORE_AT_ADDRESS, variable.getAddress(), variable.getLength());
            } else {
                int nestingLevel = data.getNestingLevel() - variable.getNestingLevel();
                localVariables(InstructionCodes.STORE, variable.getAddress(), variable.getLength(), nestingLevel);
            }

            data.decStackPointer(variable.getLength());
        }
    }


    private Addressable getAddressable(String identifier){
        Addressable variable = data.symbolTableGet(identifier);

        if(variable == null) {
            System.err.println("Unknown identifier: " + identifier);
            System.exit(1);
        }

        if(!(variable instanceof Variable)) {
            System.err.println(identifier + "is not variable");
            System.exit(1);
        }

        return variable;
    }

    private void localVariables(InstructionCodes code, int address, int length, int nestingLevel){

        for (int i = length - 1; i >= 0; i--){
            data.addInstruction(new Instruction(code, nestingLevel, address + i));
        }
    }

    private void globalVariables(InstructionCodes code, int address, int length){

        for (int i = length - 1; i >= 0; i--){
            data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, address + i));
            data.addInstruction(new Instruction(code, 0, 0));
        }
    }
}
