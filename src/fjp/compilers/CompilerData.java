package fjp.compilers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fjp.structures.*;

/**
 * Class contains all data which are shared between Compiler classes.
 */
public class CompilerData {

    /** Number of function declaration instructions */
    public static final short BASE_FUNC_STACK_SIZE = 3;

    /** address of actual position of the stack (in the assembler) */
    private int stackPointer;

    /** current lexicographical level */
    private int nestingLevel;

    /** output instructions */
    private final List<Instruction> output;

    /** table of symbol */
    private final Map<String, Addressable> symbolTable;

    /** instruction whose operand need to be add about number of variables */
    public final List<Instruction> toShift;

    /** Number of variables which will be defined at the beginning of function/program */
    private int varCounter = 0;
    
    /** data type of the expression which is currently evaluated */
    private DataType currentExpDataType;

    /**
     * Initialize data in class
     */
    public CompilerData(){
        resetStackPointer();
        this.nestingLevel = 0;

        this.output = new ArrayList<>();
        this.toShift = new ArrayList<>();
        this.symbolTable = new HashMap<>();
    }

    // OUTPUT INSTRUCTIONS =================
    
    /**
     * Add input instruction to end of list of all instructions and change stack pointer.
     *
     * @param instruction instruction which will be add to list
     */
    public void addInstructionChangeStackPointer(Instruction instruction) {
    	addInstruction(instruction);
    	
    	if(instruction.getCode() == InstructionCodes.OPERATION) {
    		stackPointer += OperationCode.getOpCodeByCode(instruction.getOperand()).getIntegerStackChange();
    	}else if(instruction.getCode() == InstructionCodes.OPERATION_REAL) {
    		stackPointer += OperationCode.getOpCodeByCode(instruction.getOperand()).getRealStackChange();
    	}else if(instruction.getCode() == InstructionCodes.OPERATION_LOGIC) {
    		stackPointer += LogicCode.getOpCodeByCode(instruction.getOperand()).getStackChange();
    	}else if(instruction.getCode() == InstructionCodes.INCREMENT) {
    		stackPointer += instruction.getOperand();
    	}else {
    		stackPointer += instruction.getCode().getStackChange();
    	}
    	
    	System.out.println();
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
     * Return actual value of stack pointer.
     *
     * @return value of stackPointer
     */
    public int getStackPointer() {
        return stackPointer;
    }

    // SCOPE NUMBER ========================

    /**
     * Return nestingLevel.
     *
     * @return nestingLevel
     */
    public int getNestingLevel() {
        return nestingLevel;
    }

	/**
     * Method increment nestingLevel.
     */
    public void incNestingLevel() {
        nestingLevel++;
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

    // SYMBOL TABLE OPERATIONS =============

    /**
     * Return object of Addressable which have input identifier and is in same scope or is defined globally
     *
     * @param identifier of searching object
     * @return found object or null
     */
    public Addressable symbolTableGet(String identifier){
        Addressable res = symbolTable.get(hashIdentifier(identifier, getNestingLevel()));

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
    public void symbolTablePut(String identifier, Addressable addressable){
        symbolTable.put(hashIdentifier(identifier, getNestingLevel()), addressable);
    }

    /**
     * Put input addressable to map with hashed key by function hashIdentifier
     *
     * @param identifier of saving object
     * @param addressable object which will be saved
     * @param nestingLevel level of scope
     */
    public void symbolTablePut(String identifier, Addressable addressable, int nestingLevel){
        symbolTable.put(hashIdentifier(identifier, nestingLevel), addressable);
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
    
// EXPRESSION DATA TYPE ================
    
    /**
     * Return currentExpDataType
     * 
	 * @return the currentExpDataType
	 */
	public DataType getCurrentExpDataType() {
		return currentExpDataType;
	}

	/**
	 * Set currentExpDataType
	 * 
	 * @param currentExpDataType the currentExpDataType to set
	 */
	public void setCurrentExpDataType(DataType currentExpDataType) {
		this.currentExpDataType = currentExpDataType;
	}
}
