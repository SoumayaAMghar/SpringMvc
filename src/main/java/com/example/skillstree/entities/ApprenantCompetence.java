package com.example.skillstree.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@IdClass(apprenantCompetencePK.class)
public class ApprenantCompetence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApp;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCom;
    private niveau niveau;
    public Long getIdApprenant() {
        return idApp;
    }
    public void setIdApprenant(Long idApprenant) {
        this.idApp = idApprenant;
    }
    public Long getIdCompetence() {
        return idCom;
    }

    public Long getIdApp() {
        return idApp;
    }

    public void setIdApp(Long idApp) {
        this.idApp = idApp;
    }

    public Long getIdCom() {
        return idCom;
    }

    public void setIdCom(Long idCom) {
        this.idCom = idCom;
    }

    public void setIdCompetence(Long idCompetence) {
        this.idCom = idCompetence;
    }

    enum niveau{
        un , deux , trois
    }
//    @ManyToOne
//    private ApprenantsEntity apprenant;
//    @ManyToOne
//    private CompetencesEntity competence;

//    public ApprenantsEntity getApprenant() {
//        return apprenant;
//    }
//
//    public void setApprenant(ApprenantsEntity apprenant) {
//        this.apprenant = apprenant;
//    }
//
//    public CompetencesEntity getCompetence() {
//        return competence;
//    }
//
//    public void setCompetence(CompetencesEntity competence) {
//        this.competence = competence;
//    }
    public ApprenantCompetence.niveau getNiveau() {
        return niveau;
    }
    public void setNiveau(ApprenantCompetence.niveau niveau) {
        this.niveau = niveau;
    }
}
