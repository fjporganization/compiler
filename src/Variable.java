
public class Variable extends Addressable{
	
	public final DataType dataType;

	public Variable(int address, int nestingLevel, String name, int length, DataType dataType) {
		super(address, nestingLevel, name, length);
		this.dataType = dataType;
	}

}
