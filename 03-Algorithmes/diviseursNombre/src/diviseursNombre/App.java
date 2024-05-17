package diviseursNombre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombreEntier;
		int moitie;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez un nombre entier : ");
		nombreEntier = sc.nextInt();
		
		moitie = nombreEntier / 2;
		
		System.out.print("Les diviseurs de " + nombreEntier + " sont : ");
		
		for (int i = 2; i <= moitie; i++)
		{
			if (nombreEntier % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();

	}

}
