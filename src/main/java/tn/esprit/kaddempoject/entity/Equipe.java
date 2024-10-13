package tn.esprit.kaddempoject.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Equipe implements Serializable {
    @Id
    private int idEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @ManyToMany(mappedBy = "equipes")
    private List<Etudiant> etudiants;
      @OneToOne
    private DetailEquipe detailEquipe;
}
