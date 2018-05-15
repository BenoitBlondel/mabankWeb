package fr.benoit.mabankWeb.domaine;

import java.util.Collection;

/**
 * Classe Gerant heritee d'Employe (discriminant gerant) contenant la proriete
 * supplementaire conseillers (liste des conseillers geres par le gerant).
 * 
 * @author benoit
 *
 */
public class Gerant extends Employe {

	private Collection<Conseiller> conseillers;

	/**
	 * Constructeur complet
	 * 
	 * @param idEmploye
	 * @param nom
	 * @param prenom
	 * @param tel
	 * @param email
	 * @param conseillers
	 */
	public Gerant(Integer idEmploye, String nom, String prenom, String tel, String email, Collection<Conseiller> conseillers) {
		super(idEmploye, nom, prenom, tel, email);
		this.conseillers = conseillers;
	}

	/**
	 * Constructeur d'utilisation (sans KP ni liste)
	 * 
	 * @param nom
	 * @param prenom
	 * @param tel
	 * @param email
	 */
	public Gerant(String nom, String prenom, String tel, String email) {
		super(nom, prenom, tel, email);
	}

	/**
	 * Constructeur vide
	 */
	public Gerant() {
		super();
	}

	public Collection<Conseiller> getConseillers() {
		return this.conseillers;
	}

	public void setConseillers(Collection<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}

}
