package fjp.structures;

public class Instruction {
	
	private final InstructionCodes code;
	
	private final int nestingLevel;
	
	private int operand;
	
	public Instruction(InstructionCodes code, int nestingLevel) {
		this.code = code;
		this.nestingLevel = nestingLevel;
	}

	public Instruction(InstructionCodes code, int nestingLevel, int operand) {
		this.code = code;
		this.nestingLevel = nestingLevel;
		this.operand = operand;
	}
	
	public Instruction(InstructionCodes code, int nestingLevel, OperationCode operand) {
		this.code = code;
		this.nestingLevel = nestingLevel;
		this.operand = operand.getCode();
	}
	
	public Instruction(InstructionCodes code, int nestingLevel, String operand) {
		this.code = code;
		this.nestingLevel = nestingLevel;
		this.operand = Integer.parseInt(operand);
	}
	
	public InstructionCodes getCode() {
		return code;
	}

	public int getNestingLevel() {
		return nestingLevel;
	}

	public int getOperand() {
		return operand;
	}

	public void setOperand(String operand) {
		this.operand = Integer.parseInt(operand);
	}
	
	public void setOperand(int operand) {
		this.operand = operand;
	}

	public String toString() {
		return code.getOperation() + " " + nestingLevel + " " + operand;
	}
}
