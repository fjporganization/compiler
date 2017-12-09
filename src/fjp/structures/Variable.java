package fjp.structures;

public class Variable extends Addressable{

	public Variable(int address, int scopeId, String name, int length, DataType dataType) {
		super(address, scopeId, name, length, dataType);
	}
	
	public Variable(int scopeId, String name, int length, DataType dataType) {
		super(scopeId, name, length, dataType);
	}

}
