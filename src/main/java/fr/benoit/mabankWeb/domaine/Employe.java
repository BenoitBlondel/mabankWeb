package fr.benoit.mabankWeb.domaine;

/**
 * Classe Abstraite Employe contenant les proprietes id, nom, prenom, telephone,
 * et mail des employes possedant un discriminant typeEmploye.
 * 
 * @author benoit
 *
 */
public abstract class Employe {

	protected Integer idEmploye;
	protected String nom;
	protected String prenom;
	protected String tel;
	protected String email;

	/**
	 * Construteur complet
	 * 
	 * @param idEmploye
	 * @param nom
	 * @param prenom
	 * @param tel
	 * @param email
	 */
	public Employe(Integer idEmploye, String nom, String prenom, String tel, String email) {
		super();
		this.idEmploye = idEmploye;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
	}

	/**
	 * Constructeur d'utilisation (sans KP)
	 * 
	 * @param nom
	 * @param prenom
	 * @param tel
	 * @param email
	 */
	public Employe(String nom, String prenom, String tel, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
	}

	/**
	 * Constructeur vide
	 */
	public Employe() {
		super();
	}

	public Integer getIdEmploye() {
		return this.idEmploye;
	}

	public void setIdEmploye(Integer idEmploye) {
		this.idEmploye = idEmploye;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
