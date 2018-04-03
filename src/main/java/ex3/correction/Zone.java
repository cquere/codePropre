/**
 * 
 */
package ex3.correction;

import java.util.List;

import ex3.correction.model.Animal;
import ex3.correction.model.ComportementAnimal;
import ex3.correction.model.Milieu;
import ex3.correction.model.TypeAnimal;

// TODO: Auto-generated Javadoc
/**
 * The Class Zone.
 *
 * @author cquere
 */
public class Zone {

	/** The animal list. */
	private List<Animal> animalList;

	/** The milieu. */
	private Milieu milieu;

	/** The type. */
	private TypeAnimal type;

	/** The comportement. */
	private ComportementAnimal comportement;

	/**
	 * Instantiates a new zone.
	 *
	 * @param milieu
	 *            the milieu
	 * @param type
	 *            the type
	 * @param comportement
	 *            the comportement
	 */
	public Zone(Milieu milieu, TypeAnimal type, ComportementAnimal comportement) {
		super();
		this.milieu = milieu;
		this.type = type;
		this.comportement = comportement;
	}

	/**
	 * Instantiates a new zone.
	 *
	 * @param animalList
	 *            the animal list
	 * @param milieu
	 *            the milieu
	 * @param type
	 *            the type
	 * @param comportement
	 *            the comportement
	 */
	public Zone(List<Animal> animalList, Milieu milieu, TypeAnimal type, ComportementAnimal comportement) {
		super();
		this.animalList = animalList;
		this.milieu = milieu;
		this.type = type;
		this.comportement = comportement;
	}

	/**
	 * Adds the animal.
	 *
	 * @param animal
	 *            the animal
	 */
	public void addAnimal(Animal animal) {
		this.animalList.add(animal);
	}

	/**
	 * Afficher liste animaux.
	 */
	public void afficherListeAnimaux() {
		for (Animal a : animalList) {
			System.out.println(a.getNom());
		}
	}

	/**
	 * Compter animaux.
	 *
	 * @return the int
	 */
	public int compterAnimaux() {
		return animalList.size();
	}

	/**
	 * Calculer kgs nourriture par jour.
	 *
	 * @return the double
	 */
	public double calculerKgsNourritureParJour() {
		return animalList.size() * milieu.toDouble();
	}

	/**
	 * Checks if is compatible.
	 *
	 * @param animal the animal
	 * @return true, if is compatible
	 */
	public boolean isCompatible(Animal animal) {
		if (type == animal.getType()) {
			if (comportement == animal.getComportement()) {
				return true;
			}else if (comportement == ComportementAnimal.OMNIVORE){
				return true;
			}			
		}
		return false;
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
	 * @param type
	 *            the new type
	 */
	public void setType(TypeAnimal type) {
		this.type = type;
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
	 * @param comportement
	 *            the new comportement
	 */
	public void setComportement(ComportementAnimal comportement) {
		this.comportement = comportement;
	}

}
