package org.gestion.model;



	import java.util.List;

	import javax.persistence.DiscriminatorValue;
	import javax.persistence.Entity;

	/**
	 * @auteurs Imane et St�phane
	 *
	 */
//	@Entity
//	@DiscriminatorValue("CC")
	public class CompteCourant extends Compte {
	private double decouvert;


	// Getters, Setters
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}


	// Constructeur
	public CompteCourant(double decouvert) {
		super();
		this.decouvert = decouvert;
	}

	// Constructeurs avec param�tres de la classe parente
	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	




	}



