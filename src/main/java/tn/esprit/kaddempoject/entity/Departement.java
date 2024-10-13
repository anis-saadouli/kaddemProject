package tn.esprit.kaddempoject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.List;

@Entity
public class Departement implements Serializable {
    @Id
    private int idDepart;
    private String nomDepart;
    @OneToMany(mappedBy = "departement")
    private List<Etudiant> etudiants;
}
