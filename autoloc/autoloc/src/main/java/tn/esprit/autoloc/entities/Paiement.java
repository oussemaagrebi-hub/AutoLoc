// Paiement.java
package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Paiement")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;
    private BigDecimal montant;
    private LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    private ModePaiement modePaiement;

    @ManyToOne(fetch = FetchType.LAZY)
    private Contrat contrat; 
}