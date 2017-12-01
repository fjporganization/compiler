package fjp.structures;

/**
 * Represents identifier
 *
 */
public abstract class Identifier {
	
	private String name;
	
	public Identifier(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
