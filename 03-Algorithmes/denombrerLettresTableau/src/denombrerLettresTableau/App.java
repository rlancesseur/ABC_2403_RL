package denombrerLettresTableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String texte;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez un texte d'au moins 120 caractères : ");
		texte = sc.next();
		
		String alphabet[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		String tableau[] = texte.split("");
		for (int i = 0; i < tableau.length; i++) 
		{
			for (int j = 0; j < alphabet.length; j++) {
				if(tableau[i] == alphabet[j]) {
					System.out.println(tableau[i]);
				}
			}
		}

		sc.close();
		
	}

}
