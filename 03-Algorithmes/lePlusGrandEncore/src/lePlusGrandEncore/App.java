package lePlusGrandEncore;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombre = 1;
		int nombreMax = 0;
		int ligneMax = 1;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		
		while (nombre != 0)
		{
			System.out.print("Entrez le nombre numéro " + i + " : ");
			nombre = sc.nextInt();
			
			if (nombre > nombreMax) {
				nombreMax = nombre;
				ligneMax = i;
			}
			
			i++;
		}
		
		System.out.println("Résultat : ");
		System.out.println("Le plus grand des nombres saisis est : " + nombreMax);
		System.out.println(nombreMax + " était le nombre numéro " + ligneMax);
		
		sc.close();

	}

}
