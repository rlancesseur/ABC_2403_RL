package conversionFCBis;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String uniteUtilisateur;
		double minimum;
		double maximum;
		double difference;
		Scanner sc = new Scanner(System.in);
		
		
		do {
		System.out.print("Saisissez une unité de mesure (C ou F) : ");
		uniteUtilisateur = sc.next();
		
			if(uniteUtilisateur.contains("quit")) {
				System.exit(0);
			}
			if(!uniteUtilisateur.toUpperCase().contains("C") && !uniteUtilisateur.toUpperCase().contains("F")) {
				System.out.println("Erreur");
			}
		}
			while (!uniteUtilisateur.toUpperCase().contains("C") && !uniteUtilisateur.toUpperCase().contains("F"));
		
		System.out.println("Saisissez une plage de valeurs : ");
		System.out.print("Minimum : ");
		minimum = sc.nextInt();
		System.out.print("Maximum : ");
		maximum = sc.nextInt();
		
		
		difference = (maximum - minimum) + 1;
		
		
		double tableau[] = new double[(int)difference];
		for (int i = 0; i < difference; i++)
		{
			tableau[i] = minimum + i;
		}
		
		System.out.println("Après conversion, les valeurs de cette plage sont : ");
		
		double tableauConversion[] = new double[(int)difference];
		for (int i = 0; i < difference; i ++)
		{
			if(uniteUtilisateur.toUpperCase().contains("C")) {
				tableauConversion[i] = tableau[i] * 9/5 + 32;
				System.out.println(tableauConversion[i] + " F");
			}
			
			if(uniteUtilisateur.toUpperCase().contains("F")) {
				tableauConversion[i] = (tableau[i] - 32) * 5/9;
				System.out.println(tableauConversion[i] + " C");
			}
		}
			
	
		sc.close();		
		
	}

}
