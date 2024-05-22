package conversionFCBis;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String uniteUtilisateur;
		int minimum;
		int maximum;
		int difference;
		double conversionFtoC;
		double conversionCtoF;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez une unité de mesure (C ou F) : ");
		uniteUtilisateur = sc.next();
		
		
		System.out.println("Saisissez une plage de valeurs : ");
		System.out.print("minimum : ");
		minimum = sc.nextInt();
		System.out.print("maximum : ");
		maximum = sc.nextInt();
		
		difference = maximum - minimum;
			
		
		// conversionFtoC = (i - 32) * 5/9;
		
		int tableau[] = new int[difference];
		while (minimum < maximum)
		{
			minimum += 1;
		}
		
		
	
		sc.close();		
		
	}

}
