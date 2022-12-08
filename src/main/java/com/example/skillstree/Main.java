package com.example.skillstree;

import com.example.skillstree.entities.ApprenantsEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("heelloo");


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        ApprenantsEntity apprenant = new ApprenantsEntity();
        apprenant.setNom("aya");
        apprenant.setPrenom("Amghar");
        apprenant.setEmail("amghar.aya@gmail.com");
        apprenant.setPassword("aya");

        entityManager.getTransaction().begin();
        entityManager.persist(apprenant);
        entityManager.getTransaction().commit();
    }
}
