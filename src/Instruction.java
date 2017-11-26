
public class Instruction {
	
	public final InstructionCodes code;
	
	public final int nestingLevel;
	
	public final String operand;

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
	
	public String toString() {
		return code.getOperation() + " " + nestingLevel + " " + operand;
	}
}
