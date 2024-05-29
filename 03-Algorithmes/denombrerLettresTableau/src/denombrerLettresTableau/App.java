package denombrerLettresTableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String texte;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Saisissez un texte d'au moins 120 caractères : ");
		texte = sc.next();
		
		while (texte.length() < 120) {
			System.out.print("Le texte doit contenir au moins 120 caractère, veuillez réessayer : ");
			texte = sc.next();
		}
		
		
		String alphabet[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		int compteur[] = new int[texte.length()];
		
		String tableau[] = texte.split("");
		
		for (int i = 0; i < texte.length(); i++) 
		{
			for (int j = 0; j < alphabet.length; j ++) {
				if(tableau[i].contains(alphabet[j])) {
					compteur[j] += 1;
				}
			}
		}
		for (int i = 0; i < alphabet.length; i++) {
		System.out.println("La lettre " + alphabet[i] + " apparait " + compteur[i] + " fois dans le texte.");
		}
		
		sc.close();
		
	}

}
