package tn.esprit.kaddempoject.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity

public class Contrat implements Serializable {
    @Id
    private int idContrat;
    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat;
    @Temporal(TemporalType.DATE)
    private Date dateFinContrat;
    private Boolean archive;
    @Id
    private int montantContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    @ManyToOne
    private Etudiant etudiant;
}
