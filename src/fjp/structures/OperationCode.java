package fjp.structures;

/**
 * Represents the second parameter (operand) of the arithmetic OPR and OPF instructions
 *
 */
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
	
	/** operand of the concrete arithmetic operation on integer or real number */
	private final int code;
	
	/** stack pointer change after OPR instruction execution */
	private final int integerStackChange;
	
	/** stack pointer change after OPF instruction execution */
	private final int realStackChange;
	
	/**
	 * Constructor
	 * @param code operand of the concrete arithmetic operation on integer or real number
	 * @param integerStackChange stack pointer change after OPR instruction execution
	 * @param realStackChange stack pointer change after OPF instruction execution
	 */
	private OperationCode(int code, int integerStackChange, int realStackChange) {
		this.code = code;
		this.integerStackChange = integerStackChange;
		this.realStackChange = realStackChange;
	}
	
	/**
	* getter for code
	* @return the code
	*/
	public int getCode() {
		return code;
	}

	/**
	* getter for integerStackChange
	* @return the integerStackChange
	*/
	public int getIntegerStackChange() {
		return integerStackChange;
	}

	/**
	* getter for realStackChange
	* @return the realStackChange
	*/
	public int getRealStackChange() {
		return realStackChange;
	}
	
	/**
	 * get instance by operand of the concrete arithmetic operation on integer or real number
	 * @param code operand of the concrete arithmetic operation on integer or real number
	 * @return instance determined by operand of the concrete arithmetic operation on integer or real number
	 */
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