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
        apprenant.setNom("Alaoui");
        apprenant.setPrenom("Ahmed");
        apprenant.setEmail("alaoui.ahmed@gmail.com");
        apprenant.setPassword("alaoui");

        entityManager.getTransaction().begin();
        entityManager.persist(apprenant);
        entityManager.getTransaction().commit();
    }
}
