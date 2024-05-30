package insertionTableauOrdonne;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int valeurUtilisateur;
		int position = 0;
		Scanner sc = new Scanner(System.in);
		
		int[] tableau = {1, 4, 5, 10, 20, 22, 25, 30, 32};
		
		System.out.print("Saisissez un nombre : ");
		valeurUtilisateur = sc.nextInt();
		 
		
		while (tableau[position] < valeurUtilisateur) {
			position++;
				if(position == valeurUtilisateur) {
					tableau[position] = valeurUtilisateur;
				}
		}
		
		System.out.println("Tableau après insertion : " + Arrays.toString(tableau));
		
	
		
		sc.close();

	}

}
