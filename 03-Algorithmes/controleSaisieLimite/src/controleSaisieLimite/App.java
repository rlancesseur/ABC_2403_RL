package controleSaisieLimite;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		String saisieUtilisateur;
		int essais = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Saisissez un mot de passe : ");
			saisieUtilisateur = sc.next();
			essais ++;
			
			if (saisieUtilisateur.equals("formation")) {
				System.out.println("Vous êtes connecté.");
				break;
			}
			
			else if (!saisieUtilisateur.equals("formation")) {
				System.out.println("Erreur.");
			}
		}
			while (essais < 3);
		
		if(essais == 3) {
			System.out.println("Votre compte est bloqué.");
		}			
		 
		sc.close();
		
	}

}
