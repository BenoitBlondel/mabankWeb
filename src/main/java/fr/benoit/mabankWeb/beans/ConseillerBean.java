package fr.benoit.mabankWeb.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.benoit.mabankWeb.domaine.Conseiller;

@ManagedBean(name = "conseillerbean")
@SessionScoped
public class ConseillerBean {

	private Conseiller conseiller;

	/**
	 * Constructeur rempli
	 * 
	 * @param conseiller
	 */
	public ConseillerBean(Conseiller conseiller) {
		super();
		this.conseiller = conseiller;
	}

	/**
	 * Constructeur vide
	 */
	public ConseillerBean() {
		super();
	}

	// Getteur & Setteur
	public Conseiller getConseiller() {
		return this.conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	// Fonctions du clientbean
}
