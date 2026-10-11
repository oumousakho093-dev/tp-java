Réponses — 

Question 1
La version de Java utilisée est 25.0.4.1 LTS.
La différence entre java et javac est que java permet d'exécuter un programme et javac permet de compiler un programme.

Question 2
Après javac, un fichier Bonjour.class est créé. Il contient le bytecode Java.

 Question 3
En Java, la commande javac Bonjour.java permet de détecter les erreurs de syntaxe et de compilation avant d'exécuter le programme.

 Question 5
En Java, les erreurs de compilation sont signalées avant l'exécution, alors qu'en Python, certaines erreurs apparaissent pendant l'exécution.
 
 Question 6
Java refuse de compiler si une variable de type int reçoit du texte, car int correspond à un nombre entier.

Question 7
Le dossier target/ en Java joue un rôle similaire à certains dossiers générés en Python. On ne les versionne pas dans Git, car ils peuvent être recréés automatiquement.

Question 8
La balise <dependency> joue le même rôle que pip et requirements.txt en Python : elle permet de déclarer les bibliothèques nécessaires au projet.

 Question 9
Maven stocke les bibliothèques téléchargées dans le dépôt local .m2/repository. Cela permet de réutiliser une bibliothèque sans la télécharger à chaque fois.

Question 10
groupId identifie le groupe ou l'organisation, artifactId identifie le projet et version indique sa version.

Un projet Python simple n'a pas nécessairement besoin de ces informations pour créer un fichier .py.

 Question 11
En Python, on utilise def pour définir une fonction. En Java, on peut utiliser public static void pour déclarer une méthode qui ne renvoie rien.

 Question 12
Le comportement n'est pas le même : Java lève une exception pour une liste vide, tandis qu'en Python, une division par zéro provoque une erreur.

Question 13
En Java, le dossier fr/b1 doit correspondre au package fr.b1 pour que le fichier soit placé dans le bon package.

En Python, il n'est pas nécessaire d'avoir exactement la même structure de dossiers pour importer tous les modules.

 Question 14
Le message obtenu est package com.google.gson does not exist et cannot find symbol: class Gson`.

En Python, si un module demandé n'est pas installé, une erreur apparaît lors de son import ou de son utilisation.

Question 15
L'erreur est release version 25 not supported.
La ligne du 'pom.xml' qui provoque cette erreur est :
<maven.compiler.release>25</maven.compiler.release>

Le JDK 21 ne peut pas compiler pour la version 25.

Question 16
JAVA_HOME indique où Java est installé. La modification avec $env: ou export disparaît quand on ferme le terminal, car elle est temporaire.

 Question 17
Une entreprise garde Java 21 parce qu'il est stable et pour éviter les problèmes de compatibilité.

 Question 18
En Python, on peut utiliser pyenv`pour gérer plusieurs versions de Python et créer un environnement virtuel avec : py -3.12 -m venv .venv

Le .venv garde la version de Python avec laquelle il a été créé.

Synthèse Python / Java

| Critère | Python | Java |
|---|---|---|
| Exécution du code | Interprété | Compilé en bytecode, exécuté par la JVM |
| Commande pour lancer le programme | python main.py | java Main |
| Typage : vérifié quand ? | À l'exécution | À la compilation |
| Outil de dépendances | pip | Maven |
| Fichier de dépendances | requirements.txt | pom.xml |
| Où sont stockées les bibliothèques | Dans .venv ou l'environnement Python | Dans le dépôt Maven local .m2/repository |
| Choisir la version du langage par projet | venv et pyenv | JDK et JAVA_HOME |
| Dossier généré à ignorer dans Git | .venv/ | target/ |
| Calcul d'une moyenne | sum(notes) / len(notes) | notes.stream().mapToInt(Integer::intValue).average() |

Qustion 19. Java compilé : avantage : détecte les erreurs plus tôt ; inconvénient : nécessite une compilation. 

Python interprété : avantage : rapide à tester; inconvénient : certaines erreurs apparaissent seulement à l’exécution. 

Question 20. Le .jar contient du bytecode Java, exécuté par la JVM. Il faut installer une JVM compatible sur la machine. 

Question 21. Dans une application de 50 000 lignes, car les erreurs peuvent être plus nombreuses et difficiles à trouver. Java peut détecter certaines erreurs dès la compilation. 

Question 22. Renommer des fichiers : Python, car il est simple pour automatiser des tâches. 
Application Android : Java, car il permet de développer des applications Android. 
Analyse de données : Python, grâce à ses bibliothèques. 
Serveur d’une banque : Java, pour sa robustesse et sa gestion des grands projets. 

Question 23. nstaller les outils, préparer le projet, gérer les dépendances, configurer l’environnement, exécuter le programme et utiliser Git. 

Conclusion : les outils comme VS Code, le terminal et Git peuvent être utilisés avec différents langages. 
