import java.util.ArrayList;
import java.util.List;

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

    /** instruction whose operand need to be add about number of variables */
    public final List<Instruction> toShift;

    /** Number of variables which will be defined at the beginning of function/program */
    private int varCounter = 0;

    /**
     * Initialize data in class
     */
    public CompilerData(){
        resetStackPointer();
        this.nestingLevel = 0;

        this.output = new ArrayList<>();
        this.toShift = new ArrayList<>();
    }

    // OUTPUT INSTRUCTIONS =================

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
}
