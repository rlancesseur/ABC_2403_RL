package validiteDate;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int jour;
		int mois;
		int annee;
		String date;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le jour");
		jour = sc.nextInt();
		System.out.println("Saisir le mois");
		mois = sc.nextInt();
		System.out.println("Saisir l'année");
		annee = sc.nextInt();
		
		
		 if (jour < 1 || jour > 31 || mois < 1 || mois > 12) {
			date = "Il ne s'agit pas d'une date valide";
		}
		 else if (jour > 30) {
			 switch (mois) {
			 case 2, 4, 6, 9, 11 : date = "Il ne s'agit pas d'une date valide";
			 break;
			 default : date = "Il s'agit d'une date valide";
			 }
		 }
		 else if (annee % 4 == 0 && mois ==2 && jour > 29) {
			  date = "Il ne s'agit pas d'une date valide";
		 }
		 else if (annee % 4 != 0 && mois == 2 && jour > 28) { 
			 date = "Il ne s'agit pas d'une date valide";
		 } 
		 else {
			date = "Il s'agit d'une date valide";
		}
		 
		 System.out.println(date);
		
		sc.close();
	}

}
