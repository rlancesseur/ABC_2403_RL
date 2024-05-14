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
		
		System.out.println("Le client doit payer : " + sommeTotal);
		System.out.println("Le client doit donner " + billetDe5 + " billets de 5 Euros soit " + totalBilletDe5 + " Euros.");
		System.out.println("Rendu monnaie : " + renduMonnaie);
	
		
		nombrePiece2 = (int)renduMonnaie / 2;
		renduMonnaie -= nombrePiece2 * 2;
		
		nombrePiece1 = (int)renduMonnaie;
		renduMonnaie -= nombrePiece1;
		
		nombrePiece50 = (int)renduMonnaie * 2;
		renduMonnaie -= nombrePiece50 * 0.50;
		
		nombrePiece20 = (int)renduMonnaie * 5;
		renduMonnaie -= nombrePiece20 * 0.20;
		
		nombrePiece10 = ((int)renduMonnaie * 10);
		renduMonnaie -= nombrePiece10 * 0.10;
		
		
		System.out.println("Répartition de la monnaie à restituer au client :");
		
		if (nombrePiece2 > 0)
			System.out.println(nombrePiece2 + " pièces de 2€");
		
		if(nombrePiece1 > 0) {
			System.out.println(nombrePiece1 + " pièces de 1€");
		}
		if(nombrePiece50 > 0) {
			System.out.println(nombrePiece50 + " pièces de 0.50€");
		}
		if(nombrePiece20 > 0) {
			System.out.println(nombrePiece20 + " pièces de 0.20€");
		}
		if(nombrePiece10 > 0) {
		System.out.println(nombrePiece10 + " pièces de 0.10€");
		}
		
		
		sc.close();

	}

}
