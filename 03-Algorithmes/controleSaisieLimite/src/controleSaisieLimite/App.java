package controleSaisieLimite;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String motDePasse = "formation";
		String saisieUtilisateur;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez un mot de passe : ");
		saisieUtilisateur = sc.next();
		
		if (saisieUtilisateur != motDePasse) {
			for (int i = 0; i < 3; i++)
			{
				System.out.println("Mot de passe invalide");
				saisieUtilisateur = sc.next();
			}
		}
		
		else 
			System.out.println("Vous êtes connecté.");
		
		sc.close();
		
	}

}
