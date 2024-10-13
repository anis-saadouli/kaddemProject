package tn.esprit.kaddempoject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.List;

@Entity
public class Universite implements Serializable {
    @Id
    private int idUniv;
private String nomUniv;
@OneToMany
private List<Departement> departements;
}
