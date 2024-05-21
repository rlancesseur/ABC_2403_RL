package factorielle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombreUtilisateur;
		long factorielle = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisir un nombre : ");
		nombreUtilisateur = sc.nextInt();
		
		for (int i = 1; i <= nombreUtilisateur; i++)
		{
			factorielle *= i;
		}
		
		System.out.println("La factorielle de " + nombreUtilisateur + " est " + factorielle);
		
		sc.close();
		
	}

}
