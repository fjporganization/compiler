
public enum InstructionCodes {
	PUSH("LIT"),
	OPERATION("OPR"),
	LOAD("LOD"),
	STORE("STO"),
	CALL("CAL"),
	INCREMENT("INT"),
	CONDITIONAL_JUMP("JMC"),
	JUMP("JMP");
		
	private String operation;
		
	private InstructionCodes(String operation) {
		this.operation = operation;
	}
	
	public String getOperation() {
		return this.operation;
	}
}