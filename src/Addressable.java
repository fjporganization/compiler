/**
 * Represents addressable item
 *
 */
public abstract class Addressable extends Identifier{

	private int address;
	
	private int nestingLevel;
	
	private int length;
	
	public Addressable(int address, int nestingLevel, String name, int length) {
		super(name);
		this.address = address;
		this.nestingLevel = nestingLevel;
		this.length = length;
	}
	
	public Addressable(int nestingLevel, String name, int length) {
		super(name);
		this.nestingLevel = nestingLevel;
		this.length = length;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	public int getNestingLevel() {
		return nestingLevel;
	}

	public void setNestingLevel(int nestingLevel) {
		this.nestingLevel = nestingLevel;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
