# Exercices Algèbre


## Lumière du plafonnier

La lumière d'un véhicule s'éclaire si une des deux portes avant est ouverte (capteurs pd et pg à coupure de circuit) ou si l'interrupteur du plafonnier est appuyé.


**Présentez** :

-	Les propositions
-	La table de vérité
-	L'expression booléenne simplifiée


**Les Propositions** :

- P1 : Lumière allumée
- P2 : Porte gauche ouverte
- P3 : Porte droite ouverte
- P4 : Interrupteur plafonnier appuyé

**Table de vérité** :

| Entrée | Entrée | Entrée |  | Sortie |
| --- | --- | --- | --- | --- |
| P2 | P3 | P4 | = | P1 |
| 0 | 0 | 0 | = | 0 |
| 0 | 0 | 1 | = | 1 |
| 0 | 1 | 0 | = | 1 |
| 0 | 1 | 1 | = | 1 |
| 1 | 0 | 0 | = | 1 |
| 1 | 0 | 1 | = | 1 |
| 1 | 1 | 0 | = | 1 |
| 1 | 1 | 1 | = | 1 |


**Expressions booléenne simplifiée** :

P1 = P2+P3+P4


## Les 3 couleurs

**A**

| Entrée | Entrée | Entrée |  | Sortie |
| --- | --- | --- | --- | --- |
| P2 | P3 | P4 | = | P1 |
| 0 | 0 | 0 | = | 0 |
| 0 | 0 | 1 | = | 0 |
| 0 | 1 | 0 | = | 0 |
| 0 | 1 | 1 | = | 0 |
| 1 | 0 | 0 | = | 0 |
| 1 | 0 | 1 | = | 0 |
| 1 | 1 | 0 | = | 0 |
| 1 | 1 | 1 | = | 1 |

*P1 = P2.P3.P4*

**B**

| Entrée | Entrée | Entrée |  | Sortie |
| --- | --- | --- | --- | --- |
| P2 | P3 | P4 | = | P1 |
| 0 | 0 | 0 | = | 0 |
| 0 | 0 | 1 | = | 0 |
| 0 | 1 | 0 | = | 0 |
| 0 | 1 | 1 | = | 0 |
| 1 | 0 | 0 | = | 0 |
| 1 | 0 | 1 | = | 1 |
| 1 | 1 | 0 | = | 1 |
| 1 | 1 | 1 | = | 0 |

*P1 = P2.P3+P4*

**C**

| Entrée | Entrée | Entrée |  | Sortie |
| --- | --- | --- | --- | --- |
| P2 | P3 | P4 | = | P1 |
| 0 | 0 | 0 | = | 0 |
| 0 | 0 | 1 | = | 0 |
| 0 | 1 | 0 | = | 0 |
| 0 | 1 | 1 | = | 0 |
| 1 | 0 | 0 | = | 0 |
| 1 | 0 | 1 | = | 1 |
| 1 | 1 | 0 | = | 1 |
| 1 | 1 | 1 | = | 0 |

*P1 = P2.P3+P4*

**D**

| Entrée | Entrée | Entrée |  | Sortie |
| --- | --- | --- | --- | --- |
| P2 | P3 | P4 | = | P1 |
| 0 | 0 | 0 | = | 0 |
| 0 | 0 | 1 | = | 0 |
| 0 | 1 | 0 | = | 0 |
| 0 | 1 | 1 | = | 0 |
| 1 | 0 | 0 | = | 0 |
| 1 | 0 | 1 | = | 1 |
| 1 | 1 | 0 | = | 0 |
| 1 | 1 | 1 | = | 1 |

*P1 = P2+P3.P4*

## Simplification équations

R1 = A.B + A./B = A.B + /B = A.1 = **A**
R2 = A + AC +AB = A + A.B + C = **A.B + C**
R3 = (A+B)(/A+B) = B.A + NON A = B.1 = **B**
R4 = /AB + (/A./B.D)A
R5 = (A + C)(/A + C)(1) = C.A + NON A (1) = C.1(1) = C