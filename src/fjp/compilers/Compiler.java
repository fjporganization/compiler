package fjp.compilers;

import fjp.generated.*;
import fjp.structures.*;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Class providing compiler functionality
 */
public class Compiler extends CBaseListener {

	/**
	 * Instruction Increment(INT) which is at beginning of function.
	 * At the end of function is change operand to let space in stack for variables
	 */
	private Instruction intInstruction = null;

	private int intInstructionAdr = 0;

	/** Data which are shared across all compilers classes */
	private final CompilerData data;

	private final List<Pair<String, Instruction>> funcCalls;

	
	/**
	 * Constructor of Compiler
	 * @param data contains data which are shared with all compiler classes
	 */
	public Compiler(CompilerData data) {
		this.data = data;

		funcCalls = new ArrayList<>();
	}


	@Override
	public void enterStartsymbol(CParser.StartsymbolContext ctx) {
		data.addInstruction(new Instruction(InstructionCodes.JUMP, 0 , 1));

		Instruction increment = new Instruction(InstructionCodes.INCREMENT, 0, CompilerData.BASE_FUNC_STACK_SIZE);
		data.addInstruction(increment);
		intInstruction = increment;
		intInstructionAdr = data.getCurrentInstructionAddress();

		data.incStackPointer(CompilerData.BASE_FUNC_STACK_SIZE);
	}

	@Override
	public void exitStartsymbol(CParser.StartsymbolContext ctx) {

		for(Pair<String, Instruction> pair : funcCalls){

			Addressable func = data.symbolTableGet(pair.getKey());

			if(func == null) {
				System.err.println("Unknown function identifier: " + pair.getKey());
				System.exit(1);
			}

			if(!(func instanceof Function)) {
				System.err.println(pair.getKey() + "is not function");
				System.exit(1);
			}

			pair.getValue().setOperand(func.getAddress());
		}

		funcCalls.clear();
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

		// add increment instruction
		Instruction increment = new Instruction(InstructionCodes.INCREMENT, 0, CompilerData.BASE_FUNC_STACK_SIZE);
		data.addInstruction(increment);
		intInstruction = increment;
		intInstructionAdr = data.getCurrentInstructionAddress();

		data.incStackPointer(CompilerData.BASE_FUNC_STACK_SIZE);
	}

	@Override
	public void exitFunctiondeclaration(CParser.FunctiondeclarationContext ctx) {
		// add identifier to identifier table
		String identifier = ctx.IDENTIFIER().getText();

		if(data.symbolTableGet(identifier) != null) {
			System.err.println("Identifier " + identifier + " is already declared");
		}

		Function func = new Function(intInstructionAdr, identifier);
		data.symbolTablePut(identifier, func, 0);

		shiftInstructions();

		data.addInstruction(new Instruction(InstructionCodes.RETURN, 0 ,0));

		// TODO should be removed symbolTable.removeAll(is in data.getNestingLevel()); (ONLY FOR MEMORY OPTIMALIZATION)
	}

	@Override
	public void exitFunctioncall(CParser.FunctioncallContext ctx) {
		String identifier = ctx.IDENTIFIER().getText();

		Instruction call = new Instruction(InstructionCodes.CALL, 0, 0);
		data.addInstruction(call);
		funcCalls.add(new Pair<>(identifier, call));
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
}