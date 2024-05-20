package modifierTableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int limiteTableau;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez le nombre de valeur que vous comptez saisir : ");
		limiteTableau = sc.nextInt();
		
		int tableau[] = new int[limiteTableau];
		
		System.out.println("Saisissez vos valeurs : ");
		for (int i = 0; i < limiteTableau; i++)
		{
			tableau[i] = sc.nextInt();	
		}
		
		System.out.println("On ajoute 1 à ces valeurs : ");
		
		for (int i = 0; i < limiteTableau; i++)
		{
			tableau[i] += 1;
			System.out.print(tableau[i] + " ");
		}
		
		
		sc.close();

	}

}
