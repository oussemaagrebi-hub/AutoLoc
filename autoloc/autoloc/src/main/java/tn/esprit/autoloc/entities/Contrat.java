// Contrat.java
package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "Contrat")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    private LocalDate dateSignature;
    private BigDecimal montantTotal;
    private boolean valide;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idReservation")
    private Reservation reservation;

    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Paiement> paiements = new ArrayList<>();
}