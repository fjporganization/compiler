package fjp.structures;

public enum LogicCode {
	AND(1),
	OR(2),
	NEGATION(3);
	
	private final int code;
	
	private LogicCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}