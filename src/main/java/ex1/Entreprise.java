package ex1;

import java.util.Date;


/**
 * 
 * @author cquere
 * Description de l'entreprise
 *
 */
public class Entreprise {

	/**	N° Siret de l'entreprise */
	public int Siret;
	/**	Nom  de l'entreprise */
	public String Nom;
	/**	Adresse de l'entreprise */
	public String adresse;
	/**	 date de creation de l'entreprise */
	public Date date_Creation;
	/**	 capital maximal de l'entreprise */
	public static final int capitalMax = 3000000;
	
	/**
	 * Ne fait strictement rien
	 */
	public void doNothing(){
		
	}
	
}
