package fr.benoit.mabankWeb.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.benoit.mabankWeb.domaine.Epargne;

@ManagedBean(name = "epargnebean")
@SessionScoped
public class EpargneBean {

	private Epargne epargne;

	/**
	 * Constructeur rempli
	 * 
	 * @param epargne
	 */
	public EpargneBean(Epargne epargne) {
		super();
		this.epargne = epargne;
	}

	/**
	 * Constructeur vide
	 */
	public EpargneBean() {
		super();
	}

	// Getteur & Setteur
	public Epargne getEpargne() {
		return this.epargne;
	}

	public void setEpargne(Epargne epargne) {
		this.epargne = epargne;
	}

	// Fonctions du clientbean
}
