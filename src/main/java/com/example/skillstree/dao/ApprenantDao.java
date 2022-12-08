package com.example.skillstree.dao;

import com.example.skillstree.config.EntityManagerConfig;
import com.example.skillstree.entities.ApprenantsEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class ApprenantDao {
    public ApprenantsEntity getAllApprenants() {
        EntityManager entityManager = EntityManagerConfig.getConfig().getEntityManager();
        try {
            TypedQuery<ApprenantsEntity> query = entityManager.createQuery("SELECT m FROM ApprenantsEntity m", ApprenantsEntity.class);
            return query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public ApprenantsEntity login(String email, String password) {
        EntityManager entityManager = EntityManagerConfig.getConfig().getEntityManager();
        try {
            TypedQuery<ApprenantsEntity> query = entityManager.createQuery("SELECT m FROM ApprenantsEntity m WHERE m.email = :email AND m.password = :password", ApprenantsEntity.class);
            query.setParameter("email", email);
            query.setParameter("password", password);
            ApprenantsEntity apprenant = query.getSingleResult();
            return apprenant;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
