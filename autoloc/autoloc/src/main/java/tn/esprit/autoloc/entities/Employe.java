// Employe.java
package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Employe")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;
    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private RoleEmploye role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAgence")
    private Agence agence;
}