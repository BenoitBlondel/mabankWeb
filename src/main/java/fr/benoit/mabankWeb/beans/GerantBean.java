package fr.benoit.mabankWeb.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.benoit.mabankWeb.domaine.Gerant;

@ManagedBean(name = "gerantbean")
@SessionScoped
public class GerantBean {

	private Gerant gerant;

	/**
	 * Constructeur rempli
	 * 
	 * @param gerant
	 */
	public GerantBean(Gerant gerant) {
		super();
		this.gerant = gerant;
	}

	/**
	 * Constructeur vide
	 */
	public GerantBean() {
		super();
	}

	// Getteur & Setteur
	public Gerant getGerant() {
		return this.gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	// Fonctions du clientbean
}
