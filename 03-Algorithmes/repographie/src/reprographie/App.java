package reprographie;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		

		int nombrePhotocopies;
		double facture;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Veuillez saisir le nombre de photocopies");
		nombrePhotocopies = sc.nextInt();
		
		
		if (nombrePhotocopies <= 10) {
			facture = nombrePhotocopies * 0.10;			
		}
			
			else if (nombrePhotocopies > 10 && nombrePhotocopies <= 30) {
				facture = (nombrePhotocopies * 0.09) + 1;
			}
				
			else if (nombrePhotocopies > 30) {
				facture = (nombrePhotocopies * 0.08) + 2.8;
			}
					
					System.out.println("Le montant à payer est de : " + facture + " €.");
			

			sc.close();
			
	}

}
