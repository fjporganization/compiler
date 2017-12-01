import java.util.HashMap;
import java.util.Map;

public class CompilerVariables extends CBaseListener{

    /** Data which are shared across all compilers classes */
    private final CompilerData data;

    /** table of symbol */
    private final Map<String, Addressable> symbolTable;

    /**
     * Constructor of CompilerVariables
     * @param data contains data which are shared with all compiler classes
     */
    public CompilerVariables(CompilerData data){
        this.data = data;
        this.symbolTable = new HashMap<>();
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

        if(symbolTableGet(identifier) != null) {
            System.err.println("Identifier " + identifier + " is already declared");
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
        symbolTablePut(identifier, var);
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

        if(symbolTableGet(identifier) != null) {
            System.err.println("Identifier " + identifier + " is already declared");
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
        symbolTablePut(identifier, variable);

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

        if(symbolTableGet(identifier) != null) {
            System.err.println("Identifier " + identifier + " is already declared");
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
        symbolTablePut(identifier, constant);

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
        Addressable variable = symbolTableGet(identifier);

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

        Addressable variable = symbolTableGet(identifier);

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

    // SYMBOL TABLE OPERATIONS =============

    /**
     * Return object of Addressable which have input identifier and is in same scope or is defined globally
     *
     * @param identifier of searching object
     * @return found object or null
     */
    private Addressable symbolTableGet(String identifier){
        Addressable res = symbolTable.get(hashIdentifier(identifier, data.getNestingLevel()));

        if (res == null){
            res = symbolTable.get(hashIdentifier(identifier, 0));
        }

        return res;
    }

    /**
     * Put input addressable to map with hashed key by function hashIdentifier
     *
     * @param identifier of saving object
     * @param addressable object which will be saved
     */
    private void symbolTablePut(String identifier, Addressable addressable){
        symbolTable.put(hashIdentifier(identifier, data.getNestingLevel()), addressable);
    }

    /**
     * Add before identifier nestingLevel. New identifier is unique for scope.
     *
     * @param identifier which will be hashed
     * @param nestingLevel number of scope
     * @return coded identifier
     */
    private String hashIdentifier(String identifier, int nestingLevel){
        return nestingLevel + identifier;
    }
}
