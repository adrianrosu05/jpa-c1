package services;

import entities.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentService {
    EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("my-persistence-unit");
    EntityManager entityManager = entityManagerFactory.createEntityManager();


    public void createStudent(Student s) {
        entityManager.getTransaction().begin();
        entityManager.persist(s);
        entityManager.getTransaction().commit();
    }
}
