package somme;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombreUtilisateur;
		int somme = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre");
		nombreUtilisateur = sc.nextInt();
		
		for (int i = 0; i <= nombreUtilisateur; i++)
		{
			somme += i;
		}
		
		System.out.println("La somme des nombres jusqu'à " + nombreUtilisateur + " est : " + somme);
		
		sc.close();
		
	}

}
