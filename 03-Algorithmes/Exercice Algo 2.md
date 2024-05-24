# Exercice 2a.1 : Tri de nombres

Lire 2 nombres entier A et B puis les afficher dans l’ordre croissant.

```
VARIABLES

A est un ENTIER
B est un ENTIER

TRAITEMENT

ECRIRE "Saisissez un nombre : "
LIRE A

ECRIRE "Saisissez un nombre : "
LIRE B

SI A < B
    ECRIRE A, " ", B

    SINON
        ECRIRE B, " ", A
FIN SI
```

# Exercice 2a.2 : Es-tu majeur ?

Lire un nombre A correspondant à un âge (en années).
Afficher “Vous êtes majeur” ou “Vous êtes mineur” selon le cas.
Pour un nombre négatif le message doit être “Vous n’êtes pas encore né”.

```
VARIABLES

age est un ENTIER

TRAITEMENT

SI age < 0
    ECRIRE "Vous n'êtes pas encore né."

    SINON SI age >= 0 && age < 18
        ECRIRE "Vous êtes mineur."

        SINON
            ECRIRE "Vous êtes majeur."
FIN SI
```

# Exercice 2a.3 : Ma retraite

Lire un nombre A correspondant à un âge (en années).
Selon l’âge fourni, le programme doit afficher l’un des messages suivants :
Vous êtes à la retraite depuis X années
Il vous reste X années avant la retraite.
C’est le moment de prendre sa retraite.
La valeur fournie n’est pas un âge valide.

```
VARIABLES

age est un ENTIER
retraiteApres est un ENTIER
retraiteAvant est un ENTIER

TRAITEMENT

ECRIRE "Saisissez votre âge : "
LIRE age

retraiteApres = age - 60
retraiteAvant = 60 - age

SI age > 60
    ECRIRE "Vous êtes à la retraite depuis ", retraiteApres, " années."
SI age < 60
    ECRIRE "Il vous reste ", retraiteAvant, " années avant la retraite."
SI age = 60
    ECRIRE "C'est le moment de prendre sa retraite."

SINON 
    ECRIRE "La valeur fournie n'est pas un âge valide."
```

# Exercice 2a.4 : Tri de nombres++

Lire 3 nombres entier A, B et C puis les afficher dans l’ordre décroissant.

```
VARIABLES

A est un ENTIER
B est un ENTIER
C est un ENTIER

TRAITEMENT

ECRIRE "Saisissez un premier nombre : "
LIRE A
ECRIRE "Saisissez un deuxième nombre : "
LIRE B
ECRIRE "Saisissez un troisième nombre : "
LIRE C

```



# Exercice 2a.5 : Ma bicyclette

Réalisez l’algorithme et le programme correspondant au texte ci-dessous :

S’il fait beau demain, j’irai faire une balade à bicyclette.

Je n’ai pas utilisé ma bicyclette depuis plusieurs mois, peut-être n’est-elle plus en parfait état de fonctionnement.

Si c’est le cas, je passerai chez le garagiste avant la balade. J’espère que les réparations seront immédiates sinon je devrai renoncer à la balade en bicyclette. Comme je veux de toute façon profiter du beau temps, si mon vélo n’est pas utilisable, j’irai à pied jusqu’à l’étang pour cueillir les joncs.

S’il ne fait pas beau, je consacrerai ma journée à la lecture. J’aimerais relire le 1er tome de Game of Thrones. Je pense posséder ce livre, il doit être dans la bibliothèque du salon.

Si je ne le retrouve pas, j’irai l’emprunter à la bibliothèque municipale. Si le livre n’est pas disponible, j’emprunterai un roman policier.

Je rentrerai ensuite directement à la maison.

Dès que j’aurai le livre qui me convient, je m’installerai confortablement dans un fauteuil et je me plongerai dans la lecture.

```
VARIABLES

beauTemps est un BOOLEEN
veloOk est un BOOLEEN
reparationsImmediate est un BOOLEEN
livrePossede est un BOOLEEN
livreDispoBibliotheque est un BOOLEEN


TRAITEMENT

SI beauTemps = VRAI ALORS
    ECRIRE "Je vais me ballader"

    SI veloOk = VRAI ALORS 
        ECRIRE "J'irais faire une balade à bicyclette"
    SINON
        ECRIRE "Je vais chez le garagiste"

        SI reparationImmediates = VRAI ALORS
            ECRIRE "j'irai me ballader à bicyclette"
        SINON
            ECRIRE "J'irai ceuillir des joncs" 

    FIN SI
FIN SI

SINON 
    ECRIRE "Je vais lire un livre"

    SI livrePossede = FAUX ALORS 
        ECRIRE "Je vais à la bibliothèque"

            SI livreDispoBibliothèque = VRAI ALORS
                ECRIRE "j'emprunte GoT"

                SINON
                    ECRIRE "J'emprunte un roman policier"
                
                FIN SI

            ECRIRE "Je rentre chez moi"

                SINON
                  ECRIRE "Je lis GoT"

                FIN SI

            ECRIRE "Lecture de mon livre dans le fauteuil"

        FIN SI
```

# Exercice 3a.1 : Contrôler la saisie

L’utilisateur est invité à saisir son prénom.

Le programme affiche ensuite “Bonjour” suivi du prénom saisi.

Le prénom doit contenir au moins 2 caractères.

Si le prénom contient moins de 2 caractères, l’utilisateur doit recommencer la saisie.

L’utilisateur dispose d’un nombre d’essai illimité.

```
VARIABLES

prenom est un STRING

TRAITEMENT

ECRIRE "Saisissez votre prénom : "
LIRE prenom

SI prenom.length() < 2
    POUR i de 0 à 3; i++
        ECRIRE "Le prénom doit contenir au moins 2 caractères, veuillez recommencer : "
        LIRE prenom
    FIN POUR


SINON
    ECRIRE "Bonjour " + prenom
```

# Exercice 3a.4 : Recherche des diviseurs d’un nombre.

Lire un nombre entier et afficher tous ses diviseurs autres que 1 et lui-même.

```
VARIABLES

nombreEntier est un ENTIER
moitie est un ENTIER

TRAITEMENT

ECRIRE "Saisissez un nombre"
LIRE nombreEntier

moitie <== (nombreEntier / 2)

ECRIRE "Les diviseurs de ", nombreEntier, " sont : "

POUR i de 2 à moitie; i++
    SI (nombreEntier % i == 0)
        ECRIRE i, " "
    FIN SI
```


