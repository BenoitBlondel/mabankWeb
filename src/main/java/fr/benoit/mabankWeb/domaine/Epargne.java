package fr.benoit.mabankWeb.domaine;

import java.time.LocalDate;

/**
 * Classe Epargne heritant de Compte (discriminant epargne) possedant la
 * propriete supplementaire tauxRemuneration (taux de remuneration du compte).
 * 
 * @author benoit
 *
 */
public class Epargne extends Compte {

	private Float tauxRemuneration;

	/**
	 * Constructeur complet
	 * 
	 * @param idCompte
	 * @param numeroCompte
	 * @param solde
	 * @param ouvertureCompte
	 * @param client
	 * @param tauxRemuneration
	 */
	public Epargne(Integer idCompte, String numeroCompte, Float solde, LocalDate ouvertureCompte, Client client, Float tauxRemuneration) {
		super(idCompte, numeroCompte, solde, ouvertureCompte, client);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Constructeur d'utilisation (sans KP)
	 * 
	 * @param numeroCompte
	 * @param solde
	 * @param ouvertureCompte
	 * @param client
	 * @param tauxRemuneration
	 */
	public Epargne(String numeroCompte, Float solde, LocalDate ouvertureCompte, Client client, Float tauxRemuneration) {
		super(numeroCompte, solde, ouvertureCompte, client);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Constructeur vide
	 */
	public Epargne() {
		super();
	}

	public Float getTauxRemuneration() {
		return this.tauxRemuneration;
	}

	public void setTauxRemuneration(Float tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
