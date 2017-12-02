package fjp.structures;

public enum OperationCode {
	NEGATION(1,0,0),
	ADDITION(2,-1,-2),
	SUBTRACTION(3,-1,-2),
	MULTIPLICATION(4,-1,-2),
	DIVISION(5,-1,-2),
	MODULUS(6,-1,0),
	ODD(7,0,0),
	EQUALITY(8,-1,-2),
	INEQUALITY(9,-1,-2),
	LESS_THAN(10,-1,-2),
	GREATER_EQUAL(11,-1,-2),
	GREATER_THAN(12,-1,-2),
	LESS_EQUAL(13,-1,-2);
	
	private final int code;
	
	private final int integerStackChange;
	
	private final int realStackChange;
	
	private OperationCode(int code, int integerStackChange, int realStackChange) {
		this.code = code;
		this.integerStackChange = integerStackChange;
		this.realStackChange = realStackChange;
	}

	public int getCode() {
		return code;
	}

	/**
	 * @return the integerStackChange
	 */
	public int getIntegerStackChange() {
		return integerStackChange;
	}

	/**
	 * @return the realStackChange
	 */
	public int getRealStackChange() {
		return realStackChange;
	}
	
	public static OperationCode getOpCodeByCode(int code) {
		OperationCode[] opCodes = OperationCode.values();
		
		for(OperationCode op : opCodes) {
			if(op.getCode() == code) {
				return op;
			}
		}
		
		return null;
	}
}