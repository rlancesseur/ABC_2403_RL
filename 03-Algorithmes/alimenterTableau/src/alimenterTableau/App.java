package alimenterTableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int limiteTableau;
		int positif = 0;
		int negatif = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez le nombre de valeur que vous comptez saisir : ");
		limiteTableau = sc.nextInt();
		
		int tableau[] = new int[limiteTableau];
		
		System.out.println("Saisissez vos valeurs : ");
		for (int i = 0; i < limiteTableau; i++)
		{
			tableau[i] = sc.nextInt();
			
			if(tableau[i] < 0) {
				negatif += 1;
			}
			
			else {
				positif += 1;
			}
		}
		
		if(limiteTableau == negatif) {
			System.out.print("Toutes les valeurs sont négatives");
		}
		else if (limiteTableau == positif) {
			System.out.print("Toutes les valeurs sont positives");
		}
		else {
		System.out.print("Il y a " + negatif + " nombres négatifs, et " + positif + " nombres positifs.");
		}
		
		sc.close();

	}

}
