package conversionKmMiBis;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		double valeurKm;
		double valeurMi;
		String uniteMesure;
		String resultatUniteMesure;
		double valeurUtilisateur;
		double resultatValeur = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Saisissez une valeur comprise entre 0.01 et 1 000 000 : ");
			valeurUtilisateur = sc.nextFloat();
			}
			while (valeurUtilisateur < 0.01 || valeurUtilisateur > 1000000);
		
		System.out.print("Saisissez son unité de mesure : ");
		uniteMesure = sc.next();
		
		valeurKm = valeurUtilisateur * 1.609;
		valeurMi = valeurUtilisateur / 1.621;
		
		if(uniteMesure == "mi") {
			resultatValeur = valeurKm;
			resultatUniteMesure = "km";
		}
		else
			uniteMesure = "km";
			resultatValeur = valeurMi;
			resultatUniteMesure = "mi";
		
			
			System.out.println(valeurUtilisateur + " " + uniteMesure + " = " + resultatValeur + " " + resultatUniteMesure);

		
		sc.close();

	}

}
