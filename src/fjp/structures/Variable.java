package fjp.structures;

/**
 * Represents variable in the stack
 *
 */
public class Variable extends Addressable{
	
	/**
	 * Constructor
	 * @param address address of the variable in the stack
	 * @param scopeId scope id of the variable
	 * @param name name of the variable
	 * @param length size that variable takes up in the stack
	 * @param dataType data type of the variable
	 */
	public Variable(int address, int scopeId, String name, int length, DataType dataType) {
		super(address, scopeId, name, length, dataType);
	}
	
	/**
	 * Constructor
	 * @param scopeId scope id of the variable
	 * @param name name of the variable
	 * @param length size that variable takes up in the stack
	 * @param dataType data type of the variable
	 */
	public Variable(int scopeId, String name, int length, DataType dataType) {
		super(scopeId, name, length, dataType);
	}

}
