package org.gestion.service;

import org.gestion.model.Client;

/**
 * @auteurs Imane et St�phane
 * INTERFACE METIER QUI POURRAIT ETRE UTILE POUR PREPARER TOUTES LES METHODES COMMUNES A LA COUCHE SERVICE.
 * Ici uniquement le rajout de client mais le remove, la modification, etc pourraient �tre aussi interfac�
 */
public interface ServiceClient {
	
	
	public Client addclient(Client cl);

	

}
