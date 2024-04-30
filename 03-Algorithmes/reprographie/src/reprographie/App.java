package reprographie;

import java.util.Scanner;

public class App {

	final static double P1 = 0.10;
	final static double P2 = 0.09;
	final static double P3 = 0.08;
	
	public static void main(String[] args) {
		

		int nombrePhotocopies;
		double facture = 0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Veuillez saisir le nombre de photocopies");
		nombrePhotocopies = sc.nextInt();
		
		
		if (nombrePhotocopies <= 10) {
			facture = nombrePhotocopies * App.P1;			
		}
			
			else if (nombrePhotocopies <= 30) {
				facture = (10 * App.P1) + (nombrePhotocopies - 10) * App.P2; 
			}
				
			else if (nombrePhotocopies > 30) {
				facture = (10 * App.P1) + (20 * App.P2) + (nombrePhotocopies - 30) * App.P3;
			}
					
					System.out.println("Le montant à payer est de : " + facture + " €.");
			

			sc.close();
			
	}

}