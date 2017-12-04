package fjp.compilers;

import fjp.structures.Instruction;
import fjp.structures.InstructionCodes;

/**
 * Provides functionality for manipulating stack last added values (indexing stack from the end)
 *
 */
public class StackEndManipulations {
	
	/**
     * Adds instructions to load value from the stack at the given position from the end of the stack
     * @param position position from end of the stack
     * @param data compiler data shared across all compiler classes
     */
	public static void loadFromStackEnd(int position, CompilerData data) {
    	Instruction instruction = new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - position);
		data.toShift.add(instruction);
		data.addInstructionChangeStackPointer(instruction);
    }
    
    /**
     * Adds instructions to store value into the stack at the given position from the end of the stack
     * @param position position from end of the stack
     * @param data compiler data shared across all compiler classes
     */
    public static void storeAtStackEnd(int position, CompilerData data) {
    	Instruction instruction = new Instruction(InstructionCodes.STORE, 0, data.getStackPointer() - position);
		data.toShift.add(instruction);
		data.addInstructionChangeStackPointer(instruction);
    }

}
