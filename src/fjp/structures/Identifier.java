package fjp.structures;

/**
 * Represents identifier in the symbol table
 *
 */
public abstract class Identifier {
	
	/** identifier name */
	private String name;
	
	/**
	 * Constructor for the Identifier
	 * @param name name of the identifier
	 */
	public Identifier(String name) {
		this.name = name;
	}

	/**
	* getter for name
	* @return the name
	*/
	public String getName() {
		return name;
	}

	/**
	 * setter for the name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
