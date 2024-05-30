package fruitsEtLegumes;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String legumes1;
		float moinsCher = 0;
		String[] tableau;
		Scanner sc = new Scanner(System.in);		
		
		ArrayList<String> legumes = new ArrayList<String>();

		
		while (!legumes.contains("go")) {
		
		System.out.print("Saisissez un légume et son prix au kilo : ");
		legumes1 = sc.next();
		tableau = legumes1.split(" ");
		}
		
		
		for (int i = 0; i < tableau.length; i++) {
			
			System.out.println(tableau[i]);
			
			/*if (moinsCher < tableauPrix[i]) {
				tableauPrix[i] = moinsCher;
			*/
			}		
		
		sc.close();

	}

}
