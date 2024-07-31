-- 1. Donner nom, job, numéro et salaire de tous les employés,
-- puis seulement des employés du département 10
-- SELECT ename, job, empno, sal, deptno FROM emp WHERE deptno=10 ;

-- 2 Donner nom, job et salaire des employés de type MANAGER dont le salaire est supérieur à 2800
SELECT ename, job, sal FROM emp WHERE job LIKE 'manager' AND sal >2800;


-- 3 Donner la liste des MANAGER n'appartenant pas au département 30
SELECT * FROM emp WHERE job LIKE 'Manager' AND deptno <> 30;

 
-- 4 Liste des employés de salaire compris entre 1200 et 1400
SELECT  ename, sal FROM emp WHERE sal BETWEEN 1200 AND 1400; 

-- 5 Liste des employés des départements 10 et 30 classés dans l'ordre alphabétique
SELECT ename FROM emp WHERE deptno IN(10,30) ORDER BY ename asc ;


-- 6 Liste des employés du département 30 classés dans l'ordre des salaires croissants

SELECT emp.ENAME, emp.sal, dept.dname  FROM emp NATURAL JOIN dept  WHERE deptno =30 ORDER BY sal ASC ;

-- 7 Liste de tous les employés classés par emploi et salaires décroissants

SELECT ename, job , sal FROM emp ORDER BY job ASC , sal DESC ;


-- 8 Liste des différents emplois

SELECT DISTINCT  job FROM emp;


-- 9 Donner le nom du département où travaille ALLEN 

SELECT dept.DNAME
FROM emp
INNER JOIN dept ON emp.DEPTNO=dept.DEPTNO
WHERE emp.ENAME LIKE 'ALLEN';

-- 10 Liste des employés avec nom du département, nom, job, salaire classés par noms de départements et par salaires décroissants.

SELECT dept.DNAME, emp.ENAME, emp.SAL, emp.JOB
FROM emp
NATURAL JOIN dept
ORDER BY dept.DNAME, emp.SAL DESC;


-- 11 Liste des employés vendeurs (SALESMAN) avec affichage de nom, salaire, commissions, salaire + commissions


SELECT ename, comm, sal, (sal + IFNULL(0,comm)) AS ' sal global'
FROM emp
WHERE job ="SALESMAN";

-- 12 Liste des employés du département 20: nom, job, date d'embauche sous forme VEN 28 FEV 1997'

SELECT ename, job, DATE_FORMAT(hiredate, '%a %d %b %Y') AS ' date d\'embauche' FROM emp WHERE deptno=20;

-- 13 Donner le salaire le plus élevé par département

SELECT dname, MAX(sal)
FROM dept
NATURAL JOIN emp
GROUP BY dname
ORDER BY MAX(sal) DESC;

-- 14 Donner département par département masse salariale, nombre d'employés, salaire moyen par type d'emploi.

SELECT dname AS 'Service', job AS 'emploi', SUM(sal) + SUM(IFNULL(comm, 0)) AS 'Masse salariale', COUNT(empno) AS 'Nombre d\'employés', ROUND(AVG(sal), 2) AS 'Moyenne salaires' FROM dept
NATURAL JOIN emp
GROUP BY dname, job;

-- 15 Même question mais on se limite aux sous-ensembles d'au moins 2 employés

SELECT dname AS 'Service', job AS 'emploi', SUM(sal) + SUM(IFNULL(comm, 0)) AS 'Masse salariale', COUNT(empno) AS 'Nombre d\'employés', ROUND(AVG(sal), 2) AS 'Moyenne salaires' FROM dept
NATURAL JOIN emp
GROUP BY dname, job
HAVING COUNT(empno) >= 2;


-- 16 Liste des employés (Nom, département, salaire) de même emploi que JONES

SELECT ename, dname, job, sal FROM emp, dept
WHERE dept.deptno = emp.deptno AND job = (SELECT job FROM emp WHERE ename = 'JONES') AND ename != 'JONES'; 


-- 17 Liste des employés (nom, salaire) dont le salaire est supérieur à la moyenne globale des salaires

SELECT ename, sal, (SELECT ROUND(AVG(sal),2) FROM emp) AS 'Salaire Moyen' FROM emp
WHERE sal > (SELECT AVG(sal) FROM emp);

-- 18 Création d'une table PROJET avec comme colonnes numéro de projet (3 chiffres), nom de projet(5 caractères), budget. Entrez les valeurs suivantes:
-- 101, ALPHA, 96000
-- 102, BETA, 82000
-- 103, GAMMA, 15000

DROP TABLE Projet;

CREATE TABLE projet
(num_proj SMALLINT(3) AUTO_INCREMENT PRIMARY KEY,
nom_proj VARCHAR(5) NOT NULL,
budget DECIMAL(15,2) NOT NULL);

ALTER TABLE projet AUTO_INCREMENT = 101;

INSERT INTO projet VALUES (num_proj, 'ALPHA', 96000),
(num_proj, 'BETA', 82000),
(num_proj, 'GAMMA', 15000); 

-- 19 Ajouter l'attribut numéro de projet à la table EMP et affecter tous les vendeurs du département 30 au projet 101, et les autres au projet 102
ALTER TABLE emp ADD COLUMN num_proj SMALLINT(3) NOT NULL;

 UPDATE emp SET num_proj = 102 WHERE (deptno = 30 AND job != 'SALESMAN') XOR deptno != 30;
 
-- VERSION 2  UPDATE emp SET num_proj = 102 WHERE empno != ANY
-- (SELECT empno FROM emp WHERE deptno = 30 AND job = 'SALESMAN'); 
 
 ALTER TABLE emp ADD CONSTRAINT FK_projet FOREIGN KEY (num_proj) REFERENCES projet(num_proj);

-- 20 Créer une vue comportant tous les employés avec nom, job, nom de département et nom de projet
CREATE VIEW employe_proj AS
SELECT emp.ename, emp.job, dept.dname, projet.nom_proj
FROM projet
NATURAL JOIN emp
NATURAL JOIN dept
