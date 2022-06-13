# bloggy
Rapport de projet

                1- A propos du projet
L’objectif de ce projet était de concevoir un blog avec les fonctions de création et modification du profil utilisateur et des postes.
Pour accéder au blog, ce dernier doit s’inscrire ou se connecter dans le blog.
L’utilisateur est capable de faire des publications et de les voir. Il peut également voir et modifier ses informations personnelles.
Voici les différentes pages qui sont disponibles :
La page de connexion
La page d’accueil
La page de publication
La page de modification des informations personnelles
La page listant les publications et page de modification
Important : Vous devrez importer la base de données jointe dans le projet et la nommer bloggy. Il s’agit d’une base de données mysql
Technologies utilisées
Comme il a été demandé, l’application a été entièrement développée en Java. Nous avons eu recours à Java Swing pour sa conception et l’avons développé avec l’éditeur NetBeans.

                2- Structure du code
L’application suit l'architecture (MVC Model – View – Controller).
Dans le package Model, vous avez les attributs de chacune des entités existantes :
user
post
Dans le package View se trouve la partie graphique de l’application, réalisée avec Java Swing.
Le package Controller quant à lui regroupe toutes les méthodes utilisées :
Création de l’utilisateur
Modifier l’utilisateurs
Création de publication
Modifier et supprimer les publications
Lister les publications
Il existe également un package DAO (Data Access Object) qui renferme la classe réservée pour la connexion.

                3- Comment lancer bloggy
Pour lancer le projet , il faut aller dans 						Bloggy\src\main\java\views
Faire un clic droit sur “login.java” puis sur “Run file”.
Afin de voir certain changement s'effectuer des réactualisations des pages sont nécessaire. Pour ce faire il suffira d’utiliser le bouton back pour revenir en arrière et rouvrir la page
