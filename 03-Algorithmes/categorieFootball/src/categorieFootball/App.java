package categorieFootball;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int age;
		String categorie;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir votre âge");
		age = sc.nextInt();
		
		if (age <= 5) {
			categorie = "Trop jeune";
		}
		else if (age <= 6) {
			categorie = "Débutant";
		}
		else if (age <= 8) {
			categorie = "poussin";
		}
		else if (age <= 10) {
			categorie = "benjamin";
		}
		else if (age <= 12) {
			categorie = "pupille";
		}
		else if (age <= 14) {
			categorie = "minime";
		}
		else if (age <= 16) {
			categorie = "cadet";
		}
		else if (age <= 18) {
			categorie = "junior";
		}
		else if (age <= 34) {
			categorie = "sénior";
		}
		else {
			categorie = "vétéran";
		}
		
		System.out.print("Vous êtes dans la catégorie " + categorie);

		sc.close();
		
	}

}
