package org.gestion.persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.gestion.model.Client;

/**
 * @auteurs Imane et Stéphane
 * test find d'un client persisté
 */
public class TestFindClient {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();

			Client cli = em.find(Client.class, 18L);
			System.out.println(cli);

			txn.commit();

		} catch (Exception e) {
			if (txn != null) {

				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}

			if (emf != null) {
				emf.close();
			}
		}

	}
}
