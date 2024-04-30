package elections;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		float premierCandidat;
		float deuxiemeCandidat;
		float troisiemeCandidat;
		float quatriemeCandidat;
		float totalVote;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Score du premier candidat");
		premierCandidat = sc.nextInt();
		System.out.println("Score du deuxième candidat");
		deuxiemeCandidat = sc.nextInt();
		System.out.println("Score du troisième candidat");
		troisiemeCandidat = sc.nextInt();
		System.out.println("Score du quatrième candidat");
		quatriemeCandidat = sc.nextInt();
		
		totalVote = premierCandidat + deuxiemeCandidat + troisiemeCandidat + quatriemeCandidat;
		
		
		if (premierCandidat > totalVote / 2) {
			System.out.println("Le candidat numéro 1 est élu dès le premier tour");
		}
		else if (premierCandidat < totalVote * 0.12) {
			System.out.println("Le candidat numéro 1 a perdu l'élection");
		}
		else if (premierCandidat > totalVote * 0.12 && premierCandidat > totalVote / 4) {
			System.out.println("Le candidat numéro 1 est en ballottage favorable");
		}
		else if (premierCandidat > totalVote * 0.12 && premierCandidat < totalVote / 4) {
			System.out.println("Le candidat numéro 1 est en ballottage dévaforable");
		}
		
		sc.close();
		
	}

}
