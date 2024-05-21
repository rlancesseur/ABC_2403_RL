package conversionKmMi;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		double valeurKm;
		double valeurMi = 1;
		double q = 15;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.print("Saisissez une valeur en kilomètres comprise entre 0.01 et 1 000 000 : ");
		valeurKm = sc.nextFloat();
		
		if (valeurKm < 0.01 || valeurKm > 1000000) {
			System.out.println("Valeur incorrect");
		}
		
		}
		while (valeurKm < 0.01 || valeurKm > 1000000);
		
		if (valeurKm == q) {
			System.exit(0);
		}
		
		valeurMi = valeurKm / 1.609;
		
		System.out.println(valeurKm + " kilomètres = " + valeurMi + " miles");
		
		sc.close();

	}

}
