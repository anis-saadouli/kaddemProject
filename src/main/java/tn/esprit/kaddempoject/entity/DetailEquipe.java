package tn.esprit.kaddempoject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.io.Serializable;
@Entity
public class DetailEquipe implements Serializable {
    @Id
    private int idDetailEquipe;
    private int salle;
    private String thematique;
    @OneToOne(mappedBy = "detailEquipe")
    private Equipe equipe;
}
