// Vehicule.java
package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

@Entity
@Table(name = "Vehicule")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAgence")
    private Agence agence;

    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Maintenance> maintenances = new ArrayList<>();

    @OneToMany(mappedBy = "vehicule", fetch = FetchType.LAZY)
    private List<Reservation> reservations = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "vehicule_equipement",
            joinColumns = @JoinColumn(name = "idVehicule"),
            inverseJoinColumns = @JoinColumn(name = "idEquipement")
    )
    private Set<Equipement> equipements = new HashSet<>();
}