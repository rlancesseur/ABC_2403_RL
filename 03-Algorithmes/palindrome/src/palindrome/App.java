package palindrome;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String saisieUtilisateur;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.print("Saisissez une chaîne de caractères : ");
		saisieUtilisateur = sc.nextLine().toLowerCase().replace(" ", "");
		 
			if(saisieUtilisateur.length() < 1) {
			System.out.println("La phrase est vide.");
			}
		}
		while (!saisieUtilisateur.contains(".") || saisieUtilisateur.contains(".") && saisieUtilisateur.length() < 2 );
		
		
		
		boolean palindrome = estUnPalindrome(saisieUtilisateur);
		
		
		
		if (palindrome) {
			System.out.println("La chaîne de caractères est un palindrome.");
		}
		else {
			System.out.println("La chaîne de caractères n'est pas un palindrome");
		}
		
		sc.close();
			
	}		
		
		
	public static boolean estUnPalindrome(String saisieUtilisateur) {
			
		String tableau[] = saisieUtilisateur.split("");
		int i = 0;
		int j = tableau.length - 2;
		
		while(i < j) {
			
			if(!tableau[i].contains(tableau[j])) {
				return false;
			}				
			i ++;
			j--;
		}
		return true;		

	}

}
