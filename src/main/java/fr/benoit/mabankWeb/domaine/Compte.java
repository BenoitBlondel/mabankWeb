package fr.benoit.mabankWeb.domaine;

import java.time.LocalDate;

/**
 * Classe Abstraite Compte contenant les proprietes id, numeroCompte (le numero
 * de compte), solde (le solde actule du compte), ouvertureCompte (la date
 * d'ouverture du compte) et client (le client associe au compte) et possedant
 * un discriminant typeCompte.
 * 
 * @author benoit
 *
 */
public abstract class Compte {

	protected Integer idCompte;
	protected String numeroCompte;
	protected Float solde;
	protected LocalDate ouvertureCompte;
	protected Client client;

	/**
	 * Constructeur complet
	 * 
	 * @param idCompte
	 * @param numeroCompte
	 * @param solde
	 * @param ouvertureCompte
	 * @param client
	 */
	public Compte(Integer idCompte, String numeroCompte, Float solde, LocalDate ouvertureCompte, Client client) {
		super();
		this.idCompte = idCompte;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.ouvertureCompte = ouvertureCompte;
		this.client = client;
	}

	/**
	 * Constructeur d'utilisation (sans KP)
	 * 
	 * @param numeroCompte
	 * @param solde
	 * @param ouvertureCompte
	 * @param client
	 */
	public Compte(String numeroCompte, Float solde, LocalDate ouvertureCompte, Client client) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.ouvertureCompte = ouvertureCompte;
		this.client = client;
	}

	/**
	 * Constructeur vide
	 */
	public Compte() {
		super();
	}

	public Integer getIdCompte() {
		return this.idCompte;
	}

	public void setIdCompte(Integer idCompte) {
		this.idCompte = idCompte;
	}

	public String getNumeroCompte() {
		return this.numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public Float getSolde() {
		return this.solde;
	}

	public void setSolde(Float solde) {
		this.solde = solde;
	}

	public LocalDate getOuvertureCompte() {
		return this.ouvertureCompte;
	}

	public void setOuvertureCompte(LocalDate ouvertureCompte) {
		this.ouvertureCompte = ouvertureCompte;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
