package helloYou;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String prenom; // déclaration d'une variable "prenom" de type "chaine de caractères"
		
		Scanner sc; // déclaration d'une variable de type Scanner (penser à ajouter la ligne d'import (cf la ligne 3))
		
		sc = new Scanner(System.in); //Initialisation d'un nouveau Scanner
		
		
		System.out.println("Bonjour, veuillez saisir votre prénom: ");

		
		prenom = sc.nextLine(); // Demande à l'utilisateur une saisie. 
		                        // Lorsque l'utilisateur validera avec la touche Entrée, la saisie est récupéré à gauche du signe "="
		
		System.out.println("Bonjour " + prenom); // Affichage
		
		sc.close(); // Fermeture du scanner (OBLIGATOIRE)
		
	}

}
