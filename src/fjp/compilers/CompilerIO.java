package fjp.compilers;

import fjp.generated.CBaseListener;
import fjp.generated.CParser;
import fjp.structures.DataType;
import fjp.structures.Instruction;
import fjp.structures.InstructionCodes;

/**
 * Class providing 
 * @author ondra
 *
 */
public class CompilerIO extends CBaseListener{
	
	private final CompilerData data;
	
	public CompilerIO(CompilerData data) {
		this.data = data;
	}

	@Override
	public void exitInputinteger(CParser.InputintegerContext ctx) { 
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.READ_INTEGER, 0, 0));
		data.pushDataType(DataType.INT);
	}
	
	@Override
	public void exitOutputinteger(CParser.OutputintegerContext ctx) { 
		if(data.popDataType() != DataType.INT) {
			System.err.println("Incompatible data types");
		}
		
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.WRITE_INTEGER, 0, 0));
	}
	
	@Override 
	public void exitInputfrac(CParser.InputfracContext ctx) { 
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.READ_FRAC, 0, 0));
		data.pushDataType(DataType.FRACTION);
	}
	
	@Override 
	public void exitOutputfrac(CParser.OutputfracContext ctx) {
		DataType exp = data.popDataType();
		
		if(exp == DataType.INT) {
			data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.PUSH, 0, 1));
		}else if(exp != DataType.FRACTION) {
			System.err.println("Incompatible data types");
		}
		
		data.addInstructionChangeStackPointer(new Instruction(InstructionCodes.WRITE_FRAC, 0, 0));
	}
}
