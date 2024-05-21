package conversionKmMiBis;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		

		String uniteMesure;
		String resultatUniteMesure;
		double valeurUtilisateur;
		double resultatValeur = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Saisissez une valeur comprise entre 0.01 et 1 000 000 : ");
			valeurUtilisateur = sc.nextFloat();
			if (valeurUtilisateur < 0.01 || valeurUtilisateur > 1000000) {
				System.out.println("Erreur");
			}
			}
			while (valeurUtilisateur < 0.01 || valeurUtilisateur > 1000000);
		
		System.out.print("Saisissez son unité de mesure : ");
		uniteMesure = sc.next();
		
		
		if(uniteMesure.equals("mi")) {                   // .equal ça renvoie une valeur booléenne true or false
			resultatValeur = valeurUtilisateur * 1.621;
			resultatUniteMesure = "km";
		}
		
		else {
			resultatValeur = valeurUtilisateur / 1.621;
			resultatUniteMesure = "mi";
		}
			
			System.out.println(valeurUtilisateur + " " + uniteMesure + " = " + resultatValeur + " " + resultatUniteMesure);

		
		sc.close();

	}

}
