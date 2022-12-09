package com.example.skillstree.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

public class apprenantCompetencePK implements Serializable {
    public Long getIdCom() {
        return idCom;
    }

    public void setIdCom(Long idCom) {
        this.idCom = idCom;
    }

    public Long getIdApp() {
        return idApp;
    }

    public void setIdApp(Long idApp) {
        this.idApp = idApp;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCom;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApp;
/*
    @ManyToOne
    private ApprenantsEntity apprenant;
    @ManyToOne
    private CompetencesEntity competence;
  public ApprenantsEntity getApprenant() {
        return apprenant;
    }

    public void setApprenant(ApprenantsEntity apprenant) {
        this.apprenant = apprenant;
    }

    public CompetencesEntity getCompetence() {
        return competence;
    }

    public void setCompetence(CompetencesEntity competence) {
        this.competence = competence;
    }*/
    public Long getIdApprenant() {
        return idApp;
    }

    public void setIdApprenant(Long idApprenant) {
        this.idApp = idApprenant;
    }

    public Long getIdCompetence() {
        return idCom;
    }

    public void setIdCompetence(Long idCompetence) {
        this.idCom = idCompetence;
    }


}
