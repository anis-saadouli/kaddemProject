package tn.esprit.kaddempoject.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity

public class Etudiant implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idEt;
    private String nomEt;
    private String prenomEt;
    @Enumerated(EnumType.STRING)
    private Option opt;
    @OneToMany(mappedBy = "etudiant")
    private List<Contrat> contrats;
    @ManyToOne
    private Departement departement;
    @ManyToMany
    private List<Equipe> equipes;
}