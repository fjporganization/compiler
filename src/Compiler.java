
/**
 * Class providing compiler functionality
 */
public class Compiler extends CBaseListener{

	/**
	 * Instruction Increment(INT) which is at beginning of function.
	 * At the end of function is change operand to let space in stack for variables
	 */
	private Instruction intInstruction = null;

	/** Data which are shared across all compilers classes */
	private final CompilerData data;

	
	/**
	 * Constructor of Compiler
	 * @param data contains data which are shared with all compiler classes
	 */
	public Compiler(CompilerData data) {
		this.data = data;
	}


	@Override
	public void enterStartsymbol(CParser.StartsymbolContext ctx) {
		data.addInstruction(new Instruction(InstructionCodes.JUMP, 0 , 1));

		Instruction increment = new Instruction(InstructionCodes.INCREMENT, 0, CompilerData.BASE_FUNC_STACK_SIZE);
		data.addInstruction(increment);
		intInstruction = increment;

		data.incStackPointer(CompilerData.BASE_FUNC_STACK_SIZE);
	}

	@Override
	public void enterFunctiondeclaration(CParser.FunctiondeclarationContext ctx) {
		if (intInstruction != null){
			shiftInstructions();
			// first function in code is start function
			data.addInstruction(new Instruction(InstructionCodes.CALL, 0, data.getCurrentInstructionAddress()+3));
			data.addInstruction(new Instruction(InstructionCodes.RETURN, 0 ,0));
		}

		data.incNestingLevel();
		data.resetStackPointer();

		Instruction increment = new Instruction(InstructionCodes.INCREMENT, 0, CompilerData.BASE_FUNC_STACK_SIZE);
		data.addInstruction(increment);
		intInstruction = increment;

		data.incStackPointer(CompilerData.BASE_FUNC_STACK_SIZE);
	}

	@Override
	public void exitFunctiondeclaration(CParser.FunctiondeclarationContext ctx) {
		shiftInstructions();

		data.addInstruction(new Instruction(InstructionCodes.RETURN, 0 ,0));

		// TODO should be removed symbolTable.removeAll(is in data.getNestingLevel()); (ONLY FOR MEMORY OPTIMALIZATION)
	}



	private void shiftInstructions(){

		intInstruction.setOperand(intInstruction.getOperand() + data.getVarCounter());

		for (Instruction ins : data.toShift){
			ins.setOperand(ins.getOperand() + data.getVarCounter());
		}

		data.toShift.clear();

		data.resetVarCounter();
		intInstruction = null;
	}

	
	/*
	 * I/O 
	 */
	@Override
	public void exitInputinteger(CParser.InputintegerContext ctx) { 
		data.addInstruction(new Instruction(InstructionCodes.READ_INTEGER, 0, 0));
		data.incStackPointer();
	}
	
	@Override
	public void exitOutputinteger(CParser.OutputintegerContext ctx) { 
		data.addInstruction(new Instruction(InstructionCodes.WRITE_INTEGER, 0, 0));
		data.decStackPointer();
	}
	

}