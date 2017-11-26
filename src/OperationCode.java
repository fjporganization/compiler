
public enum OperationCode {
	RETURN(0),
	NEGATION(1),
	ADDITION(2),
	SUBTRACTION(3),
	MULTIPLICATION(4),
	DIVISION(5),
	ODD(6),
	MODULUS(7),
	EQUALITY(8),
	INEQUALITY(9),
	LESS_THAN(10),
	LESS_EQUAL(11),
	GREATER_THAN(12),
	GREATER_EQUAL(13);
	
	private int code;
	
	private OperationCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}