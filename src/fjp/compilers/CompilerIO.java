package fjp.compilers;

import fjp.generated.CBaseListener;
import fjp.generated.CParser;
import fjp.structures.DataType;
import fjp.structures.Instruction;
import fjp.structures.InstructionCodes;

/**
 * Class providing IO operations parsing
 *
 */
public class CompilerIO extends CBaseListener{
	
	/** compiler data shared across all compiler classes */
	private final CompilerData data;
	
	/**
	 * Constructor
	 * @param data compiler data shared across all compiler classes 
	 */
	public CompilerIO(CompilerData data) {
		this.data = data;
	}

	/**
	 * Processes integer input (adds instructions for input)
	 */
	@Override
	public void exitInputinteger(CParser.InputintegerContext ctx) { 
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.READ_INTEGER, 0, 0));
		data.pushDataType(DataType.INT);
	}
	
	/**
	 * Processes integer output
	 */
	@Override
	public void exitOutputinteger(CParser.OutputintegerContext ctx) { 
		if(data.popDataType() != DataType.INT) {
			Error.throwError(ctx, "Incompatible data type for integer output");
		}
		
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.WRITE_INTEGER, 0, 0));
	}
	
	/**
	 * Processes fraction input (adds instructions for input)
	 */
	@Override 
	public void exitInputfrac(CParser.InputfracContext ctx) { 
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.READ_FRAC, 0, 0));
		data.pushDataType(DataType.FRACTION);
	}
	
	/**
	 * Processes fraction output
	 */
	@Override 
	public void exitOutputfrac(CParser.OutputfracContext ctx) {
		DataType exp = data.popDataType();
		
		if(exp == DataType.INT) {
			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.PUSH, 0, 1));
		}else if(exp != DataType.FRACTION) {
			Error.throwError(ctx, "Incompatible data type for ratio output");
		}
		
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.WRITE_FRAC, 0, 0));
	}
}
