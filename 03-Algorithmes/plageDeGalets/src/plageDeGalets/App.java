package plageDeGalets;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int nombreUtilisateur;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("Saisir un nombre entre 10 et 20");
			nombreUtilisateur = sc.nextInt();
			
			if (nombreUtilisateur < 10) {
				System.out.println("Plus grand !");
			}
			else if (nombreUtilisateur > 20) {
				System.out.println("Plus petit !");
			}
		}
		while (nombreUtilisateur < 10 || nombreUtilisateur > 20);
		
		System.out.println("Yes ! You did it !");
		
		sc.close();
	}

}
