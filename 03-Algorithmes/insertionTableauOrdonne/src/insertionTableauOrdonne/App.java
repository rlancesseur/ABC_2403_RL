package insertionTableauOrdonne;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int valeurUtilisateur;
		Scanner sc = new Scanner(System.in);
		
		int[] tableau = {1, 4, 5, 10, 20, 22, 25, 30, 32};
		
		System.out.print("Saisissez un nombre : ");
		valeurUtilisateur = sc.nextInt();
		 
		for (int i = 0; i < tableau.length; i++) {
			if(valeurUtilisateur < tableau[i]) {
				tableau[i] += valeurUtilisateur;
				break;
			}
		}
		
		System.out.println("Tableau après insertion : " + Arrays.toString(tableau));
		
	
		
		sc.close();

	}

}
