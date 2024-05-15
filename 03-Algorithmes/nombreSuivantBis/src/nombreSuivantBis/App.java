package nombreSuivantBis;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombreUtilisateur;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisir un nombre : ");
		nombreUtilisateur = sc.nextInt();
	
		
		System.out.print("Les 10 nombres après " + nombreUtilisateur + " sont : ");
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.print(i + nombreUtilisateur + " ");
		}
		
		sc.close();
		
	}

}
