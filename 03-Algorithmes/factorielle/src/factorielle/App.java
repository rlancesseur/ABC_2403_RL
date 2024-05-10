package factorielle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombreUtilisateur;
		int i = 1;
		long factorielle = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisir un nombre : ");
		nombreUtilisateur = sc.nextInt();
		
		while (i <= nombreUtilisateur)
		{
			factorielle *= i;
			i++;
		}
		
		System.out.println("La factorielle de " + nombreUtilisateur + " est " + factorielle);
		
		sc.close();
		
	}

}
