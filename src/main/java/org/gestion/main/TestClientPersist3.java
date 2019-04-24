package org.gestion.main;

import org.gestion.model.Client;
import org.gestion.persistance.ClientPersist;

/**
 * @auteurs Imane et Stéphane Classe Main permettant de tester la persistance de
 *          "Alfred Kafka" dans la Base de Données. Un objet DAO de la classe
 *          ClientPersist sert à utiliser la méthode addClient propre à la
 *          couche persistance. Ce qui permet de séparer avec la couche métier
 */
public class TestClientPersist3 {

	public static void main(String[] args) {

		Client cli = new Client("Alfred", "Kafka");

		ClientPersist dao = new ClientPersist();
		dao.addclient(cli);

	}

}
