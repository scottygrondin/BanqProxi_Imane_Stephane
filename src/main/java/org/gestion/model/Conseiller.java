package org.gestion.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @auteurs Imane et Stéphane
 *
 */
@Entity
public class Conseiller {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long Id;
	private String nom;

	// Constructeur
	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}

// Constructeurs avec paramètres
	public Conseiller(String nom) {
		super();
		this.nom = nom;
	}

	/**
	 * @getters et setters plus une override de tostring afin d'afficher le
	 *          conseiller dans la couche présentation
	 */
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
