# TP Java

## Installation

- Installer un JDK Java 21 et un JDK Java 25 avec Eclipse Temurin.
- Installer Apache Maven.
- Vérifier les installations avec `java -version` et `mvn -version`.

## Projets

- `tp-env-java` : projet Java avec Maven.
- `projet-java21` : projet utilisant le JDK 21.
- `projet-java25` : projet utilisant le JDK 25.

## Changer de JDK par projet

Ouvrir le terminal dans le dossier du projet concerné, puis exécuter :

- Pour Java 21 : `. .\env.ps1`
- Pour Java 25 : `. .\env.ps1` dans le dossier `projet-java25`.

Vérifier la version active avec `java -version`.

## Compiler avec Maven

Dans le dossier du projet, exécuter :

`mvn compile`

Pour exécuter le programme Java 25 :

`java -cp target/classes Main`