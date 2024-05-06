package plageDeSable;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int nombreUtilisateur;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Saisir un nombre entre 1 et 3");
		nombreUtilisateur = sc.nextInt();
		}
		while (nombreUtilisateur < 1 || nombreUtilisateur > 3);
		
		System.out.println("Bravo, vous avez réussi ! Vous avez saisi le nombre : " + nombreUtilisateur);
		
		sc.close();
		
	}

}
