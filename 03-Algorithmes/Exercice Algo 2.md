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

SI A > B && B > C
    max = A
	moy = B
	min = C

SINON SI B > A && A > C
	max = B
	moy = A
	min = C

SINON SI A > C && C > B
	max = A
	moy = C
	min = B

SINON SI C > B && B > A
	max = C
	moy = B
	min = A

SINON SI C > A && A > B
	max = C
	moy = A
	min = B

ECRIRE max + ", " + moy + ", " + min
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

# Exercice 3a.2 : Contrôler la saisie avec limite

L’utilisateur est invité à saisir un mot de passe.
Si le mot de passe saisi est correct, le programme affiche “Vous êtes connecté”.
Dans le cas contraire, l’utilisateur doit recommencer la saisie.
L’utilisateur dispose de 3 essais maximum.
Au 3ème échec, le programme affiche “Votre compte est bloqué” et se termine.
Note : Le bon mot de passe est formation

```
VARIABLES

saisieUtilisateur est un STRING
essais est un ENTIER

TRAITEMENT

FAIRE
ECRIRE "Saisissez un mot de passe : "
LIRE saisieUtilisateur

SI saisieUtilisateur = "formation"
    ECRIRE "Vous êtes connecté."

    SINON SI saisieUtilisateur != "formation
        ECRIRE "Erreur."
FIN SI

TANT QUE essais < 3

SI essais = 3
    ECRIRE "Votre compte est bloqué."
```

# Exercice 3a.3 : Intervalle entre 2 nombres.

Lire 2 nombres entier A et B puis afficher tous les nombres entier dans l’intervalle.

```
VARIABLES

A est un ENTIER
B est un ENTIER

TRAITEMENT

SI A > B
    ECRIRE "Résultat : "
        TANT QUE A != B
            A -= 1
            ECRIRE A, " "
        FIN TANT QUE
FIN SI

SI B > A
    ECRIRE "Résultat : "
        TANT QUE B != A
            A += 1
            ECRIRE A, " "
        FIN TANT QUE
FIN SI
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

# Exercice 5.1 : Rechercher un nombre dans un tableau

Soit un tableau de nombres entier triés par ordre croissant.
Exemple: [8, 16, 32, 64, 128, 256, 512]
Chercher si un nombre donné N figure parmi les éléments.
Si oui, afficher la valeur de l’indice correspondant. Sinon, afficher « Nombre non trouvé ».

```
VARIABLES

N est un ENTIER
resultat = false est un BOOLEEN

tableau contient {8, 16, 32, 64, 128, 256, 512}

ECRIRE "Saisissez un nombre : "
LIRE N

POUR i de 0 à tableau.length, i++
    SI N == tableau[i]
        ECRIRE "La valeur se trouve à l'indice " + i + " dans le tableau."
        resultat = true
    FIN SI
FIN POUR

SI !resultat
    ECRIRE "Nombre non trouvé."
```

# Exercice 5.2 : Rechercher le nombre d’occurences d’une lettre dans une phrase

Soit une chaîne de caractères terminée par le caractère « . ».
Donnez l’algorithme d’un programme qui compte le nombre d’occurrences d’une lettre donnée (“a” par exemple) dans cette chaîne.
Si la chaîne de caractères est vide ou n’est composée que d’un caractère « . », le message “LA CHAINE EST VIDE” sera affiché.
Proposez un jeu d’essai prévoyant les 3 cas suivants :

La phrase est vide
La lettre n’est pas présente
La lettre est présente une ou plusieurs fois

```
VARIABLES

phrase est un STRING
lettre est un STRING
occurence est un ENTIER
presente est un BOOLEEN

TRAITEMENT

ECRIRE "Saisissez une chaîne de caractères : "
LIRE phrase
ECRIRE "Ecrivez une lettre : "
LIRE lettre

tableau contient phrase splité
POUR i de 0 à tableau.length, i++
    SI tableau[i] contient lettre
        occurence += 1
        presente = true
    SINON SI tableau[i] contient "." && tableau.length < 2
        ECRIRE "La phrase est vide."
    FIN SI
FIN POUR

SI presente est false
    ECRIRE "La lettre n'est pas présente."
    
    SINON ("La lettre ", lettre, " est présente ", occurence, " fois.")
```

