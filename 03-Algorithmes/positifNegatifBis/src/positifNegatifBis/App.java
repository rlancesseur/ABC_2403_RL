package positifNegatifBis;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int nombreEntier1;
		int nombreEntier2;
		int produit;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre entier");
		nombreEntier1 = sc.nextInt();
		
		System.out.println("Saisir un second nombre entier");
		nombreEntier2 = sc.nextInt();
		
		produit = (nombreEntier1 * nombreEntier2);
		
		if(produit >= 0) {
			System.out.println("Le produit est positif");
		}
		
		else {
			System.out.println("Le produit est négatif");
		}
		
		sc.close();
		
	}

}
