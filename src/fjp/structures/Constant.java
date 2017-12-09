package fjp.structures;

/**
 * Represents constant in the symbol table
 *
 */
public class Constant extends Addressable{

	/**
	 * Constructor
	 * @param address address to be set
	 * @param scopeId scope id to be set
	 * @param name name to be set
	 * @param length length to be set
	 * @param type data type to be set
	 */
	public Constant(int address, int scopeId, String name, int length, DataType type) {
		super(address, scopeId, name, length, type);
	}
	
}
