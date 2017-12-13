package fjp.structures;

/**
 * Represents one output instruction
 *
 */
public class Instruction {
	
	/** code of the instruction (e.g. LIT, OPR, ...) */
	private final InstructionCodes code;
	
	/** first parameter of the instruction - nesting level */
	private final int nestingLevel;
	
	/** second parameter of the instruction - operand */
	private double operand;
	
	/**
	 * Constructor of the instruction
	 * @param code code of the instruction
	 * @param nestingLevel first parameter of the instruction - nesting level
	 */
	public Instruction(InstructionCodes code, int nestingLevel) {
		this.code = code;
		this.nestingLevel = nestingLevel;
	}
	
	/**
	 * Constructor of the instruction
	 * @param code code of the instruction
	 * @param nestingLevel first parameter of the instruction - nesting level
	 * @param operand second parameter of the instruction - operand
	 */
	public Instruction(InstructionCodes code, int nestingLevel, double operand) {
		this.code = code;
		this.nestingLevel = nestingLevel;
		this.operand = operand;
	}
	
	/**
	 * Constructor of the instruction
	 * @param code code of the instruction
	 * @param nestingLevel first parameter of the instruction - nesting level
	 * @param operand second parameter of the instruction - operand (given as operation code for arithmetic OPR instructions)
	 */
	public Instruction(InstructionCodes code, int nestingLevel, OperationCode operand) {
		this.code = code;
		this.nestingLevel = nestingLevel;
		this.operand = operand.getCode();
	}
	
	/**
	 * Constructor of the instruction
	 * @param code code of the instruction
	 * @param nestingLevel first parameter of the instruction - nesting level
	 * @param operand second parameter of the instruction - operand (given as string)
	 */
	public Instruction(InstructionCodes code, int nestingLevel, String operand) {
		this.code = code;
		this.nestingLevel = nestingLevel;
		this.operand = Integer.parseInt(operand);
	}
	
	/**
	* getter for operand
	* @return the operand
	*/
	public double getOperand() {
		return operand;
	}

	/**
	 * setter for the operand
	 * @param operand the operand to set
	 */
	public void setOperand(double operand) {
		this.operand = operand;
	}

	/**
	* getter for code
	* @return the code
	*/
	public InstructionCodes getCode() {
		return code;
	}

	/**
	* getter for nestingLevel
	* @return the nestingLevel
	*/
	public int getNestingLevel() {
		return nestingLevel;
	}

	/**
	 * outputs the string representation of the instruction as is instruction written in the output file
	 * except address of the instruction, address is added when output file generating
	 */
	public String toString() {
		if(code == InstructionCodes.PUSH_REAL) {
			return code.getOperation() + " " + nestingLevel + " " + operand;
		}else {
			return code.getOperation() + " " + nestingLevel + " " + (int)operand;
		}
	}
}
