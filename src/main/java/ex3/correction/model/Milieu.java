package ex3.correction.model;

// TODO: Auto-generated Javadoc
/**
 * The Enum Milieu.
 */
public enum Milieu {
	
	/** The aquarium. */
	AQUARIUM(0.2), 
 /** The carnivore. */
 CARNIVORE(10), 
 /** The savane. */
 SAVANE(10), 
 /** The reptile. */
 REPTILE(0.1);

	/** The milieu. */
	private double milieu;

	/**
	 * Instantiates a new milieu.
	 *
	 * @param milieu the milieu
	 */
	private Milieu(double milieu) {
		this.milieu = milieu;
	}
	
	/**
	 * To double.
	 *
	 * @return the double
	 */
	public  double toDouble(){
		return milieu;
	}
}
