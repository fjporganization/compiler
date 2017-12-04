package fjp.compilers;

import fjp.structures.DataType;
import fjp.structures.Instruction;
import fjp.structures.InstructionCodes;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Provides functionality for data type conversions
 *
 */
public class DataConversions {
	
	
	/**
     * checks which data types are currently in the stack
     * eventually implicitly converts numeric values into same data types
     * 
     * @param data compiler data shared across all compiler classes
     * @param ctx parser context used for throwing eventual error
     * 
     * @return data type of the result
     */
    public static DataType checkDataTypes(CompilerData data, ParserRuleContext ctx) {
    	DataType right = data.popDataType();
    	DataType left = data.popDataType();
    	
    	if(left == right) {
    		return left;
    		
    	}else if(left == DataType.FRACTION && right == DataType.INT) { //convert right integer to ratio
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.PUSH, 0, 1));
    		return DataType.FRACTION;
    		
    	}else if(left == DataType.INT && right == DataType.FRACTION) { //convert left integer to ratio
    		StackEndManipulations.loadFromStackEnd(1, data);
    		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.PUSH, 0, 1));
    		StackEndManipulations.storeAtStackEnd(3, data);
    		
    		StackEndManipulations.loadFromStackEnd(1, data);
    		StackEndManipulations.loadFromStackEnd(1, data);
    		
    		StackEndManipulations.storeAtStackEnd(3, data);
    		StackEndManipulations.storeAtStackEnd(1, data);
    		
    		return DataType.FRACTION;
    		
    	}else {
    		Error.throwError(ctx, "Cannot implicitly convert " + left + " and " + right + " to the same data type");
    	}
    	return null;
    }
}
