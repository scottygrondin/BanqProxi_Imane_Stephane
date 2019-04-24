package org.gestion.persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.gestion.model.Client;

/**
 * @auteurs Imane et Stéphane Classe objet dao permettant d'utliser toutes les
 *          méthodes de persistence : seul l'ajout de client a été codé mais on
 *          pourra rajouter le remove, modifier, consulter, etc
 */
public class ClientPersist {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	public Client addclient(Client cl) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();

			em.persist(cl);

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

		return cl;
	}
}
