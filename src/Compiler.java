import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Class providing compiler functionality
 *
 */
public class Compiler extends CBaseListener{
	
	/**
	 * address of actual position of the stack (in the assembler)
	 */
	private int stackPointer;
	
	/**
	 * current lexicographical level
	 */
	private int nestingLevel;
	
	/**
	 * table of symbol
	 */
	private final Map<String, Addressable> symbolTable;
	
	/**
	 * name of the output file with compiled code
	 */
	private final String outputFileName;
	
	/**
	 * output instructions
	 */
	private final List<Instruction> output;
	
	/**
	 * used for storing instructions, in which will be changed operands 
	 * (e.g. changing address of conditional jump instruction created on 
	 * entering if statement at the time of exiting if statement)
	 */
	private final Stack<Instruction> instructionStack;
	
	/**
	 * Constructor of Compiler
	 * @param outputFileName name of the output file with compiled code
	 */
	public Compiler(String outputFileName) {
		this.stackPointer = -1;
		this.nestingLevel = 0;
		this.outputFileName = outputFileName;
		
		this.symbolTable = new HashMap<String, Addressable>();
		this.output = new ArrayList<Instruction>();
		this.instructionStack = new Stack<Instruction>();
	}
	
	/*
	 * 
	 * ARITHMETIC
	 * 
	 */
	
	@Override 
	/**
	 * Processes arithmetic expressions which contains multiplication or division
	 */
	public void exitMulDivExp(CParser.MulDivExpContext ctx) {
		OperationCode operationCode = ctx.MULTIPLICATIONDIVISIONOPERATOR().getText().equals("*") ? 
				OperationCode.MULTIPLICATION : OperationCode.DIVISION;
				
		Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
		//instruction pops 2 values from the stack (operands) and push 1 value (result)  
		stackPointer--; 
			
		output.add(instruction);
	}
	
	@Override 
	/**
	 * Processes arithmetic expressions which contains addition or subtraction
	 */
	public void exitAddSubExp(CParser.AddSubExpContext ctx) { 
		OperationCode operationCode = ctx.ADDITIONSUBTRACTIONOPERATOR().getText().equals("+") ? 
				OperationCode.ADDITION : OperationCode.SUBTRACTION;
				
		Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
		//instruction pops 2 values from the stack (operands) and push 1 value (result)
		stackPointer--;
			
		output.add(instruction);
	}
	
	@Override 
	/**
	 * Processes numeric atom (single numeric value) (pushes the value of the variable onto the stack)
	 */
	public void exitNumericAtom(CParser.NumericAtomContext ctx) {
		//load given literal onto the stack
		String literal = ctx.getText();
		Instruction instruction = new Instruction(InstructionCodes.PUSH, 0, literal);
		
		//instruction push 1 value onto the stack
		stackPointer++;
		output.add(instruction);
	}
	
	@Override 
	/**
	 * Processes atom identified by identifier (pushes the value of the variable onto the stack)
	 */
	public void exitIdentifierAtom(CParser.IdentifierAtomContext ctx) {
		//load varible or constant identified by identifier onto the stack
		String identifier = ctx.IDENTIFIER().getText();
		Addressable variable = symbolTable.get(identifier);
		
		if(variable == null) {
			System.err.println(identifier + " is unknown");
			System.exit(1);
		}
		
		//check if identifier is not name of function
		if(!(variable instanceof Variable || variable instanceof Constant)) {
			System.err.println(identifier + " is not constant or variable");
			System.exit(1);
		}
		
		Instruction instruction = new Instruction(InstructionCodes.LOAD, 
				nestingLevel - variable.getNestingLevel(), variable.getAddress());
		
		//instruction push 1 value onto the stack
		stackPointer++;
		output.add(instruction);
	}
	
	/*
	 * LOGIC
	 */
	
	@Override 
	/**
	 * Processes logic negation
	 */
	public void exitLogicNegation(CParser.LogicNegationContext ctx) { 
		Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, OperationCode.NEGATION);		
		//no change of stack pointer
		output.add(instruction);
	}
	
	@Override
	/**
	 * Processes logic expression which contains relational operator
	 */
	public void exitRelationalLogicExp(CParser.RelationalLogicExpContext ctx) { 
		OperationCode operationCode = null;
		String operator = ctx.RELATIONALOPERATOR().getText();
		
		switch(operator) {
		case ">": 
			operationCode = OperationCode.GREATER_THAN;
			break;
		case ">=": 
			operationCode = OperationCode.GREATER_EQUAL;
			break;
		case "<": 
			operationCode = OperationCode.LESS_THAN;
			break;
		case "<=": 
			operationCode = OperationCode.LESS_EQUAL;
			break;
		}
		
		Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
		
		//instruction pops 2 values from the stack (operands) and push 1 value (result)
		stackPointer--;
		output.add(instruction);
	}
	
	@Override 
	/**
	 * Processes logic expression which contains equality operator
	 */
	public void exitEqualityLogicExp(CParser.EqualityLogicExpContext ctx) {
		int operationCode = -1;
		String operator = ctx.EQUALITYOPERATOR().getText();
		
		switch(operator) {
		case "==": 
			operationCode = OperationCode.EQUALITY.getCode();
			break;
		case "!=": 
			operationCode = OperationCode.INEQUALITY.getCode();
			break;
		}
		
		Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
		//instruction pops 2 values from the stack (operands) and push 1 value (result)
		stackPointer--;
		
		output.add(instruction);
	}
	
	@Override 
	/**
	 * Processes logic expression which contains AND operator
	 */
	public void exitLogicalAndExp(CParser.LogicalAndExpContext ctx) { 
		output.add(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.ADDITION));
		stackPointer--;
		// sum of two trues must be 2 (T = true = 1; F = false = 0)
		output.add(new Instruction(InstructionCodes.PUSH, 0, 2));
		stackPointer++;
		
		output.add(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.EQUALITY));
		stackPointer--;
	}
	
	@Override 
	/**
	 * Processes logic expression which contains OR operator
	 */
	public void exitLogicalOrExp(CParser.LogicalOrExpContext ctx) { 
		output.add(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.ADDITION));
		stackPointer--;
		// sum of (T,T | T,F | F,T) must be >= 1 (T = true = 1; F = false = 0)
		output.add(new Instruction(InstructionCodes.PUSH, 0, 1));
		stackPointer++;
		output.add(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.GREATER_EQUAL));
		stackPointer--;
	}
	
	@Override
	/**
	 * Processes logic literal atom
	 */
	public void exitLogicAtom(CParser.LogicAtomContext ctx) { 
		int value = ctx.LOGICALVALUE().getText().equals("true") ? 1 : 0;
		Instruction instruction = new Instruction(InstructionCodes.PUSH, 0, value);
		stackPointer++;
		output.add(instruction);
	}
	
	/*
	 * DEFINITIONS
	 */
	
	@Override 
	/**
	 * Processes variable declaration without initialization
	 */
	public void exitDeclarationOnly(CParser.DeclarationOnlyContext ctx) { 
		String identifier = ctx.IDENTIFIER().getText();
		String dataType = ctx.TYPESPECIFIER().getText();
		int length = 0;
		DataType type = null;
		
		if(symbolTable.get(identifier) != null) {
			System.err.println("Identifier " + identifier + " is already declared");
		}
		
		switch(dataType) {
		case "int":
			type = DataType.INT;
			length = 0; //int has no overlap in the stack
			break;
		}
		
		Variable var = new Variable(nestingLevel, identifier, length, type);
		symbolTable.put(identifier, var);
	}
	
	@Override
	/**
	 * Processes variable declaration with initialization
	 */
	public void exitDeclarationAndInitialization(CParser.DeclarationAndInitializationContext ctx) { 
		String identifier = ctx.IDENTIFIER().getText();
		String dataType = ctx.TYPESPECIFIER().getText();
		int address = this.stackPointer;
		int length = 0;
		DataType type = null;
		
		if(symbolTable.get(identifier) != null) {
			System.err.println("Identifier " + identifier + " is already declared");
		}
		
		switch(dataType) {
		case "int":
			type = DataType.INT;
			length = 0; //int has no overlap in the stack
			break;
		}
		
		Variable variable = new Variable(address, nestingLevel, identifier, length, type);
		symbolTable.put(identifier, variable);
	}
	
	@Override 
	/**
	 * Processes constant declaration with initialization
	 */
	public void exitConstantdeclaration(CParser.ConstantdeclarationContext ctx) { 
		String identifier = ctx.IDENTIFIER().getText();
		String dataType = ctx.TYPESPECIFIER().getText();
		int address = this.stackPointer; // the value is already on the top of the stack
		int length = 0;
		DataType type = null;
		
		if(symbolTable.get(identifier) != null) {
			System.err.println("Identifier " + identifier + " is already declared");
		}
		
		switch(dataType) {
		case "int":
			type = DataType.INT;
			length = 0; //int has no overlap in the stack
			break;
		}
		
		Constant constant = new Constant(address, nestingLevel, identifier, length, type);
		symbolTable.put(identifier, constant);
	}
	
	/*
	 * ASSIGNMENTS
	 */
	
	@Override
	/**
	 * Processes variable assignment
	 */
	public void exitStandardAssignment(CParser.StandardAssignmentContext ctx) { 
		String identifier =  ctx.IDENTIFIER().getText();
		
		Addressable variable = symbolTable.get(identifier);
		
		if(variable == null) {
			System.err.println("Unknown identifier: " + identifier);
			System.exit(1);
		}
		
		if(!(variable instanceof Variable)) {
			System.err.println(identifier + "is not variable");
			System.exit(1);
		}
		
		//value of the assignment is on top of the stack, store current stack pointer
		variable.setAddress(stackPointer);
	}
	
	/*
	 * IF CONDITIONS
	 */
	@Override 
	/**
	 * Processes beginning of the simple condition statement
	 * Prepares instruction with conditional jump, address to conditional 
	 * jump will be completed after processing the statements block
	 */
	public void enterSimplecondition(CParser.SimpleconditionContext ctx) { 
		//method is called AFTER parser processed block 'if(condition)' so condition is already processed
		Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0);
		// pops one value
		stackPointer--;
		output.add(conditionalJump);
		instructionStack.add(conditionalJump);
	}
	
	@Override 
	/**
	 * Processes end of the simple condition statement
	 * Completes instruction with conditional jump - adds address to conditional 
	 * jump beyond the statements block
	 */
	public void exitSimplecondition(CParser.SimpleconditionContext ctx) { 
		Instruction conditionalJump = instructionStack.pop();
		conditionalJump.setOperand(getCurrentInstructionAddress() + 1);
	}
	
	/*
	 * IF ELSE CONDITION 
	 */
	@Override
	/**
	 * Processes beginning of the if-else condition statement
	 * Prepares instruction with conditional jump, address to conditional 
	 * jump will be completed after processing the assertive branch statements block
	 */
	public void enterIfelsecondition(CParser.IfelseconditionContext ctx) { 
		//method is called AFTER parser processed block 'if(condition)' so condition is already processed
		Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0);
		stackPointer--;
		output.add(conditionalJump);
		instructionStack.add(conditionalJump);
	}
	
	@Override 
	/**
	 * Processes end of the if-else condition assertive branch
	 * Completes instruction with conditional jump - adds address to conditional 
	 * jump beyond the assertive branch statements block
	 */
	public void exitAssertivebranch(CParser.AssertivebranchContext ctx) { 
		Instruction conditionalJump = instructionStack.pop();
		// must jump to instruction beyond instruction for unconditional jump beyond negative branch, therefore +2  
		conditionalJump.setOperand(getCurrentInstructionAddress() + 2);
		
		// jump beyond negative branch
		Instruction jump = new Instruction(InstructionCodes.JUMP, 0);
		output.add(jump);
		instructionStack.add(jump);
	}
	
	@Override
	/**
	 * Processes end of the if-else condition negative branch
	 * Completes instruction with jump on the end of assertive branch - 
	 * adds address to jump beyond the negative branch statements block
	 */
	public void exitNegativebranch(CParser.NegativebranchContext ctx) { 
		Instruction jump = instructionStack.pop();
		jump.setOperand(getCurrentInstructionAddress() + 1);
	}
	
	/**
	 * returns address of last added instructio
	 * @return address of last added instructio
	 */
	public int getCurrentInstructionAddress() {
		return output.size() - 1;
	}
	
	/**
	 * writes generated instructions into the output file
	 */
	public void writeToFile() {
		Writer bw = null;
		int currentAddress = 0;
		
		try {
			bw = new BufferedWriter(new FileWriter(this.outputFileName));
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
}