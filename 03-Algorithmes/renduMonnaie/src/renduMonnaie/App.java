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
		Scanner sc = new Scanner(System.in);
		
		while (prixAchat != 0)
		{
			System.out.print("Saisir un prix : ");
			prixAchat = sc.nextFloat();
			
			sommeTotal += prixAchat;
			billetDe5 = ((int)sommeTotal / 5) + 1; 
			totalBilletDe5 = billetDe5 * 5;
			renduMonnaie = totalBilletDe5 - sommeTotal;
			
			if (renduMonnaie != 0) {
			nombrePiece10 = (int)renduMonnaie / ;			
			}
		}
		
		System.out.println("Le client doit payer : " + sommeTotal);
		System.out.println("Le client doit donner " + billetDe5 + " billets de 5 Euros soit " + totalBilletDe5 + " Euros.");
		System.out.println("Rendu monnaie : " + renduMonnaie);
		System.out.println("Répartition de la monnaie à restituer au client :");
		System.out.println(nombrePiece10 + " pièces de 0.10€");
		
		sc.close();

	}

}
