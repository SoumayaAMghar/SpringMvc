package com.example.skillstree.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ApprenantCompetence {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idApprenant;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idCompetence;
    private niveau niveau;
    enum niveau{
        un , deux , trois
    }

    @ManyToOne
    private ApprenantsEntity apprenant;
    @ManyToOne
    private CompetencesEntity competence;

    public ApprenantsEntity getApprenant() {
        return apprenant;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setApprenant(ApprenantsEntity apprenant) {
        this.apprenant = apprenant;
    }

    public CompetencesEntity getCompetence() {
        return competence;
    }

    public void setCompetence(CompetencesEntity competence) {
        this.competence = competence;
    }

    public ApprenantCompetence.niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(ApprenantCompetence.niveau niveau) {
        this.niveau = niveau;
    }
}
