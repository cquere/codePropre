package ex2;

/**
 * 
 * @author cquere
 *
 *         Classe definissant un compte bancaire de type livret A
 * 
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/** constante permetant pour diviser le taux de remuneration    */
	private static final double divide_taux_remuneration = 100;
	/**
	 * 
	 * @param solde
	 *            représente le solde du compte
	 * @param decouvert
	 *            représente le découvert autorisé
	 * @param tauxRemuneration
	 *            représente le taux de rémunération du livret A
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}


	/**
	 * Applique la r�muneration annuelle du livret A en fonction du solde du
	 * livret et du taux de remuneration
	 */
	public void appliquerRemuAnnuelle() {
		this.solde = solde + solde * tauxRemuneration / divide_taux_remuneration;
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert
	 *            the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		if (decouvert >= 0){
			this.decouvert = decouvert;			
		} else {
			this.decouvert = 0;			

		}
	}

	
	/**
	 * Setter
	 * 
	 * @param solde
	 *            the solde to set
	 */
	@Override
	public void setSolde(double solde) {
		if (solde >= this.decouvert) {
			this.solde = solde;
		} else {
			this.solde = this.decouvert;
		}
	}

}
