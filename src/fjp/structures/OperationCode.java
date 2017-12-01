package fjp.structures;

public enum OperationCode {
	NEGATION(1),
	ADDITION(2),
	SUBTRACTION(3),
	MULTIPLICATION(4),
	DIVISION(5),
	MODULUS(6),
	ODD(7),
	EQUALITY(8),
	INEQUALITY(9),
	LESS_THAN(10),
	GREATER_EQUAL(11),
	GREATER_THAN(12),
	LESS_EQUAL(13),
	LOGIC_NEGATION(14);
	
	private final int code;
	
	private OperationCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}