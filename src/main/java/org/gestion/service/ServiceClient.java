package org.gestion.service;

import org.gestion.model.Client;

/**
 * @auteurs Imane et Stéphane
 * INTERFACE METIER QUI POURRAIT ETRE UTILE POUR PREPARER TOUTES LES METHODES COMMUNES A LA COUCHE SERVICE.
 * Ici uniquement le rajout de client mais le remove, la modification, etc pourraient être aussi interfacé
 */
public interface ServiceClient {
	
	
	public Client addclient(Client cl);

	

}
