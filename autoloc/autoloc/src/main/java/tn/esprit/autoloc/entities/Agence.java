// Agence.java
package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "Agence")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    private List<Vehicule> vehicules = new ArrayList<>();

    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    private List<Employe> employes = new ArrayList<>();
}