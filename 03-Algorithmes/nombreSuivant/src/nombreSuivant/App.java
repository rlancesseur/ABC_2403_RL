package nombreSuivant;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int i = 1;
		int nombreUtilisateur;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisir un nombre : ");
		nombreUtilisateur = sc.nextInt();
		
		System.out.print("Les 10 nombres après " + nombreUtilisateur + " sont : ");
		
		while (i <= 10){
			System.out.print(nombreUtilisateur + i + " ");
			i++;
		}
		
		sc.close();
		
	}

}
