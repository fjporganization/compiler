package fjp.structures;

public class Variable extends Addressable{

	public Variable(int address, int nestingLevel, String name, int length, DataType dataType) {
		super(address, nestingLevel, name, length, dataType);
	}
	
	public Variable(int nestingLevel, String name, int length, DataType dataType) {
		super(nestingLevel, name, length, dataType);
	}

}
