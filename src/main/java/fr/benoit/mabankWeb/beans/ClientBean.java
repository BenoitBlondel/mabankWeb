package fr.benoit.mabankWeb.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.benoit.mabankWeb.domaine.Client;

@ManagedBean(name = "clientbean")
@SessionScoped
public class ClientBean {

	private Client client = new Client();

	/**
	 * Constructeur rempli
	 * 
	 * @param client
	 */
	public ClientBean(Client client) {
		super();
		this.client = client;
	}

	/**
	 * Constructeur vide
	 */
	public ClientBean() {
		super();
	}

	// Getteur & Setteur
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	// Fonctions du clientbean
}
