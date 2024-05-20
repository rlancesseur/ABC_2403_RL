package rechercheTableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int limiteTableau;
		int valeurPlusGrande = 0;
		int indexValeurPlusGrande = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez le nombre de valeur que vous comptez saisir : ");
		limiteTableau = sc.nextInt();
		
		int tableau[] = new int[limiteTableau];
		
		for (int i = 0; i < limiteTableau; i++)
		{
			tableau[i] = sc.nextInt();
		}
		
		for (int i= 0; i < limiteTableau; i++)
		{
			if(valeurPlusGrande < tableau[i]) {
				valeurPlusGrande = tableau[i];
				indexValeurPlusGrande = i;
			}
		}
		
		System.out.print("La valeur la plus grande du tableau est : " + valeurPlusGrande + " et se trouve en : " + indexValeurPlusGrande);
		
		sc.close();

	}

}
