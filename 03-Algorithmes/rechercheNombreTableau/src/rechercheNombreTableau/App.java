package rechercheNombreTableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int N;
		boolean resultat = false;
		Scanner sc = new Scanner(System.in);
		
		int tableau[] = {8, 16, 32, 64, 128, 256, 512};
		
		System.out.print("Saisissez un nombre : ");
		N = sc.nextInt();
		
		for (int i = 0; i < tableau.length; i++) 
		{
			if(N == tableau[i]) {
				System.out.println("La valeur se trouve à l'indice " + i + " dans le tableau.");
				resultat = true;
			}
		}
		
		if(!resultat)
		System.out.println("Nombre non trouvé.");
		
		sc.close();

	}

}
