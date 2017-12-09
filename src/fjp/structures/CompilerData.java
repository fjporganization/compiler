package fjp.structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Class contains all data which are shared between Compiler classes.
 */
public class CompilerData {

    /** Number of function declaration instructions */
    public static final short BASE_FUNC_STACK_SIZE = 3;

    /** address of actual position of the stack (in the assembler) */
    private int stackPointer;

    /** Current scope ID. scopeID 0 is reserved for global variables. */
    private int scopeId;

    /** output instructions */
    private final List<Instruction> output;

    /** table of symbol */
    private final Map<String, Addressable> symbolTable;

    /** instruction whose operand need to be add about number of variables */
    public final List<Instruction> toShift;

    /** Number of variables which will be defined at the beginning of function/program */
    private int varCounter = 0;
    
    /** data types of the expression which is currently evaluated */
    private final Stack<DataType> expDataTypeStack;

    /**
     * Initialize data in class
     */
    public CompilerData(){
        resetStackPointer();
        this.scopeId = 0;

        this.output = new ArrayList<>();
        this.toShift = new ArrayList<>();
        this.symbolTable = new HashMap<>();
        this.expDataTypeStack = new Stack<>();
    }

    // OUTPUT INSTRUCTIONS =================
    
    /**
     * Add input instruction to end of list of all instructions and change stack pointer
     *
     * @param instruction instruction which will be add to list
     */
    public void addInstructionChangeStackPointer(Instruction instruction) {
    	addInstruction(instruction);

    	switch (instruction.getCode()){
            case OPERATION:
                stackPointer += OperationCode.getOpCodeByCode(instruction.getOperand()).getIntegerStackChange();
                break;
            case OPERATION_REAL:
                stackPointer += OperationCode.getOpCodeByCode(instruction.getOperand()).getRealStackChange();
                break;
            case INCREMENT:
                stackPointer += instruction.getOperand();
                break;
            default:
                stackPointer += instruction.getCode().getStackChange();
                break;
        }
    }
    
    /**
     * Add input instruction to end of list of all instructions.
     *
     * @param instruction instruction which will be add to list
     */
    public void addInstruction(Instruction instruction){
        output.add(instruction);
    }

    /**
     * Return list of instructions.
     *
     * @return list of instructions
     */
    public List<Instruction> getOutput(){
        return output;
    }

    /**
     * Returns address of last added instruction.
     *
     * @return address of last added instruction
     */
    public int getCurrentInstructionAddress() {
        return output.size() - 1;
    }

    // STACK POINTER =======================

    /**
     * Set stackpointer to default value -1.
     */
    public void resetStackPointer(){
        stackPointer = -1;
    }

    /**
     * Method increment stackPointer
     */
    public void incStackPointer(){
        stackPointer ++;
    }

    /**
     * Method add value to stackPointer
     *
     * @param value which is add to stackPointer
     */
    public void incStackPointer(int value){
        stackPointer += value;
    }

    /**
     * Method decrement stackPointer.
     */
    public void decStackPointer(){
        stackPointer --;
    }

    /**
     * Method decrement value of stackPointer.
     */
    public void decStackPointer(int value){
        stackPointer -= value;
    }

    /**
     * Return actual value of stack pointer.
     *
     * @return value of stackPointer
     */
    public int getStackPointer() {
        return stackPointer;
    }

    // SCOPE NUMBER ========================

    /**
     * Return scope id.
     *
     * @return scopeId
     */
    public int getScopeId() {
        return scopeId;
    }

    /**
     * Method increment scopeId.
     */
    public void incScopeId() {
        scopeId++;
    }

    // VARIABLE COUNTER ====================

    /**
     * Set varCounter to default value 0.
     */
    public void resetVarCounter(){
        varCounter = 0;
    }

    /**
     * Return varCounter.
     * @return varCounter
     */
    public int getVarCounter(){
        return varCounter;
    }

    /**
     * Method increment varCounter.
     */
    public void incVarCounter(){
        varCounter++;
    }

    /**
     * Method increment varCounter about count.
     *
     * @param count size of increment
     */
    public void incVarCounter(int count){
        varCounter += count;
    }

    // SYMBOL TABLE OPERATIONS =============

    /**
     * Return object of Addressable which have input identifier and is in same scope or is defined globally
     *
     * @param identifier of searching object
     * @return found object or null
     */
    public Addressable symbolTableGet(String identifier) {
        Addressable res = symbolTable.get(hashIdentifier(identifier, getScopeId()));

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
    public void symbolTablePut(String identifier, Addressable addressable) {
        symbolTable.put(hashIdentifier(identifier, getScopeId()), addressable);
    }

    /**
     * Put input addressable to map with hashed key by function hashIdentifier
     *
     * @param identifier   of saving object
     * @param addressable  object which will be saved
     * @param scopeId level of scope
     */
    public void symbolTablePut(String identifier, Addressable addressable, int scopeId) {
        symbolTable.put(hashIdentifier(identifier, scopeId), addressable);
    }

    /**
     * Add before identifier scope id. New identifier is unique for scope.
     *
     * @param identifier   which will be hashed
     * @param scopeId number of scope
     * @return coded identifier
     */
    private String hashIdentifier(String identifier, int scopeId) {
        return scopeId + identifier;
    }
    
    // EXPRESSION DATA TYPE ================
    
    /**
     * push data type of atom or interim result onto the expression data type stack
     * 
     * @param type data type to be pushed onto the stack
     */
    public void pushDataType(DataType type) {
    	expDataTypeStack.push(type);
    }
    
    /**
     * pops data type of last item on the stack from the expression data type stack
     * 
     * @return popped data type of last item on the stack from the expression data type stack
     */
    public DataType popDataType() {
    	return expDataTypeStack.pop();
    }
    
    /**
     * peeks data type of last item on the stack from the expression data type stack
     * 
     * @return peeked data type of last item on the stack from the expression data type stack
     */
    public DataType peekDataType() {
    	return expDataTypeStack.peek();
    }
}
