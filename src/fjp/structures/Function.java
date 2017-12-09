package fjp.structures;

/**
 * Represents function in the symbol table
 *
 */
public class Function extends Addressable {
	
	/**
	 * Constructor
	 * @param address address of the symbol in the output instructions
	 * @param name name of the function
	 */
    public Function(int address, String name) {
        super(address, 0, name, 0, null);
    }
}
