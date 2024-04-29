package predictionAvenir;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int heures;
		int minutes;
		int plus3Minutes;
		int plusHeures;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir l'heure");
		heures = sc.nextInt();
		
		System.out.println("Veuillez saisir les minutes");
		minutes = sc.nextInt();
		
		
		if (heures > 23 || heures < 0 || minutes > 59 || minutes < 0) {
			System.out.println("Les données saisies sont invalides");
			return;
		}
			
		plus3Minutes = minutes + 3;
		plusHeures = heures;
		
				if (plus3Minutes > 60) {
					plus3Minutes -= 60;
					plusHeures += 1;
				}
				
					else if (plusHeures > 23) {
					plusHeures = 0;	
					}
				
			
						System.out.println("Dans 3 minutes, il sera " + plusHeures + "h " + plus3Minutes);
				
		
		sc.close();

	}

}
