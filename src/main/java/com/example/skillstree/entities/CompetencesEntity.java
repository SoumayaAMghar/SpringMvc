package com.example.skillstree.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "competence", catalog = "skillstree")
public class CompetencesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String commentaire;
    private niveau niveau;
    @ManyToOne
    private ApprenantsEntity apprenants;
    enum niveau{
        un,deux,trois
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public CompetencesEntity.niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(CompetencesEntity.niveau niveau) {
        this.niveau = niveau;
    }

    public ApprenantsEntity getApprenants() {
        return apprenants;
    }

    public void setApprenants(ApprenantsEntity apprenants) {
        this.apprenants = apprenants;
    }
}
