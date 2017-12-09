package fjp.structures;

/**
 * Represents addressable item in the symbol table
 *
 */
public abstract class Addressable extends Identifier{
	
	/** address of the item */
	private int address;
	
	/** scope id of the item */
	private int scopeId;
	
	/** length that item takes up in the stack */
	private int length;
	
	/** data type of the item */
	private DataType dataType;
	
	/**
	 * Constructor
	 * @param address address to be set
	 * @param scopeId scope id to be set
	 * @param name name to be set
	 * @param length length that item takes up in the stack
	 * @param dataType data type to be set
	 */
	public Addressable(int address, int scopeId, String name, int length, DataType dataType) {
		super(name);
		this.address = address;
		this.scopeId = scopeId;
		this.length = length;
		this.dataType = dataType;
	}
	
	/**
	 * Constructor
	 * @param scopeId scope id to be set
	 * @param name name to be set
	 * @param length length to be set
	 * @param dataType data type to be set
	 */
	public Addressable(int scopeId, String name, int length, DataType dataType) {
		super(name);
		this.scopeId = scopeId;
		this.length = length;
		this.dataType = dataType;
	}

	/**
	* getter for address
	* @return the address
	*/
	public int getAddress() {
		return address;
	}

	/**
	 * setter for the address
	 * @param address the address to set
	 */
	public void setAddress(int address) {
		this.address = address;
	}

	/**
	* getter for scopeId
	* @return the scopeId
	*/
	public int getScopeId() {
		return scopeId;
	}

	/**
	 * setter for the scopeId
	 * @param scopeId the scopeId to set
	 */
	public void setScopeId(int scopeId) {
		this.scopeId = scopeId;
	}

	/**
	* getter for length
	* @return the length
	*/
	public int getLength() {
		return length;
	}

	/**
	 * setter for the length
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	* getter for dataType
	* @return the dataType
	*/
	public DataType getDataType() {
		return dataType;
	}

	/**
	 * setter for the dataType
	 * @param dataType the dataType to set
	 */
	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}	
	
}
