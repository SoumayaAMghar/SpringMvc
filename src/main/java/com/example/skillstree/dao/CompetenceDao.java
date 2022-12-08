package com.example.skillstree.dao;

import com.example.skillstree.config.EntityManagerConfig;
import com.example.skillstree.entities.ApprenantsEntity;
import com.example.skillstree.entities.CompetencesEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class CompetenceDao {
    public CompetencesEntity getAllCompetences() {
        EntityManager entityManager = EntityManagerConfig.getConfig().getEntityManager();
        try {
            TypedQuery<CompetencesEntity> query = entityManager.createQuery("SELECT m FROM CompetencesEntity m", CompetencesEntity.class);
            return query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
