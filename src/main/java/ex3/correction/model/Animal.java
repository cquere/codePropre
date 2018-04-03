/**
 * 
 */
package ex3.correction.model;

// TODO: Auto-generated Javadoc
/**
 * The Class Animal.
 *
 * @author cquere
 */
public class Animal {
	
	/** The comportement. */
	private ComportementAnimal comportement;
	
	/** The type. */
	private TypeAnimal type;
	
	/** The nom. */
	private String nom;
	
	/**
	 * Instantiates a new animal.
	 *
	 * @param comportement the comportement
	 * @param type the type
	 * @param nom the nom
	 */
	public Animal(String nom, TypeAnimal type, ComportementAnimal comportement) {
		this.comportement = comportement;
		this.type = type;
		this.nom = nom;
	}

	/**
	 * Gets the comportement.
	 *
	 * @return the comportement
	 */
	public ComportementAnimal getComportement() {
		return comportement;
	}

	/**
	 * Sets the comportement.
	 *
	 * @param comportement the new comportement
	 */
	public void setComportement(ComportementAnimal comportement) {
		this.comportement = comportement;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public TypeAnimal getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(TypeAnimal type) {
		this.type = type;
	}

	/**
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the nom.
	 *
	 * @param nom the new nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
}
