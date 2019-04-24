package org.gestion.service;

import org.gestion.model.Client;
import org.gestion.persistance.ClientPersist;

/**
 * @auteurs Imane et Stéphane Fonction SERVICE utilsant les méthodes DAO grâce à
 *          un objet ClientPersist dans les cas où l'on fait appel aux même méthodes
 */
public class ServiceImplementation implements ServiceClient {

	private ClientPersist dao = new ClientPersist();

	@Override
	public Client addclient(Client cl) {
		dao.addclient(cl);
		return null;
	}

}
