
public enum InstructionCodes {
	PUSH("LIT"), 
	OPERATION("OPR"),
	LOAD("LOD"),
	STORE("STO"),
	CALL("CAL"),
	RETURN("RET"),
	INCREMENT("INT"),
	CONDITIONAL_JUMP("JMC"),
	JUMP("JMP"),
	READ_INTEGER("REA"),
	WRITE_INTEGER("WRI"),
	READ_REAL("RER"),
	WRITE_REAL("WRR"),
	OPERATION_REAL("OPF"),
	OPERATION_LOGIC("OPL"),
	REAL_TO_INTEGER("RTI"),
	INTEGER_TO_REAL("ITR"),
	LOAD_FROM_ADDRESS("LDA"),
	STORE_AT_ADDRESS("STA"),
	;
		
	private String operation;
		
	private InstructionCodes(String operation) {
		this.operation = operation;
	}
	
	public String getOperation() {
		return this.operation;
	}
}