package denombrerLettresTableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String texte;
		int compteur = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez un texte d'au moins 120 caractères : ");
		texte = sc.next();
		
		while (texte.length() < 120) {
			System.out.print("Le texte doit contenir au moins 120 caractère, veuillez réessayer : ");
			texte = sc.next();
		}
		
		String alphabet[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		String tableau[] = texte.split("");
		for (int i = 0; i < tableau.length; i++) 
		{
			if(alphabet[0] == tableau[i]) {
				compteur += 1;
			}
		}
		
		System.out.println("La lettre " + alphabet[0] + " apparait " + compteur + " fois dans le texte.");

		sc.close();
		
	}

}
