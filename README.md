# AutoLoc

Plateforme de gestion de location de véhicules multi-agences.

## Objectifs du projet

AutoLoc est une application Java/Spring permettant à une entreprise de location de véhicules de gérer, sur plusieurs agences, l'ensemble du cycle de location : catalogue de véhicules, réservations, contrats de location, suivi des clients et administration multi-agences.

## Acteurs et cas d'utilisation

| Acteur | Description |
|---|---|
| **Client** | Consulte le catalogue de véhicules disponibles, effectue une réservation, suit ses locations en cours et son historique. |
| **Agent d'agence** | Gère les réservations et contrats au sein de son agence, enregistre les départs/retours de véhicules, gère l'état de la flotte locale. |
| **Responsable d'agence** | Supervise l'activité de son agence (véhicules, contrats, agents), consulte les statistiques et gère la flotte de l'agence. |
| **Administrateur** | Gère les agences, les comptes utilisateurs et les droits d'accès, supervise l'ensemble de la plateforme. |

## Stack technique

- **Langage / Build** : Java 17, Maven
- **Framework** : Spring Boot, Spring Data JPA, Spring MVC, Spring AOP, Spring Scheduler
- **Base de données** : MySQL (dev), H2 (tests)
- **Productivité** : Lombok, SLF4J/Logback, MapStruct
- **Documentation API** : springdoc-openapi (Swagger UI)
- **Tests** : JUnit 5, Mockito, MockMvc, Jacoco
- **Outillage** : Git/GitHub, Postman, IntelliJ IDEA Ultimate

## Environnement de développement

Voir le guide de mise en place de l'environnement (Atelier 0) pour l'installation du JDK 17, IntelliJ IDEA, MySQL, Postman et Git.
