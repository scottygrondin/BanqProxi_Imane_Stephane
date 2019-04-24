package org.gestion.model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @auteurs Imane et Stéphane Classe Compte défini par un numéro alphanumérique
 *          et un solde
 * 
 *          RQ : toutes les @nnotations liées à la persistance ont dû être
 *          malheureusement "commentées" du à un probleme de Javax.persistence
 *          qui n'a pas été résolu, faute de temps. A savoir un refus d'Eclipse
 *          d'écrire @Id plutôt que @javax.persistence.Id....
 */
//	@Entity
//	@Inheritance(strategy = InheritanceType.JOINED)
//	@DiscriminatorColumn(name = "TYPE_CP")
public class Compte {

//		@javax.persistence.Id
//		@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private String numCompte;
	private double solde;

//		@ManyToOne
//		@JoinColumn(name = "Client_id", unique = true)
	// private Client client;

	// @ManyToOne
	// @JoinColumn(name = "Conseiller_id", unique = true) // le compte est
	// propriétaire de la relation

	// private Conseiller conseiller;

	// @OneToMany(mappedBy = "Compte")

	private List<Operation> list = new ArrayList();

	/**
	 * @getters et setters plus une override de tostring afin d'afficher le compte
	 *          dans la couche présentation
	 *
	 */
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	// public Client getClient() {
	// return client;
	// }

	// public void setClient(Client client) {
	// this.client = client;
	// }

	// public Conseiller getConseiller() {
	// return conseiller;
	// }

	// public void setConseiller(Conseiller conseiller) {
	// this.conseiller = conseiller;
	// }

	public List<Operation> getList() {
		return list;
	}

	public void setList(List<Operation> list) {
		this.list = list;
	}

	// Construteur par défaut
	public Compte() {
		super();

	}

	// Constructeurs avec paramètres
	public Compte(String numCompte, double solde, List<Operation> list) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
//			this.client = client;
		// this.conseiller = conseiller;
		this.list = list;
	}

}
