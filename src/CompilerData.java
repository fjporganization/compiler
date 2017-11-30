import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * Class contains all data which are shared between Compiler classes.
 */
public class CompilerData {

    /**
     * address of actual position of the stack (in the assembler)
     */
    private int stackPointer;

    /**
     * current lexicographical level
     */
    private int nestingLevel;

    /**
     * output instructions
     */
    private final List<Instruction> output;

    /**
     * Initialize data in class
     */
    public CompilerData(){
        this.stackPointer = -1;
        this.nestingLevel = 0;

        this.output = new ArrayList<>();
    }

    /**
     * Returns address of last added instructio.
     * @return address of last added instructio
     */
    public int getCurrentInstructionAddress() {
        return output.size() - 1;
    }

    /**
     * writes generated instructions into the output file
     */
    public void writeToFile(String outputFileName) {
        Writer bw = null;
        int currentAddress = 0;

        try {
            bw = new BufferedWriter(new FileWriter(outputFileName));
            for(Instruction instruction : output) {
                if(instruction != null) {
                    bw.write(currentAddress + " " + instruction.toString() + "\n");
                    currentAddress++;
                }
            }

        } catch (IOException e) {
            System.err.println("Cannot write to the output file");
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                System.err.println("Cannot close the output file");
            }
        }
    }

    /**
     * Add input instruction to end of list of all instructions.
     * @param instruction instruction which will be add to list
     */
    public void addInstruction(Instruction instruction){
        output.add(instruction);
    }

    /**
     * Method increment stackPointer
     */
    public void incStackPointer(){
        stackPointer ++;
    }

    /**
     * Method decrement stackPointer.
     */
    public void decStackPointer(){
        stackPointer --;
    }

    /**
     * Return actual value of stack pointer.
     * @return value of stackPointer
     */
    public int getStackPointer() {
        return stackPointer;
    }


    /**
     * Return nestingLevel.
     * @return nestingLevel
     */
    public int getNestingLevel() {
        return nestingLevel;
    }
}