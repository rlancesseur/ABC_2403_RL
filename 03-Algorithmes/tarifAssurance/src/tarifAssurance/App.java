package tarifAssurance;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int age = 25;
		int permis = 2;
		int accident;
		int tempsAssure;
		String tarif = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir âge");
		age = sc.nextInt();
		System.out.println("Depuis combien de temps avez-vous le permis");
		permis = sc.nextInt();
		System.out.println("Combien d'accident avez-vous déjà eu");
		accident = sc.nextInt();
		System.out.println("Depuis combien de temps êtes vous assuré");
		tempsAssure = sc.nextInt();
		


			if (age < 25 && permis < 2 && accident == 0) {
				tarif = "rouge";
			}
			else if (age < 25 && permis > 2 && accident == 0) {
				tarif = "orange";
			}
			else if (age > 25 && permis < 2 && accident == 1) {
				tarif = "rouge";
			}
			else if (age > 25 && permis > 2 && accident == 0) {
				tarif = "vert";
			}
			else if (age > 25 && permis > 2 && accident == 1) {
				tarif = "orange";
			}
			else if (age > 25 && permis > 2 && accident == 2) {
				tarif = "rouge";
			}
				
			else {
				System.out.println("La compagnie refuse de vous assurer");
			}
				
			
	/*	if (tempsAssure > 5) {
			tarif "rouge" = tarif "orange";
			tarif "orange" = tarif "vert";
			tarif "vert" = tarif "bleu"; 
		} 
	*/
		
		System.out.println("La compagnie vous attribue le tarif " + tarif);	
		
		sc.close();
			
	}

}
