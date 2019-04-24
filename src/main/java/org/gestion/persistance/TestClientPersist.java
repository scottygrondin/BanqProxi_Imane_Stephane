package org.gestion.persistance;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.gestion.model.Client;

/**
 * @auteurs Imane et Stéphane
 * Test classique de persistance
 */
public class TestClientPersist {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();

			Client cli = new Client("Gasby", "Lemagnifique");
			Client cli2 = new Client("Fiona", "Dupont");
			em.persist(cli);
			em.persist(cli2);

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
