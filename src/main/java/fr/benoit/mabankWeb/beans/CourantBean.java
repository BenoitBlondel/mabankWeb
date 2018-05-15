package fr.benoit.mabankWeb.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.benoit.mabankWeb.domaine.Courant;

@ManagedBean(name = "courantbean")
@SessionScoped
public class CourantBean {

	private Courant courant;

	/**
	 * Constructeur rempli
	 * 
	 * @param courant
	 */
	public CourantBean(Courant courant) {
		super();
		this.courant = courant;
	}

	/**
	 * Constructeur vide
	 */
	public CourantBean() {
		super();
	}

	// Getteur & Setteur
	public Courant getCourant() {
		return this.courant;
	}

	public void setCourant(Courant courant) {
		this.courant = courant;
	}

	// Fonctions du clientbean
}
