
public class Instruction {
	
	public final InstructionCodes code;
	
	public final int nestingLevel;
	
	public String operand;
	
	public Instruction(InstructionCodes code, int nestingLevel) {
		this.code = code;
		this.nestingLevel = nestingLevel;
	}

	public Instruction(InstructionCodes code, int nestingLevel, int operand) {
		this.code = code;
		this.nestingLevel = nestingLevel;
		this.operand = operand + "";
	}
	
	public Instruction(InstructionCodes code, int nestingLevel, OperationCode operand) {
		this.code = code;
		this.nestingLevel = nestingLevel;
		this.operand = operand.getCode() + "";
	}
	
	public Instruction(InstructionCodes code, int nestingLevel, String operand) {
		this.code = code;
		this.nestingLevel = nestingLevel;
		this.operand = operand;
	}
	
	public String getOperand() {
		return operand;
	}

	public void setOperand(String operand) {
		this.operand = operand;
	}
	
	public void setOperand(int operand) {
		this.operand = operand + "";
	}

	public String toString() {
		return code.getOperation() + " " + nestingLevel + " " + operand;
	}
}
