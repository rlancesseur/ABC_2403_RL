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
    prenom est une Chaine de caracteres

TRAITEMENT
    ECRIRE "Saisissez votre prénom"
    LIRE prenom
    ECRIRE "bonjour ", prenom, "."
```
Alternative avec contrôle sur la longueur du prénom

```
VARIABLES
    prenom est une Chaine de caracteres

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
    premierNombre est un Entier
    secondeNombre est un Entier
    moyenne est un Decimal

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

TRAITEMENT
    LIRE R
    aire <-- (4 * 3.14 * R²)
    volume <-- (4 * 3.14 * R³)/3

RESULTAT
    ECRIRE "Son aire = ", aire,
    ECRIRE "Son volume = ", volume,
```

# Exercice 1.5 : Calcul de la surface d’un secteur circulaire

Lire le rayon R d’un cercle et un angle A (en degré(s)).

Calculer et afficher :

L’ aire du secteur circulaire = (π R² A) / 360

```
VARIABLES
    R est un décimal
    A est un décimal
    aireSecteurCirculaire est un décimal

TRAITEMENT
    LIRE R
    LIRE A
    aireSecteurCirculaire <-- (3.14 * R² * A) / 360

RESULTAT
    ECRIRE "L'aire du secteur circulaire = ", aireSecteurCirculaire,
```

# Exercice 1.6 : Inversion de 2 valeurs

Lire 2 nombres entier A et B.

Afficher la valeur de A puis la valeur de B.

Mettre le contenu de A dans B et celui de B dans A.

Afficher à nouveau la valeur de A puis la valeur de B.

```
VARIABLES
    A est un Entier
    B est un Entier
    C est un Entier

TRAITEMENT
    LIRE A
    LIRE B   

    C <-- A
    A <-- B
    B <-- C

RESULTAT
    ECRIRE A
    ECRIRE B
```

# Exercice 2.1

Écrire un algorithme qui demande à l’utilisateur de saisir 1 nombre entier et l’informe ensuite si le nombre est positif ou négatif.

```
VARIABLES
    nombreEntier est un Entier

TRAITEMENT
    ECRIRE "Saisir un nombre entier"
    LIRE nombreEntier
    SI nombreEntier >= 0 ALORS
        ECRIRE "Le nombre est positif"
    SINON
        ECRIRE "Le nombre est négatif"
```

# Exercice 2.2

Écrire un algorithme qui demande à l’utilisateur de saisir 2 nombres entiers et l’informe ensuite si leur produit est positif ou négatif.

```
VARIABLES
    nombreEntier1 est un Entier
    nombreEntier2 est un Entier
    produit est un Entier

TRAITEMENT
    ECRIRE "Saisir un nombre entier"
    LIRE nombreEntier1
    ECRIRE "Saisir un second nombre entier"
    Lire nombreEntier2
    
    produit <-- (nombreEntier1 * nombreEntier2)

    SI produit >= 0 ALORS
        ECRIRE "Le nombre est positif"
    SINON
        ECRIRE "Le nombre est négatif"
```

# Exercice 2.3

Écrire un algorithme qui demande à l’utilisateur de saisir un âge et l’informe ensuite à quelle catégorie il appartient 

```
VARIABLES
    age est un Entier

TRAITEMENT
    ECRIRE "Veuillez saisir votre âge"
    LIRE age

    SI age < 5 ALORS
        ECRIRE "Vous être Trop jeune"
    SI 5 < age > 6 ALORS
        ECRIRE "Vous êtes Débutant"
    SI 7 < age > 8 ALORS
        ECRIRE "Vous êtes Poussin"
    SI 9 < age > 10 ALORS
        ECRIRE "Vous êtes Benjamin"
    SI 11 < age > 12 ALORS
        ECRIRE "Vous êtes Pupille"
    SI 13 < age > 14 ALORS
        ECRIRE "Vous êtes Minime"
    SI 15 < age > 16 ALORS
        ECRIRE "Vous êtes Cadet"
    SI 17 < age > 18 ALORS
        ECRIRE "Vous êtes Junior"
    SI 19 < age > 34 ALORS
        ECRIRE "Vous êtes Sénior"
    SINON
        ECRIRE "Vous êtes Vétéran"
```

Avec SWITCH :

```
VARIABLES
    age est un ENTIER
    tropJeune est un ENTIER
    debutant est un ENTIER
    poussin est un ENTIER
    benjamin est un ENTIER
    pupille est un ENTIER
    minime est un ENTIER
    cadet est un ENTIER
    junior est un ENTIER
    senior est un ENTIER

TRAITEMENT
    ECRIRE "Veuiller saisir votre âge"
    LIRE age

    Dans le cas ou age
        est egal à tropJeune ECRIRE "Vous êtes trop jeune"
        est egal à debutant ECRIRE "Vous êtes débutant"
        est egal à poussin ECRIRE "Vous êtes poussin"
        est egal à benjamin ECRIRE "Vous êtes benjamin"
        est egal à pupille ECRIRE "Vous êtes pupille"
        est egal à minime ECRIRE "Vous êtes minime"
        est egale à cadet ECRIRE "Vous êtes cadet"
        est egale à junior ECRIRE "Vous êtes junior"
        est egale à senior ECRIRE "Vous êtes senior"
