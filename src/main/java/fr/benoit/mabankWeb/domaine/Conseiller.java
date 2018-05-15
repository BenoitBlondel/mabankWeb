package fr.benoit.mabankWeb.domaine;

import java.util.Collection;

/**
 * Classe Conseiller heritee d'Employe (discriminant conseiller) contenant les
 * prorietes supplementaires clients (liste des clients geres par le conseiller)
 * et gerant (le gerant associe au conseiller).
 * 
 * @author benoit
 *
 */
public class Conseiller extends Employe {

	private Collection<Client> clients;
	private Gerant gerant;

	/**
	 * Constructeur complet
	 * 
	 * @param idEmploye
	 * @param nom
	 * @param prenom
	 * @param tel
	 * @param email
	 * @param clients
	 * @param gerant
	 */
	public Conseiller(Integer idEmploye, String nom, String prenom, String tel, String email, Collection<Client> clients, Gerant gerant) {
		super(idEmploye, nom, prenom, tel, email);
		this.clients = clients;
		this.gerant = gerant;
	}

	/**
	 * Constructeur d'utilisation (sans KP ni liste)
	 * 
	 * @param nom
	 * @param prenom
	 * @param tel
	 * @param email
	 * @param gerant
	 */
	public Conseiller(String nom, String prenom, String tel, String email, Gerant gerant) {
		super(nom, prenom, tel, email);
		this.gerant = gerant;
	}

	/**
	 * Constructeur vide
	 */
	public Conseiller() {
		super();
	}

	public Collection<Client> getClients() {
		return this.clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	public Gerant getGerant() {
		return this.gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	@Override
	public String toString() {
		return "Conseiller [nom : " + this.nom + "prenom : " + this.prenom + "tel : " + this.tel + "email : " + this.email + "clients=" + this.clients + ", gerant=" + this.gerant + "]";
	}

}
