package com.example.skillstree.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "apprenant", catalog = "skillstree")
public class ApprenantsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String password;

    public List<CompetencesEntity> getApprenantCompetences() {
        return apprenantCompetences;
    }

    public void setApprenantCompetences(List<CompetencesEntity> apprenantCompetences) {
        this.apprenantCompetences = apprenantCompetences;
    }
    @ManyToMany
    @JoinTable(name = "apprenantcompetence", joinColumns = @JoinColumn(name = "idApp"),
            inverseJoinColumns = @JoinColumn(name = "idCom"))
    private List<CompetencesEntity> apprenantCompetences;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
