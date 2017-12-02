package fjp.structures;

public enum LogicCode {
	AND(1,-1),
	OR(2,-1),
	NEGATION(3,0);
	
	private final int code;
	
	private final int stackChange;
	
	private LogicCode(int code, int stackChange) {
		this.code = code;
		this.stackChange = stackChange;
	}

	public int getCode() {
		return code;
	}

	
	public int getStackChange() {
		return stackChange;
	}
	
	public static LogicCode getOpCodeByCode(int code) {
		LogicCode[] opCodes = LogicCode.values();
		
		for(LogicCode op : opCodes) {
			if(op.getCode() == code) {
				return op;
			}
		}
		
		return null;
	}
}