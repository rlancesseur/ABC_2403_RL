package lePlusGrand;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int nombre;
		int nombreMax = 0;
		int ligneMax = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 20; i++)
		{
			System.out.print("Entrez le nombre numéro " + i + " : ");
			nombre = sc.nextInt();
			
			if (nombre > nombreMax) {
				nombreMax = nombre;
				ligneMax = i;
			}
		}

		System.out.println("Résultat : ");
		System.out.println("Le plus grand des nombres saisis est : " + nombreMax);
		System.out.println(nombreMax + " était le nombre numéro " + ligneMax);
		
		sc.close();
		
	}

}
