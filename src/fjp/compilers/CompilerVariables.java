package fjp.compilers;

import fjp.generated.*;
import fjp.structures.*;

public class CompilerVariables extends CBaseListener {

    /** Data which are shared across all compilers classes */
    private final CompilerData data;

    /**
     * Constructor of fjp.compilers.CompilerVariables
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
        String identifier = ctx.IDENTIFIER().getText();
        String dataType = ctx.TYPESPECIFIER().getText();
        int length = 0;
        DataType type = null;

        if(data.symbolTableGet(identifier) != null) {
            System.err.println("fjp.structures.Identifier " + identifier + " is already declared");
        }

        switch(dataType) {
            case "int":
                type = DataType.INT;
                length = 0; //int has no overlap in the stack
                break;
            case "boolean":
                type = DataType.BOOLEAN;
                length = 0; //boolean has no overlap in the stack
                break;
        }

        int varAddress = CompilerData.BASE_FUNC_STACK_SIZE + data.getVarCounter();
        data.incVarCounter();

        Variable var = new Variable(varAddress, data.getNestingLevel(), identifier, length, type);
        data.symbolTablePut(identifier, var);
    }

    /**
     * Processes variable declaration with initialization
     */
    @Override
    public void exitDeclarationAndInitialization(CParser.DeclarationAndInitializationContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String dataType = ctx.TYPESPECIFIER().getText();
        int length = 0;
        DataType type = null;

        if(data.symbolTableGet(identifier) != null) {
            System.err.println("fjp.structures.Identifier " + identifier + " is already declared");
        }

        switch(dataType) {
            case "int":
                type = DataType.INT;
                length = 0; //int has no overlap in the stack
                break;
            case "boolean":
                type = DataType.BOOLEAN;
                length = 0; //boolean has no overlap in the stack
                break;
        }

        int varAddress = CompilerData.BASE_FUNC_STACK_SIZE + data.getVarCounter();
        data.incVarCounter();

        Variable variable = new Variable(varAddress, data.getNestingLevel(), identifier, length, type);
        data.symbolTablePut(identifier, variable);

        data.addInstruction(new Instruction(InstructionCodes.STORE, 0, varAddress));
        data.decStackPointer();
    }

    /**
     * Processes constant declaration with initialization
     */
    @Override
    public void exitConstantdeclaration(CParser.ConstantdeclarationContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String dataType = ctx.TYPESPECIFIER().getText();
        int length = 0;
        DataType type = null;

        if(data.symbolTableGet(identifier) != null) {
            System.err.println("fjp.structures.Identifier " + identifier + " is already declared");
        }

        switch(dataType) {
            case "int":
                type = DataType.INT;
                length = 0; //int has no overlap in the stack
                break;
            case "boolean":
                type = DataType.BOOLEAN;
                length = 0; //boolean has no overlap in the stack
                break;
        }

        int varAddress = CompilerData.BASE_FUNC_STACK_SIZE + data.getVarCounter();
        data.incVarCounter();

        Constant constant = new Constant(varAddress, data.getNestingLevel(), identifier, length, type);
        data.symbolTablePut(identifier, constant);

        data.addInstruction(new Instruction(InstructionCodes.STORE, 0, varAddress));
        data.decStackPointer();
    }

    /**
     * Processes atom identified by identifier (pushes the value of the variable onto the stack)
     */
    @Override
    public void exitIdentifierAtom(CParser.IdentifierAtomContext ctx) {
        //load variable or constant identified by identifier onto the stack
        String identifier = ctx.IDENTIFIER().getText();
        Addressable variable = data.symbolTableGet(identifier);

        if(variable == null) {
            System.err.println(identifier + " is unknown");
            System.exit(1);
        }

        //check if identifier is not name of function
        if(!(variable instanceof Variable || variable instanceof Constant)) {
            System.err.println(identifier + " is not constant or variable");
            System.exit(1);
        }

        Instruction instruction = new Instruction(InstructionCodes.LOAD,
                data.getNestingLevel() - variable.getNestingLevel(), variable.getAddress());

        //instruction push 1 value onto the stack
        data.incStackPointer();
        data.addInstruction(instruction);
    }

    /**
     * Processes variable assignment
     */
    @Override
    public void exitStandardAssignment(CParser.StandardAssignmentContext ctx) {
        String identifier =  ctx.IDENTIFIER().getText();

        Addressable variable = data.symbolTableGet(identifier);

        if(variable == null) {
            System.err.println("Unknown identifier: " + identifier);
            System.exit(1);
        }

        if(!(variable instanceof Variable)) {
            System.err.println(identifier + "is not variable");
            System.exit(1);
        }

        //value of the assignment is on top of the stack, store current stack pointer
        data.addInstruction(new Instruction(InstructionCodes.STORE, data.getNestingLevel() - variable.getNestingLevel(), variable.getAddress()));
        data.decStackPointer();
    }
}
