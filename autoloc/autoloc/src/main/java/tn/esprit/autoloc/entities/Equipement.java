// Equipement.java
package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "Equipement")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;
    private String libelle;

    @ManyToMany(mappedBy = "equipements", fetch = FetchType.LAZY)
    private Set<Vehicule> vehicules = new HashSet<>();
}