package controleSaisie;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String prenom;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Saisissez votre prénom : ");
		prenom = sc.next();
		
		
			if (prenom.length() < 2) {
				for (int i = 0; i < 5; i++)
				{
					System.out.println("Le prénom doit contenir au moins 2 caractères");
					prenom = sc.next();
				}
			}
			
			else		
				System.out.println("Bonjour " + prenom);
		
		sc.close();

	}

}
