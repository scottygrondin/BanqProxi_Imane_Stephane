package org.gestion.main;

import org.gestion.model.Client;
import org.gestion.persistance.ClientPersist;

/**
 * @auteurs Imane et St�phane Classe Main permettant de tester la persistance de
 *          "Alfred Kafka" dans la Base de Donn�es. Un objet DAO de la classe
 *          ClientPersist sert � utiliser la m�thode addClient propre � la
 *          couche persistance. Ce qui permet de s�parer avec la couche m�tier
 */
public class TestClientPersist3 {

	public static void main(String[] args) {

		Client cli = new Client("Alfred", "Kafka");

		ClientPersist dao = new ClientPersist();
		dao.addclient(cli);

	}

}
