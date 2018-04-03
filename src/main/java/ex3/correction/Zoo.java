package ex3.correction;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import ex3.correction.model.Animal;
import ex3.correction.model.ComportementAnimal;
import ex3.correction.model.Milieu;
import ex3.correction.model.TypeAnimal;

// TODO: Auto-generated Javadoc
/**
 * The Class Zoo.
 */
public class Zoo {

	/** The nom. */
	private String nom;
	
	/** The zones. */
	private List<Zone> zones;


	/**
	 * Instantiates a new zoo.
	 *
	 * @param nom the nom
	 */
	public Zoo(String nom) {
		this.nom = nom;
		zones = new ArrayList<>();
		zones.add(new Zone(Milieu.CARNIVORE, TypeAnimal.MAMMIFERE, ComportementAnimal.CARNIVORE));
		zones.add(new Zone(Milieu.SAVANE, TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE));
		zones.add(new Zone(Milieu.AQUARIUM, TypeAnimal.MAMMIFERE, ComportementAnimal.OMNIVORE));
		zones.add(new Zone(Milieu.REPTILE, TypeAnimal.MAMMIFERE, ComportementAnimal.OMNIVORE));

	}

	/**
	 * Adds the animal.
	 *
	 * @param animal the animal
	 */
	public void addAnimal(Animal animal) {
		Optional<Zone> zone = zones.stream().filter(z -> z.isCompatible(animal)).findFirst();

		if (zone.isPresent()) { 
			zone.get().addAnimal(animal);
		}
	}

	/**
	 * Afficher liste animaux.
	 */
	public void afficherListeAnimaux() {
		zones.stream().forEach(Zone::afficherListeAnimaux);
	}

	/**
	 * Getter for nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter.
	 *
	 * @param nom            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
