package positifNegatif;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int nombreEntier;
		Scanner sc;
		
		sc = new Scanner(System.in);

		System.out.println("Saisir un nombre entier");
		nombreEntier = sc.nextInt();
		
		if(nombreEntier >= 0) {
			
			System.out.println("Le nombre est positif");
		}
		
		else {
			System.out.println("Le nombre est négatif");
		}
		
		sc.close();
		
	}

}
