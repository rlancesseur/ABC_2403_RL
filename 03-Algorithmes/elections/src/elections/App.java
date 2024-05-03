package elections;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		float premierCandidat;
		float deuxiemeCandidat;
		float troisiemeCandidat;
		float quatriemeCandidat;
		String resultat = null;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Score du premier candidat");
		premierCandidat = sc.nextInt();
		System.out.println("Score du deuxième candidat");
		deuxiemeCandidat = sc.nextInt();
		System.out.println("Score du troisième candidat");
		troisiemeCandidat = sc.nextInt();
		System.out.println("Score du quatrième candidat");
		quatriemeCandidat = sc.nextInt();
		
		if ((premierCandidat + deuxiemeCandidat + troisiemeCandidat + quatriemeCandidat) <= 100) {
		
		if (premierCandidat > 50) {
			resultat = "Le candidat numéro 1 est élu dès le premier tour";
		}
		else if (premierCandidat < 12.5) {
			resultat = "Le candidat numéro 1 a perdu l'élection";
		}
		else if ((premierCandidat > deuxiemeCandidat) && (premierCandidat > troisiemeCandidat) && (premierCandidat > quatriemeCandidat)) {
			resultat = "Le candidat numéro 1 est en ballottage favorable";
		}
		else if ((premierCandidat < deuxiemeCandidat) || (premierCandidat < troisiemeCandidat) || (premierCandidat < quatriemeCandidat)) {
			resultat = "Le candidat numéro 1 est en ballottage dévaforable";
		}
		}
		
		else { 
			resultat = "On annule tout";
		}
		
		System.out.println(resultat);
		
		sc.close();
		
	}

}
