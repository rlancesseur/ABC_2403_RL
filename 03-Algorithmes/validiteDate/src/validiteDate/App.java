package validiteDate;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int jour;
		int mois;
		int annee;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le jour");
		jour = sc.nextInt();
		System.out.println("Saisir le mois");
		mois = sc.nextInt();
		System.out.println("Saisir l'année");
		annee = sc.nextInt();
		
		 if (jour < 1 && jour > 31 && mois < 1 && mois > 12) {
			System.out.println("Il ne s'agit pas d'une date valide");
		}
		 else if (jour > 30) {
			 switch (mois) {
			 case 2, 4, 6, 9, 11 : System.out.println("Il ne s'agit pas d'une date valide");
			 }
		 }
		 else {
			System.out.println("Il s'agit d'une date valide");
		}
		
		sc.close();
	}

}
