package org.gestion.service;

import org.gestion.model.Client;
import org.gestion.persistance.ClientPersist;

/**
 * @auteurs Imane et St�phane Fonction SERVICE utilsant les m�thodes DAO gr�ce �
 *          un objet ClientPersist dans les cas o� l'on fait appel aux m�me m�thodes
 */
public class ServiceImplementation implements ServiceClient {

	private ClientPersist dao = new ClientPersist();

	@Override
	public Client addclient(Client cl) {
		dao.addclient(cl);
		return null;
	}

}
