/**
 * 
 */
package ex3.correction.model;

// TODO: Auto-generated Javadoc
/**
 * The Enum ComportementAnimal.
 *
 * @author cquere
 */
public enum ComportementAnimal {
	
	/** The herbivore. */
	HERBIVORE("HERBIVORE"), 
 /** The carnivore. */
 CARNIVORE("CARNIVORE"), 
 /** The omnivore. */
 OMNIVORE("OMNIVORE");
	
	/** The comportement. */
	private String comportement;

	/**
	 * Instantiates a new comportement animal.
	 *
	 * @param comportement the comportement
	 */
	private ComportementAnimal(String comportement) {
		this.comportement = comportement;
	}

}
