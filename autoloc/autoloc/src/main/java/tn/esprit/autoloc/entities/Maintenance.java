// Maintenance.java
package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "Maintenance")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idVehicule")
    private Vehicule vehicule;
}