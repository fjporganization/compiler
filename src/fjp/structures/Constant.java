package fjp.structures;

public class Constant extends Addressable{
	
	public final DataType type;

	public Constant(int address, int nestingLevel, String name, int length, DataType type) {
		super(address, nestingLevel, name, length);
		this.type = type;
	}
	
	
}
