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

# Exercice 2.1 : Positif ou Négatif ?

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

# Exercice 2.2 : Positif ou Négatif (bis) ?

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

# Exercice 2.3 : Ma catégorie au Football

Écrire un algorithme qui demande à l’utilisateur de saisir un âge et l’informe ensuite à quelle catégorie il appartient 

```
VARIABLES
    age est un Entier
    categorie est un STRING

TRAITEMENT
    ECRIRE "Veuillez saisir votre âge"
    LIRE age

    SI age <= 5 ALORS
        categorie = Trop jeune
    SINON SI age <= 6 ALORS
        categorie = Débutant
    SINON SI age <= 8 ALORS
        categorie = poussin
    SINON SI age <= 10 ALORS
        categorie = benjamin
    SINON SI age <= 12 ALORS
        categorie = pupille
    SINON SI age <= 14 ALORS
        categorie = minime
    SINON SI age <= 16 ALORS
        categorie = cadet
    SINON SI age <= 18 ALORS
        categorie = junior
    SINON SI age <= 34 ALORS
        categorie = sénior
    SINON
        categorie = vétéran

    ECRIRE "Vous êtes dans la catégorie ", categorie
```


# Exercice 2.4 : Je prédis l'avenir

Le programme demande à l’utilisateur de saisir 2 nombres entiers correspondant respectivement à des heures et des minutes. Le programme affichera ensuite l’heure qu’il sera 3 minutes plus tard.

Par exemple, si l’utilisateur saisit 23 puis 12 (correspondant à 23h12), le programme doit afficher Dans 3 minutes, il sera 23h15.

Si les nombres saisis par l’utilisateur sont “hors limite”, le programme affichera “Les données saisies sont invalides”

```
VARIABLES
    heures est un ENTIER
    minutes est un ENTIER
    plus3Minutes est un ENTIER

TRAITEMENT
    ECRIRE "Veuillez saisir l'heure"
    LIRE heure
    ECRIRE "Veuillez saisir les minutes"
    LIRE minutes

    SI heures > 23 OU heures < 0 OU minutes > 59 OU minutes < 0
        ECRIRE "Les données saisies sont invalides"

    SINON

    plus3Minutes <-- (minutes + 3)

    SI plus3Minute > 60
        Alors plus3Minutes -= 60
              heures += 1
              
    SI heures > 23
        Alors heures = 0

    ECRIRE "Dans 3 minutes, il sera ", heures, "h ", plus3Minutes, ". "
```

# Exercice 2.5 : Réprographie

Un magasin proposant un service de Réprographie facture 0.10€ les 10 premières photocopies, 0.09€ les vingt suivants et 0.08 au delà.

Écrire l’algorithme qui demande à l’utilisateur de saisir le nombre de photocopies effectuées et affiche le montant de la facture correspondante.

```
CONSTANTE
P1 est un REEL <-- 0.10
P2 est un REEL <-- 0.09
P3 est un REEL <-- 0.08

VARIABLES
nombrePhotocopies est un ENTIER
facture est un DECIMAL

TRAITEMENT
ECRIRE "Veuillez saisir le nombre de photocopies"
LIRE nombrePhotocopies

SI nombrePhotocopies <= 10
    ALORS facture = nombrePhotocopies * P1
SI nombrePhotocopies <=30 
    ALORS facture = (10 * P1) + (nombrePhotocopies - 10) * P2
SINON
    ALORS facture = (10 * P1) + (20 * P2) + (nombrePhotocopies - 30) * P3

ECRIRE "Le montant à payer est de : ", facture, " €."
```

# Exercice 2.6 : Elections

Les élections législatives, en Guignolerie Septentrionale, obéissent à la règle suivante :

Lorsque l’un des candidats obtient plus de 50% des suffrages, il est élu dès le premier tour.
En cas de deuxième tour, peuvent participer uniquement les candidats ayant obtenu au moins 12.5% des voix au premier tour.
Vous devez écrire un algorithme qui permet la saisie des scores de quatre candidats au premier tour.

Cet algorithme traitera ensuite le candidat numéro 1 (et uniquement lui) : il dira s’il est élu, battu, s’il se trouve en ballottage favorable (il participe au second tour en étant arrivé en tête à l’issue du premier tour) ou défavorable (il participe au second tour sans avoir été en tête au premier tour).

```
VARIABLES
premierCandidat est un DECIMAL
deuxiemeCandidat est un DECIMAL
troisiemeCandidat est un DECIMAL
quatriemeCandidat est un DECIMAL
resultat est un STRING

TRAITEMENT
ECRIRE "Score du premier candidat"
LIRE premierCandidat
ECRIRE "Score du deuxieme candidat"
LIRE deuxiemeCandidat
ECRIRE "Score du troisieme candidat"
LIRE troisiemeCandidat
ECRIRE "Scrore du quatrieme candidat"
LIRE quatrieme candidat"

SI ((premierCandidat + deuxiemeCandidat + troisiemeCandidat + quatriemeCandidat) <= 100) 

SI premierCandidat > 50
    ALORS resultat <-- "Le candidat numéro 1 est élu dès le premier tour"
SINON SI premierCandidat < 12.5
    ALORS resultat <-- "Le candidat numéro 1 a perdu l'élection"
SINON SI ((premierCandidat > deuxiemeCandidat) && (premierCandidat > troisiemeCandidat) && (premierCandidat > quatriemeCandidat))
    ALORS resultat <-- "Le candidat numéro 1 est en ballottage favorable"
SINON SI ((premierCandidat < deuxiemeCandidat) || (premierCandidat < troisiemeCandidat) || (premierCandidat < quatriemeCandidat))
    ALORS resultat <-- "Le candidat numéro 1 est en ballottage défavorable"
SINON
    ALORS resultat <-- "On annule tout"

ECRIRE resultat
```

# Exercice 2.7 : Tarif Assurance

Une compagnie d’assurance automobile propose à ses clients quatre familles de tarifs identifiables par une couleur, du moins au plus onéreux :

Tarifs bleu, vert, orange et rouge.
Le tarif dépend de la situation du conducteur :

Un conducteur de moins de 25 ans et titulaire du permis depuis moins de deux ans, se voit attribuer le tarif rouge, si toutefois il n’a jamais été responsable d’accident. Sinon, la compagnie refuse de l’assurer.

Un conducteur de moins de 25 ans et titulaire du permis depuis plus de deux ans, ou de plus de 25 ans mais titulaire du permis depuis moins de deux ans a le droit au tarif orange s’il n’a jamais provoqué d’accident, ou le tarif rouge s’il a été repsonsable d’un accident, sinon il est refusé.

Un conducteur de plus de 25 ans titulaire du permis depuis plus de deux ans bénéficie du tarif vert s’il n’est à l’origine d’aucun accident et du tarif orange pour un accident, du tarif rouge pour deux accidents, et refusé au-delà

De plus, pour encourager la fidélité des clients acceptés, la compagnie propose un contrat de la couleur immédiatement la plus avantageuse s’il est assuré depuis plus de cinq ans. Ainsi, s’il satisfait à cette exigence, un client normalement “vert” devient “bleu”, un client normalement “orange” devient “vert”, et le “rouge” devient orange.

Ecrire l’algorithme permettant de saisir les données nécessaires (sans contrôle de saisie) et de traiter ce problème. Avant de se lancer à corps perdu dans cet exercice, on pourra réfléchir un peu et s’apercevoir qu’il est plus simple qu’il n’en a l’air (cela s’appelle faire une analyse !)…

```
VARIABLES
age = 25 est un ENTIER
permis = 2 est un ENTIER
accident est un ENTIER
tempsAssure est un ENTIER
tarif est un STRING

TRAITEMENT
ECRIRE "Saisir âge"
LIRE age
ECRIRE "Depuis combien de temps avez-vous le permis"
LIRE permis
ECRIRE "Avez-vous déjà eu un accident, si oui, combien"
LIRE accident
ECRIRE "Depuis combien de temps êtes vous assuré"
LIRE tempsAssure

SI age < 25 ET permis < 2 ET accident == 0 ET tempsAssure < 5
    ALORS tarif = rouge
        SINON SI age < 25 ET permis < 2 ET accident == 0 ET tempsAssure > 5
            ALORS tarif = orange
SINON SI age < 25 ET permis > 2 ET accident == 0 ET tempsAssure < 5
    ALORS tarif = orange
        SINON SI age < 25 ET permis > 2 ET accident == 0 ET tempsAssure > 5
            ALORS tarif = vert
SINON SI age > 25 ET permis < 2 ET accident == 1 ET tempsAssure < 5
    ALORS tarif = rouge
        SINON SI age > 25 ET permis < 2 ET accident == 1 ET tempsAssure > 5
            ALORS tarif = orange
SINON SI age > 25 ET permis > 2 ET accident == 0 ET tempsAssure < 5
    ALORS tarif = vert
        SINON SI age > 25 ET permis > 2 ET accident == 0 ET tempsAssure > 5
            ALORS tarif = bleu
SINON SI age > 25 &ET permis > 2 ET accident == 1 ET tempsAssure < 5
    ALORS tarif = orange
        SINON SI age > 25 ET permis > 2 ET accident == 1 ET tempsAssure > 5
            ALORS tarif = vert
SINON SI age > 25 ET permis > 2 ET accident == 2 ET tempsAssure < 5
    ALORS tarif = rouge
        SINON SI age > 25 ET permis > 2 ET accident == 2 ET tempsAssure > 5
            ALORS tarif = orange

                SINON
                    ECRIRE "La compagnie refuse de vous assurer"

ECRIRE "La compagnie vous attribue le tarif " + tarif"
```

# Exercice 2.8 : Validité d'une date

Écrivez un algorithme qui demande à l’utilisateur de saisir 3 nombres entiers

Un numéro de jour
Un numéro de mois
Un numéro d’année
L’algorithme indique ensuite s’il s’agit ou non d’une date valide.

Il n’est sans doute pas inutile de rappeler rapidement que le mois de février compte 28 jours, sauf si l’année est bissextile, auquel cas il en compte 29.

L’année est bissextile si elle est divisible par quatre. Toutefois, les années divisibles par 100 ne sont pas bissextiles, mais les années divisibles par 400 le sont. Ouf !

```
VARIABLES
jour est un ENTIER
mois est un ENTIER
annee est un ENTIER
date est une CHAINE DE CARACTERE


TRAITEMENT
ECRIRE "Saisir numéro jour"
LIRE jour
ECRIRE "Saisir numéro mois"
LIRE mois
ECRIRE "Saisir numéro année"
LIRE annee

SI (jour < 1 || jour > 31 || mois < 1 || mois > 12)
    date = "Il ne s'agit pas d'une date valide"
    
    SINON SI (jour > 30)
    Dans le cas 2, 4, 6, 9, 11
    date = "Il ne s'agit pas d'une date valide"
        SINON SI (annee % 4 == 0 && mois == 2 && jour > 29)
        date = "Il ne s'agit pas d'une date valide"
            SINON SI (annee % 4 != 0 && mois == 2 && jour > 28)
            date = "Il ne s'agit pas d'une date valide"

SINON 
    date = "Il s'agit d'une date valide"

ECRIRE date
```

# Exercice 3.1 : La bonne plage de sable

Écrire un algorithme qui demande à l’utilisateur de saisir un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Bravo, vous avez réussi !”.

```
VARIABLE
nombreUtilisateur est un ENTIER

TRAITEMENT
ECRIRE "Saisir un nombre entre 1 et 3"
LIRE nombreUtilisateur

TANT QUE nombreUtilisateur < 1 || nombreUtilisateur > 3
ALORS REPETER

SINON ECRIRE "Bravo, vous avez réussi ! Vous avez saisi le nombre : ", nombreUtilisateur
```

# Exercice 3.2 : La bonne plage de galets

Écrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne.

En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Yes, you did it !”.

```
VARIABLE
nombreUtilisateur est un ENTIER

TRAITEMENT
ECRIRE "Saisir un nombre entre 10 et 20"
LIRE nombre Utilisateur

SI nombreUtilisateur < 10
    ECRIRE "Plus grand !"
SINON SI nombreUtilisateur > 20
    ECRIRE "Plus petit !"

TANT QUE nombreUtilisateur < 10 OU nombreUtilisateur > 20
ALORS REPETER

SINON ECRIRE "Yes ! You did it !"
```

# Exercice 3.3 : Les nombres suivants

Écrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants.

Par exemple, si l’utilisateur entre le nombre 17, le programme affichera :

Les 10 nombres après 17 sont: 18, 19 ,20 ,21 ,22 ,23 ,24 ,25 ,26 ,27

Écrire cet algorithme dans un premier temps avec une boucle tant que, puis écrivez une 2nde version avec une boucle pour.

```
VARIABLES
nombreUtilisateur est un ENTIER
nombreUtilisateurPlus10 est un ENTIER

TRAITEMENT
ECRIRE "Saisir un nombre : "
LIRE nombreUtilisateur

nombreUtilisateurPlus10 <== nombreUtilisateur + 10

ECRIRE "Les 10 nombres après ", nombreUtilisateur, " sont : "

TANT QUE nombreUtilisateur <= nombreUtilisateurPlus10
    ALORS
    ECRIRE nombreUtilisateur, " "
    nombreUtilisateur++
```

```
VARIABLES
nombreUtilisateur est un ENTIER
nombreUtilisateurPlus10 est un ENTIER

TRAITEMENT
ECRIRE "Saisir un nombre : "
LIRE nombreUtilisateur

nombreUtilisateurPlus10 <== nombreUtilisateur + 10

ECRIRE "Les 10 nombres après ", nombreUtilisateur, " sont : "

POUR nombreUtilisateur <= nombreUtilisateurPlus10 ; nombreUtilisateur++
ECRIRE "nombreUtilisateur", " "
```

# Exercice 3.4 : La somme

Écrire un algorithme qui demande un nombre de départ, et qui calcule et affiche la somme des entiers jusqu’à ce nombre.

Par exemple, si l’utilisateur saisit le nombre 5, le programme doit afficher :

La somme des nombres jusque 5 est: 15

```
VARIABLES
nombreUtilisateur est un ENTIER
i est un ENTIER
somme est un ENTIER

TRAITEMENT
ECRIRE "Saisir un nombre"
LIRE nombreUtilisateur

TANT QUE
    i <= nombreUtilisateur
ALORS
    somme += i
    i++

ECRIRE "La somme des nombres jusqu'à ", nombreUtilisateur, " est : ", somme
```

# Exercice 3.5 : La factorielle

Écrire un algorithme qui demande à l’utilisateur de saisir un nombre, et qui calcule et affiche sa factorielle.

Par exemple, si l’utilisateur saisit le nombre 8, le programme doit afficher :

La factorielle de 8 est: 40320

```
VARIABLES
nombreUtilisateur est un ENTIER
i est un ENTIER
factorielle est un ENTIER

TRAITEMENT
ECRIRE "Saisir un nombre"
LIRE nombreUtilisateur

TANT QUE
    i <= nombreUtilisateur
ALORS
    somme *= i
    i++

ECRIRE "La factorielle de ", nombreUtilisateur, " est : ", factorielle
```

# Exercice 3.6 : Et le plus grand est…

Érire un algorithme qui demande successivement 20 nombres à l’utilisateur, et qui lui indique ensuite quel est le plus grand parmi ces 20 nombres.

```
VARIABLES
nombre est un ENTIER
nombreMax est un ENTIER
ligneMax est un ENTIER

TRAITEMENT
POUR int i = 1; i <= 20; i++
    ECRIRE "Entrez le nombre numéro " + i + " : "
    LIRE nombre

        SI nombre > nombreMax
        ALORS nombreMax = nombre
              ligneMax = i

ECRIRE  "Résultat : "
ECRIRE  "Le plus grand des nombres saisis est : " + nombreMax
ECRIRE  nombreMax + " était le nombre numéro " + ligneMax
```

# Exercice 3.7 : Et le plus grand est… encore.

Réécrire l’algorithme précédent, mais cette fois-ci on ne connaît pas d’avance combien l’utilisateur souhaite saisir de nombres. La saisie des nombres s’arrête lorsque l’utilisateur entre un zéro.

```
VARIABLES
nombre est un ENTIER
nombreMax est un ENTIER
ligneMax est un ENTIER
i est un ENTIER

TRAITEMENT
TANT QUE nombre != 0
    ECRIRE "Entrez le nombre numéro " + i + " : "
    LIRE nombre

        SI (nombre > nombreMax)
		    ALORS   nombreMax = nombre
		            ligneMax = i

    i++

ECRIRE  "Résultat : "
ECRIRE  "Le plus grand des nombres saisis est : " + nombreMax
ECRIRE  nombreMax + " était le nombre numéro " + ligneMax
```

