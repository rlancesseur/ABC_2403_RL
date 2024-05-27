package rechercheOccurencesLettre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String phrase;
		String lettre;
		int occurence = 0;
		boolean presente = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez une chaîne de caractères : ");
		phrase = sc.next();
		
		System.out.print("Ecrivez une lettre : ");
		lettre = sc.next();
		
		String tableau[] = phrase.split("");
		for (int i = 0; i < tableau.length; i++)
		{
			if(tableau[i].contains(lettre)) {
				occurence += 1;
				presente = true;
			}
			else if (tableau[i].contains(".") && tableau.length < 2) {
				System.out.println("La phrase est vide.");
			}
		}
		
		if(!presente) {
			System.out.println("La lettre n'est pas présente.");
		}
				
		else		
		System.out.println("La lettre \"" + lettre + "\" est présente " + occurence + " fois.");
		
		sc.close();
		
	}

}
