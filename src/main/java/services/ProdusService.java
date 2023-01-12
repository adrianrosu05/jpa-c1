package services;

import entities.Produs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProdusService {

    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("my-persistence-unit");
    EntityManager entityManager = entityManagerFactory.createEntityManager();


    public void createProdus(Produs p) {
        entityManager.getTransaction().begin();
        entityManager.persist(p);
        entityManager.getTransaction().commit();
    }
}
