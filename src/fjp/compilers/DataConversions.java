package fjp.compilers;

import fjp.structures.DataType;
import fjp.structures.Instruction;
import fjp.structures.InstructionCodes;

/**
 * Provides functionality for data type conversions
 *
 */
public class DataConversions {
	
	
	/**
     * checks which data types are currently in the stack
     * eventually implicitly converts numeric values into same data types
     * 
     * @return data type of the result
     */
    public static DataType checkDataTypes(CompilerData data) {
    	DataType right = data.popDataType();
    	DataType left = data.popDataType();
    	
    	if(left == DataType.BOOLEAN && right == DataType.BOOLEAN) {
    		return DataType.BOOLEAN;
    		
    	}else if(left == DataType.INT && right == DataType.INT) {
    		return DataType.INT;
    		
    	}else if(left == DataType.FRACTION && right == DataType.FRACTION) {
    		return DataType.FRACTION;
    		
    	}else if(left == DataType.FRACTION && right == DataType.INT) {
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.PUSH, 0, 1));
    		return DataType.FRACTION;
    		
    	}else if(left == DataType.INT && right == DataType.FRACTION) {
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 1));
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.PUSH, 0, 1));
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.LOAD, 0, data.getStackPointer() - 2));
    		return DataType.FRACTION;
    		
    	}else {
    		System.err.println("Incompatible data types");
        	System.exit(1);
    	}
    	return null;
    }
}
