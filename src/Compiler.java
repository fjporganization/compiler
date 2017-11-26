import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compiler extends CBaseListener{
		
	private int stackPointer;
	
	private int nestingLevel;
	
	private final Map<String, Addressable> symbolTable;
	
	private final String outputFileName;
	
	private final List<Instruction> output;
	
	public Compiler(String outputFileName) {
		this.stackPointer = 0;
		this.nestingLevel = 0;
		this.outputFileName = outputFileName;
		
		this.symbolTable = new HashMap<String, Addressable>();
		this.output = new ArrayList<Instruction>();
		this.output.add(null); //empty for the first jump (to the main function)
	}
	
	/*
	 * 
	 * ARITHMETICS
	 * 
	 */
	
	@Override 
	public void exitMulDivExp(CParser.MulDivExpContext ctx) {
		OperationCode operationCode = ctx.MULTIPLICATIONDIVISIONOPERATOR().getText().equals("*") ? 
				OperationCode.MULTIPLICATION : OperationCode.DIVISION;
				
		Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
		stackPointer--;
			
		output.add(instruction);
	}
	
	@Override 
	public void exitAddSubExp(CParser.AddSubExpContext ctx) { 
		OperationCode operationCode = ctx.ADDITIONSUBTRACTIONOPERATOR().getText().equals("+") ? 
				OperationCode.ADDITION : OperationCode.SUBTRACTION;
				
		Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
		stackPointer--;
			
		output.add(instruction);
	}
	
	@Override 
	public void exitNumericAtom(CParser.NumericAtomContext ctx) { 
		String literal = ctx.getText();
		Instruction instruction = new Instruction(InstructionCodes.PUSH, 0, literal);
		stackPointer++;
		output.add(instruction);
	}
	
	/*
	 * LOGIC
	 */
	
	@Override 
	public void exitLogicNegation(CParser.LogicNegationContext ctx) { 
		Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, OperationCode.NEGATION);
				
		//no change of stack pointer
		
		output.add(instruction);
	}
	
	@Override 
	public void exitRelationalLogicExp(CParser.RelationalLogicExpContext ctx) { 
		OperationCode operationCode = null;
		String operator = ctx.getText();
		
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
		stackPointer--;
		output.add(instruction);
	}
	
	@Override 
	public void exitEqualityLogicExp(CParser.EqualityLogicExpContext ctx) {
		int operationCode = -1;
		String operator = ctx.getText();
		
		switch(operator) {
		case "==": 
			operationCode = OperationCode.EQUALITY.getCode();
			break;
		case "!=": 
			operationCode = OperationCode.INEQUALITY.getCode();
			break;
		}
		
		Instruction instruction = new Instruction(InstructionCodes.OPERATION, 0, operationCode);
		stackPointer--;
		
		output.add(instruction);
	}
	
	@Override 
	public void exitLogicalAndExp(CParser.LogicalAndExpContext ctx) { 
		// TODO
	}
	
	@Override 
	public void exitLogicalOrExp(CParser.LogicalOrExpContext ctx) { 
		// TODO
	}
	
	@Override 
	public void exitLogicAtom(CParser.LogicAtomContext ctx) { 
		int value = ctx.LOGICALVALUE().getText().equals("true") ? 1 : 0;
		Instruction instruction = new Instruction(InstructionCodes.PUSH, 0, value);
		output.add(instruction);
	}
	
	/*
	 * DEFINITIONS
	 */
	
	@Override 
	public void exitDeclarationOnly(CParser.DeclarationOnlyContext ctx) { 
		String identifier = ctx.IDENTIFIER().getText();
		String dataType = ctx.TYPESPECIFIER().getText();
		int address = 0;
		int length = 0;
		DataType type = null;
		
		switch(dataType) {
		case "int":
			output.add(new Instruction(InstructionCodes.INCREMENT, 0, 1)); //allocate 1 local
			address = this.stackPointer;
			type = DataType.INT;
			length = 1;
			stackPointer++;
			break;
		}
		
		Variable var = new Variable(address, nestingLevel, identifier, length, type);
		symbolTable.put(identifier, var);
	}
	
	@Override 
	public void exitDeclarationAndInitialization(CParser.DeclarationAndInitializationContext ctx) { 
		String identifier = ctx.IDENTIFIER().getText();
		String dataType = ctx.TYPESPECIFIER().getText();
		int address = this.stackPointer;
		int length = 0;
		DataType type = null;
		
		switch(dataType) {
		case "int":
			type = DataType.INT;
			length = 1;
			break;
		}
		
		Variable variable = new Variable(address, nestingLevel, identifier, length, type);
		symbolTable.put(identifier, variable);
	}
	
	@Override 
	public void exitConstantdeclaration(CParser.ConstantdeclarationContext ctx) { 
		String identifier = ctx.IDENTIFIER().getText();
		String dataType = ctx.TYPESPECIFIER().getText();
		int address = this.stackPointer;
		int length = 0;
		DataType type = null;
		
		switch(dataType) {
		case "int":
			type = DataType.INT;
			length = 1;
			break;
		}
		
		Constant constant = new Constant(address, nestingLevel, identifier, length, type);
		symbolTable.put(identifier, constant);
	}
	
	/*
	 * ASSIGNMENTS
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
		
		//value of the assignment is on top of the stack, store value to address of variable
		Instruction instruction = new Instruction(InstructionCodes.STORE, 
				nestingLevel - variable.getNestingLevel(), variable.getAddress());
		
		output.add(instruction);
	}
	
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