package calculSurfaceSecteurCirculaire;

import java.util.Scanner;
import java.lang.Math;

public class App {

	public static void main(String[] args) {

		float rayon;
		
		float angle;
		
		double aireSecteurCirculaire;
		
		Scanner sc;
		
		
		sc = new Scanner(System.in);
		
		System.out.println("Saisir le rayon du cercle");
		rayon = sc.nextFloat();
		
		System.out.println("Saisir l'angle");
		angle = sc.nextFloat();
		
		aireSecteurCirculaire = (Math.PI * Math.pow(rayon, 2) * angle) / 360;
		
		System.out.println("L'aire du secteur circulaire = " + aireSecteurCirculaire);
		
		sc.close();
		

	}

}
