package org.gestion.model;


	
	import java.util.List;


	import javax.persistence.DiscriminatorValue;
	import javax.persistence.Entity;
	/**
	 * @auteurs Imane et Stéphane
	 *
	 */
//	@Entity
//	@DiscriminatorValue("CE")
	public class CompteEpargne extends Compte {

		private double taux;

	//Getter, Setter
		public double getTaux() {
			return taux;
		}

		public void setTaux(double taux) {
			this.taux = taux;
		}

	// Contructeur
		public CompteEpargne(double taux) {
			super();
			this.taux = taux;
		}

	// Constructeurs avec paramètres de la classe parente
		public CompteEpargne() {
			super();
			// TODO Auto-generated constructor stub
		}

		
	}



