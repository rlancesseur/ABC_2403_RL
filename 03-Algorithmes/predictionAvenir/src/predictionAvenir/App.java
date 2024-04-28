package predictionAvenir;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int heures;
		int minutes;
		int plus3Minutes;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir l'heure");
		heures = sc.nextInt();
		
		System.out.println("Veuillez saisir les minutes");
		minutes = sc.nextInt();
		
		
		if (heures > 23) {
			System.out.println("Les données saisie sont invalides");
		}
			else if (minutes > 59) {
			System.out.println("Les données saisies sont invalides");
			}
				else {
					
				plus3Minutes = minutes + 3;
			
				System.out.println("Dans 3 minutes, il sera " + heures + " h " + plus3Minutes);
				}
		
		sc.close();

	}

}
