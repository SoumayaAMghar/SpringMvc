package com.example.skillstree.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "competence", catalog = "skillstree")
public class CompetencesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String commentaire;

    @OneToMany(mappedBy = "competence")
    private List<ApprenantCompetence> apprenantCompetences;
    public List<ApprenantCompetence> getApprenantCompetences() {
        return apprenantCompetences;
    }

    public void setApprenantCompetences(List<ApprenantCompetence> apprenantCompetences) {
        this.apprenantCompetences = apprenantCompetences;
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


}
