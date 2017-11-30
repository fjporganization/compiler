import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Class providing compiler functionality
 *
 */
public class Compiler extends CBaseListener{
	
	/**
	 * table of symbol
	 */
	private final Map<String, Addressable> symbolTable;

	/**
	 * used for storing instructions, in which will be changed operands 
	 * (e.g. changing address of conditional jump instruction created on 
	 * entering if statement at the time of exiting if statement)
	 */
	private final Stack<Instruction> instructionStack;

	private final Stack<Integer> addressStack;
	
	private final CompilerData data;
	
	/**
	 * Constructor of Compiler
	 * @param data contains data which are shared with all compiler classes
	 */
	public Compiler(CompilerData data) {
		this.data = data;
		this.symbolTable = new HashMap<String, Addressable>();
		this.instructionStack = new Stack<Instruction>();
		this.addressStack = new Stack<>();
	}
	
	/*
	 * 
	 * ARITHMETIC
	 * 
	 */
	

	/**
	 * Processes arithmetic expressions which contains multiplication or division
	 */
	@Override
	public void exitMulDivExp(CParser.MulDivExpContext ctx) {
		OperationCode operationCode = ctx.MULTIPLICATIONDIVISIONOPERATOR().getText().equals("*") ? 
				OperationCode.MULTIPLICATION : OperationCode.DIVISION;
				
		Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
		//instruction pops 2 values from the stack (operands) and push 1 value (result)  
		data.decStackPointer(); 
			
		data.addInstruction(instruction);
	}
	

	/**
	 * Processes arithmetic expressions which contains addition or subtraction
	 */
	@Override
	public void exitAddSubExp(CParser.AddSubExpContext ctx) { 
		OperationCode operationCode = ctx.ADDITIONSUBTRACTIONOPERATOR().getText().equals("+") ? 
				OperationCode.ADDITION : OperationCode.SUBTRACTION;
				
		Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
		//instruction pops 2 values from the stack (operands) and push 1 value (result)
		data.decStackPointer();
			
		data.addInstruction(instruction);
	}
	

	/**
	 * Processes numeric atom (single numeric value) (pushes the value of the variable onto the stack)
	 */
	@Override
	public void exitNumericAtom(CParser.NumericAtomContext ctx) {
		//load given literal onto the stack
		String literal = ctx.getText();
		Instruction instruction = new Instruction(InstructionCodes.PUSH, 0, literal);
		
		//instruction push 1 value onto the stack
		data.incStackPointer();
		data.addInstruction(instruction);
	}
	

	/**
	 * Processes atom identified by identifier (pushes the value of the variable onto the stack)
	 */
	@Override
	public void exitIdentifierAtom(CParser.IdentifierAtomContext ctx) {
		//load variable or constant identified by identifier onto the stack
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
				data.getNestingLevel() - variable.getNestingLevel(), variable.getAddress());
		
		//instruction push 1 value onto the stack
		data.incStackPointer();
		data.addInstruction(instruction);
	}
	
	/*
	 * LOGIC
	 */
	

	/**
	 * Processes logic negation
	 */
	@Override
	public void exitLogicNegation(CParser.LogicNegationContext ctx) { 
		Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, OperationCode.LOGIC_NEGATION);		
		//no change of stack pointer
		data.addInstruction(instruction);
	}
	

	/**
	 * Processes logic expression which contains relational operator
	 */
	@Override
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
		data.decStackPointer();
		data.addInstruction(instruction);
	}
	

	/**
	 * Processes logic expression which contains equality operator
	 */
	@Override
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
		data.decStackPointer();
		
		data.addInstruction(instruction);
	}
	

	/**
	 * Processes logic expression which contains AND operator
	 */
	@Override
	public void exitLogicalAndExp(CParser.LogicalAndExpContext ctx) { 
		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.ADDITION));
		data.decStackPointer();
		// sum of two trues must be 2 (T = true = 1; F = false = 0)
		data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, 2));
		data.incStackPointer();
		
		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.EQUALITY));
		data.decStackPointer();
	}
	

	/**
	 * Processes logic expression which contains OR operator
	 */
	@Override
	public void exitLogicalOrExp(CParser.LogicalOrExpContext ctx) { 
		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.ADDITION));
		data.decStackPointer();
		// sum of (T,T | T,F | F,T) must be >= 1 (T = true = 1; F = false = 0)
		data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, 1));
		data.incStackPointer();
		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.GREATER_EQUAL));
		data.decStackPointer();
	}
	

	/**
	 * Processes logic literal atom
	 */
	@Override
	public void exitLogicAtom(CParser.LogicAtomContext ctx) { 
		int value = ctx.LOGICALVALUE().getText().equals("true") ? 1 : 0;
		Instruction instruction = new Instruction(InstructionCodes.PUSH, 0, value);
		data.incStackPointer();
		data.addInstruction(instruction);
	}
	
	/*
	 * DEFINITIONS
	 */
	

	/**
	 * Processes variable declaration without initialization
	 */
	@Override
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
		case "boolean":
			type = DataType.BOOLEAN;
			length = 0; //boolean has no overlap in the stack
			break;
		}
		
		Variable var = new Variable(data.getNestingLevel(), identifier, length, type);
		symbolTable.put(identifier, var);
	}
	

	/**
	 * Processes variable declaration with initialization
	 */
	@Override
	public void exitDeclarationAndInitialization(CParser.DeclarationAndInitializationContext ctx) { 
		String identifier = ctx.IDENTIFIER().getText();
		String dataType = ctx.TYPESPECIFIER().getText();
		int address = data.getStackPointer();
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
		case "boolean":
			type = DataType.BOOLEAN;
			length = 0; //boolean has no overlap in the stack
			break;
		}
		
		Variable variable = new Variable(address, data.getNestingLevel(), identifier, length, type);
		symbolTable.put(identifier, variable);
	}
	

	/**
	 * Processes constant declaration with initialization
	 */
	@Override
	public void exitConstantdeclaration(CParser.ConstantdeclarationContext ctx) { 
		String identifier = ctx.IDENTIFIER().getText();
		String dataType = ctx.TYPESPECIFIER().getText();
		int address = data.getStackPointer(); // the value is already on the top of the stack
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
		case "boolean":
			type = DataType.BOOLEAN;
			length = 0; //boolean has no overlap in the stack
			break;
		}
		
		Constant constant = new Constant(address, data.getNestingLevel(), identifier, length, type);
		symbolTable.put(identifier, constant);
	}
	
	/*
	 * ASSIGNMENTS
	 */
	

	/**
	 * Processes variable assignment
	 */
	@Override
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
		variable.setAddress(data.getStackPointer());
	}
	
	/*
	 * IF CONDITIONS
	 */

	/**
	 * Processes beginning of the simple condition statement
	 * Prepares instruction with conditional jump, address to conditional 
	 * jump will be completed after processing the statements block
	 */
	@Override
	public void enterSimplecondition(CParser.SimpleconditionContext ctx) { 
		//method is called AFTER parser processed block 'if(condition)' so condition is already processed
		Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0);
		// pops one value
		data.decStackPointer();
		data.addInstruction(conditionalJump);
		instructionStack.add(conditionalJump);
	}
	

	/**
	 * Processes end of the simple condition statement
	 * Completes instruction with conditional jump - adds address to conditional 
	 * jump beyond the statements block
	 */
	@Override
	public void exitSimplecondition(CParser.SimpleconditionContext ctx) { 
		Instruction conditionalJump = instructionStack.pop();
		conditionalJump.setOperand(data.getCurrentInstructionAddress() + 1);
	}
	
	/*
	 * IF ELSE CONDITION 
	 */

	/**
	 * Processes beginning of the if-else condition statement
	 * Prepares instruction with conditional jump, address to conditional 
	 * jump will be completed after processing the assertive branch statements block
	 */
	@Override
	public void enterIfelsecondition(CParser.IfelseconditionContext ctx) { 
		//method is called AFTER parser processed block 'if(condition)' so condition is already processed
		Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0);
		data.decStackPointer();
		data.addInstruction(conditionalJump);
		instructionStack.add(conditionalJump);
	}
	

	/**
	 * Processes end of the if-else condition assertive branch
	 * Completes instruction with conditional jump - adds address to conditional 
	 * jump beyond the assertive branch statements block
	 */
	@Override
	public void exitAssertivebranch(CParser.AssertivebranchContext ctx) { 
		Instruction conditionalJump = instructionStack.pop();
		// must jump to instruction beyond instruction for unconditional jump beyond negative branch, therefore +2  
		conditionalJump.setOperand(data.getCurrentInstructionAddress() + 2);
		
		// jump beyond negative branch
		Instruction jump = new Instruction(InstructionCodes.JUMP, 0);
		data.addInstruction(jump);
		instructionStack.add(jump);
	}
	

	/**
	 * Processes end of the if-else condition negative branch
	 * Completes instruction with jump on the end of assertive branch - 
	 * adds address to jump beyond the negative branch statements block
	 */
	@Override
	public void exitNegativebranch(CParser.NegativebranchContext ctx) { 
		Instruction jump = instructionStack.pop();
		jump.setOperand(data.getCurrentInstructionAddress() + 1);
	}

	@Override
	public void enterWhilestatement(CParser.WhilestatementContext ctx) {
		//method is called AFTER parser processed block 'if(condition)' so condition is already processed
		Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, -1);
		data.decStackPointer();
		data.addInstruction(conditionalJump);
		instructionStack.push(conditionalJump);
	}

	@Override
	public void exitWhilestatement(CParser.WhilestatementContext ctx) {

		instructionStack.pop().setOperand(data.getCurrentInstructionAddress() + 2);
		data.addInstruction(new Instruction(InstructionCodes.JUMP, 0, addressStack.pop()));
	}

	@Override
	public void enterWhileloop(CParser.WhileloopContext ctx) {
		addressStack.push(data.getCurrentInstructionAddress() + 1);
	}

	@Override
	public void enterDowhileloop(CParser.DowhileloopContext ctx) {
		addressStack.push(data.getCurrentInstructionAddress() + 1);
	}

	@Override
	public void exitDowhileloop(CParser.DowhileloopContext ctx) {
		// JMC - jump on zero -> need to neg. resutl
		data.addInstruction(new Instruction(InstructionCodes.PUSH, 0, 0));
		data.addInstruction(new Instruction(InstructionCodes.OPERATION, 0, OperationCode.EQUALITY));
		data.addInstruction(new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, addressStack.pop()));
		data.decStackPointer();
	}

	@Override
	public void exitForinitialization(CParser.ForinitializationContext ctx) {
		addressStack.push(data.getCurrentInstructionAddress() + 1);
	}

	@Override
	public void enterForafterthought(CParser.ForafterthoughtContext ctx) {
		Instruction conditionalJump = new Instruction(InstructionCodes.CONDITIONAL_JUMP, 0, -1);
		data.decStackPointer();
		data.addInstruction(conditionalJump);
		instructionStack.push(conditionalJump);

		Instruction jump = new Instruction(InstructionCodes.JUMP, 0, -1);
		data.addInstruction(jump);
		instructionStack.push(jump);

		addressStack.push(data.getCurrentInstructionAddress() + 1);
	}

	@Override
	public void exitForafterthought(CParser.ForafterthoughtContext ctx) {

		int temp = addressStack.pop();

		Instruction jump = new Instruction(InstructionCodes.JUMP, 0, addressStack.pop());
		data.addInstruction(jump);

		addressStack.push(temp);

		instructionStack.pop().setOperand(data.getCurrentInstructionAddress() + 1);
	}

	@Override
	public void exitForloop(CParser.ForloopContext ctx) {

		Instruction jump = new Instruction(InstructionCodes.JUMP, 0, addressStack.pop());
		data.addInstruction(jump);

		instructionStack.pop().setOperand(data.getCurrentInstructionAddress() + 1);
	}
	
	@Override
	public void exitInputinteger(CParser.InputintegerContext ctx) { 
		data.addInstruction(new Instruction(InstructionCodes.READ_INTEGER, 0, 0));
	}
	
	@Override
	public void exitOutputinteger(CParser.OutputintegerContext ctx) { 
		data.addInstruction(new Instruction(InstructionCodes.WRITE_INTEGER, 0, 0));
	}
}