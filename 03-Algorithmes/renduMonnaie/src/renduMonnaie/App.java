package renduMonnaie;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		float prixAchat = 1;
		float sommeTotal = 0;
		int billetDe5 = 0;
		int totalBilletDe5 = 0;
		float renduMonnaie = 0;
		int nombrePiece10 = 0;
		int nombrePiece20 = 0;
		int nombrePiece50 = 0;
		int nombrePiece1 = 0;
		int nombrePiece2 = 0;
		Scanner sc = new Scanner(System.in);
		
		while (prixAchat != 0)
		{
			System.out.print("Saisir un prix : ");
			prixAchat = sc.nextFloat();
			
			sommeTotal += prixAchat;
			
			if (sommeTotal % 5 != 0) {
				billetDe5 = ((int)sommeTotal / 5) + 1; 
			}
			
			else {
				billetDe5 = (int)sommeTotal / 5;
			}
		}
		
		totalBilletDe5 = billetDe5 * 5;
		renduMonnaie = totalBilletDe5 - sommeTotal;
		
		nombrePiece2 = (int)renduMonnaie / 2;
		nombrePiece1 = (int)renduMonnaie;
		nombrePiece50 = (int)renduMonnaie * 2;
		nombrePiece20 = (int)renduMonnaie * 5;
		nombrePiece10 = ((int)renduMonnaie * 10);
		
		System.out.println("Le client doit payer : " + sommeTotal);
		System.out.println("Le client doit donner " + billetDe5 + " billets de 5 Euros soit " + totalBilletDe5 + " Euros.");
		System.out.println("Rendu monnaie : " + renduMonnaie);
		System.out.println("Répartition de la monnaie à restituer au client :");
		System.out.println(nombrePiece2 + " pièces de 2€");
		System.out.println(nombrePiece1 + " pièces de 1€");
		System.out.println(nombrePiece50 + " pièces de 0.50€");
		System.out.println(nombrePiece20 + " pièces de 0.20€");
		System.out.println(nombrePiece10 + " pièces de 0.10€");
		
		sc.close();

	}

}
