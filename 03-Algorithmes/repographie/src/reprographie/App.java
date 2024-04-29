package reprographie;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int nombrePhotocopies;
		double facture;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le nombre de photocopies");
		nombrePhotocopies = sc.nextInt();
		
		if (nombrePhotocopies <= 10) {
			facture = nombrePhotocopies * 0.10;			
		}
			
			if (nombrePhotocopies > 10 && nombrePhotocopies <= 30) {
				facture = (10 * 0.10) + (nombrePhotocopies - 10) * 0.09;
				
				if (nombrePhotocopies > 30) {
					facture = (10 * 0.10) + (20 * 0.09) + (nombrePhotocopies - 30) * 0.08;
				}
				
					System.out.println("Le montant à payer est de : " + facture + " €.");
			}

			sc.close();
			
	}

}
