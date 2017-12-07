package fjp.structures;

public enum InstructionCodes {
	PUSH("LIT", +1), 
	OPERATION("OPR", 0),
	LOAD("LOD", +1),
	STORE("STO", -1),
	CALL("CAL", 0),
	RETURN("RET", 0),
	INCREMENT("INT", 0),
	CONDITIONAL_JUMP("JMC", -1),
	JUMP("JMP", 0),
	READ_INTEGER("REA", +1),
	WRITE_INTEGER("WRI", -1),
	READ_REAL("RER", +2),
	WRITE_REAL("WRR", -2),
	OPERATION_REAL("OPF", 0),
	REAL_TO_INTEGER("RTI", -1),
	INTEGER_TO_REAL("ITR", +1),
	LOAD_FROM_ADDRESS("LDA", 0),
	STORE_AT_ADDRESS("STA", -2),
	READ_FRAC("REF", +2),
	WRITE_FRAC("WRF", -2);
	;
		
	private String operation;
	
	private final int stackChange;
		
	private InstructionCodes(String operation, int stackChange) {
		this.operation = operation;
		this.stackChange = stackChange;
	}
	
	public String getOperation() {
		return this.operation;
	}

	
	public int getStackChange() {
		return stackChange;
	}
}