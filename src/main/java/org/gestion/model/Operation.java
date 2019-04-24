package org.gestion.model;

//import javax.persistence.Entity;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;

/**
 * @auteurs Imane et St�phane Classe Operation qui englobe le retrait et le
 *          versement sachant qu'un virement est les deux. Cependant, ces
 *          fonctions n'ont pas �t� enti�rement cod�es dans ce projet...
 */
// @Entity
// @Inheritance
public class Operation {

	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private Long dateOperation;
	private double montant;

	// @ManyToOne
	// @JoinColumn(name="Compte_id", unique=true)
	private Compte compte;

	// @ManyToOne
	// @JoinColumn(name="Conseiller_id", unique=true)
	private Conseiller conseiller;

	/**
	 * @getters et setters plus une override de tostring afin d'afficher l'op�ration
	 *          dans la couche pr�sentation
	 */
	public Long getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Long dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	// Constructeurs avec param�tres
	public Operation(Long dateOperation, double montant, Compte compte, Conseiller conseiller) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
		this.compte = compte;
		this.conseiller = conseiller;
	}

	// Constructeur par d�faut
	public Operation() {
		super();

	}

}
