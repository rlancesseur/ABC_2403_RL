package categorieFootball;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int age;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir votre âge");
		age = sc.nextInt();
		
		if(age <= 5) {
			System.out.println("Vous êtes trop jeune");
		}
		else if(age > 6) {
			System.out.println("Vous êtes débutant");
		}
		else if(age > 8) {
			System.out.println("Vous êtes poussin");
		}
		else if(age > 10) {
			System.out.println("Vous êtes benjamin");
		}
		else if(age > 12) {
			System.out.println("Vous êtes pupille");
		}
		else if(age > 14) {
			System.out.println("Vous êtes minime");
		}
		else if(age > 16) {
			System.out.println("Vous êtes cadet");
		}
		else if(age > 18) {
			System.out.println("Vous êtes junior");
		}
		else if(age > 34) {
			System.out.println("Vous êtes sénior");
		}
		else if(age > 35) {
			System.out.println("Vous êtes vétéran");
		}

		sc.close();
		
	}

}
