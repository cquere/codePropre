package ex3.correction.model;

// TODO: Auto-generated Javadoc
/**
 * The Enum TypeAnimal.
 */
public enum TypeAnimal {
	
	/** The mammifere. */
	MAMMIFERE("MAMMIFERE"), 
 /** The aquatique. */
 AQUATIQUE("AQUATIQUE"), 
 /** The reptile. */
 REPTILE("REPTILE");
	
	/** The type. */
	private String type;

	/**
	 * Instantiates a new type animal.
	 *
	 * @param type the type
	 */
	private TypeAnimal(String type) {
		this.type = type;
	}
}
