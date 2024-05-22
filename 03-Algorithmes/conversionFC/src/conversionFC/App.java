package conversionFC;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		double valeurUtilisateur;
		String uniteUtilisateur;
		double conversionFtoC;
		double conversionCtoF;
		double valeurApresConversion = 0;
		String uniteApresConversion = null;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Saisissez une valeur comprise entre -459.67 et 5 000 000 suivi d'un espace et de C ou F : ");
			valeurUtilisateur = sc.nextDouble();
			uniteUtilisateur = sc.next();	
			
			if (valeurUtilisateur < -459.67 || valeurUtilisateur > 5000000) {
				System.out.println("Erreur");
			}
		}
			while (valeurUtilisateur < -459.67 || valeurUtilisateur > 5000000);
		
		
		conversionFtoC = (valeurUtilisateur - 32) * 5/9;
		conversionCtoF = (valeurUtilisateur * 9/5) + 32;
		
		
		if(uniteUtilisateur.contains("C") || uniteUtilisateur.contains("Celsius")) {
			valeurApresConversion = conversionCtoF;
			uniteApresConversion = "F";
		}
		
		if(uniteUtilisateur.contains("F") || uniteUtilisateur.contains("Fahrenheit")) {
			valeurApresConversion = conversionFtoC;
			uniteApresConversion = "C";
		}
		
		if(valeurUtilisateur == -459.67 || valeurUtilisateur == -273.15) {
			System.out.println("Vous avez atteint le Zéro absolu.");
		}
		
		
		System.out.println(valeurUtilisateur + " " + uniteUtilisateur + " devient " + valeurApresConversion + " " + uniteApresConversion);
		
		sc.close();
		
	}

}
