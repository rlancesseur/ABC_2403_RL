# Exercices 1.1 : Hello World
Ecrire un programme qui affiche "Hello World !".


``` 
ECRIRE "Hello World !"
```

# Exercice 1.2 : Hello you
L’utilisateur est invité à saisir son prénom dans la console.

Le programme affiche “Bonjour “ suivi du prénom saisi.

```
VARIABLES
    prenom est une CHAINE DE CARACTERES

TRAITEMENT
    ECRIRE "Saisissez votre prénom"
    LIRE prenom
    ECRIRE "bonjour ", prenom, "."
```
Alternative avec contrôle sur la longueur du prénom

```
VARIABLES
    prenom est une CHAINE DE CARACTERES

TRAITEMENT
    ECRIRE "Saisissez votre prénom"
    LIRE prenom
    SI prenom.LONGUEUR > 2 ALORS
        ECRIRE "bonjour ", prenom, "."
    SINON
        ECRIRE "Prénom invalide"
    FIN SI
```

# Exercice 1.3 : Calcul de la moyenne de 2 nombres

L’utilisateur est invité à saisir 2 nombres entier.

Le programme calcule la moyenne des 2 nombres et affiche le résultat sous forme de nombre décimal.

```
VARIABLES
    premierNombre est un ENTIER
    secondeNombre est un ENTIER
    moyenne est un DECIMAL

TRAITEMENT
    ECRIRE "Veuillez saisir un premier nombre"
    LIRE premierNombre
    ECRIRE "Veuillez saisir un second nombre"
    LIRE secondNombre
    moyenne <-- (premierNombre + secondNombre) / 2

RESULTAT
    ECRIRE "La moyenne de ", premierNombre, " et ", secondNombre, "est :", moyenne
```

# Exercice 1.4 : Calcul de l’aire et du volume d’une sphère

Lire le rayon R d’une sphère puis calculer et afficher :

- Son aire = 4 π R²
- Son volume = (4 π R³)/3

```
VARIABLES
    R est un décimal
    aire est un décimal
    volume est un décimal

Traitement
    Lire R
    aire <-- (4 π R²)
    volume <-- (4 π R³)/3

Resultat
    Ecrire "Son aire = ", aire,
    Ecrire "Son volume = ", volume,