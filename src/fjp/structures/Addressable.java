package fjp.structures;

/**
 * Represents addressable item
 *
 */
public abstract class Addressable extends Identifier{

	private int address;
	
	private int scopeId;
	
	private int length;

	private DataType dataType;
	
	public Addressable(int address, int scopeId, String name, int length, DataType dataType) {
		super(name);
		this.address = address;
		this.scopeId = scopeId;
		this.length = length;
		this.dataType = dataType;
	}
	
	public Addressable(int scopeId, String name, int length, DataType dataType) {
		super(name);
		this.scopeId = scopeId;
		this.length = length;
		this.dataType = dataType;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	public int getScopeId() {
		return scopeId;
	}

	public void setScopeId(int scopeId) {
		this.scopeId = scopeId;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}


	public DataType getDataType() {
		return dataType;
	}

	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}
}
