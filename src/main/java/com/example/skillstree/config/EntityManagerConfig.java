package com.example.skillstree.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerConfig {
        private static EntityManagerFactory entityManagerFactory;

        private static EntityManagerConfig entityManagerConfig = new EntityManagerConfig();

        private EntityManagerConfig(){
            this.entityManagerFactory = Persistence.createEntityManagerFactory("default");
        }

        public EntityManagerFactory getEntityManagerFactory() {
            return entityManagerFactory;
        }

        public EntityManager getEntityManager(){
            return entityManagerFactory.createEntityManager();
        }

        public static EntityManagerConfig getConfig(){
            return entityManagerConfig;
        }

}
