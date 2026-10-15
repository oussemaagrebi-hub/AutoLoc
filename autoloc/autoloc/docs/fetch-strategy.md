# Stratégie Fetch & Cascade — AutoLoc

| Association | Fetch | Cascade | Justification |
|---|---|---|---|
| Contrat → Paiement | LAZY | ALL + orphanRemoval | Un paiement n'existe que rattaché à son contrat (composition) ; supprimer le contrat supprime ses paiements, et retirer un paiement de la liste le supprime aussi. |
| Agence → Vehicule | LAZY | Aucune | Un véhicule survit à la suppression de son agence ; pas de composition. |
| Agence → Employe | LAZY | Aucune | Un employé n'est pas automatiquement supprimé avec son agence (réaffectation possible). |
| Vehicule ↔ Equipement | LAZY | Aucune | Équipements partagés entre plusieurs véhicules ; gérés indépendamment. |
| Client → Reservation | LAZY | PERSIST | Pratique d'enregistrer les réservations avec le client, mais supprimer un client ne doit pas effacer son historique de réservations. |
| Reservation → Vehicule | LAZY | Aucune | Un véhicule existe indépendamment de ses réservations. |
| Reservation ↔ Contrat | LAZY | ALL (côté Reservation) | Une réservation confirmée engendre un contrat qui n'a pas de sens sans elle (composition). |
| Vehicule → Maintenance | LAZY | PERSIST | Pratique d'ajouter une maintenance avec le véhicule, mais supprimer un véhicule ne doit pas effacer son historique de maintenance (traçabilité). |