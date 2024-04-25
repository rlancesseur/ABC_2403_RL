package calculAireVolumeSphere;

import java.util.Scanner;
import java.lang.Math;

public class App {

	public static void main(String[] args) {
		
		
		double rayon;
		
		double aire;
		
		double volume;
		
		Scanner sc;
		
		
		sc = new Scanner(System.in);
		
		
		System.out.println("Veuillez saisir le rayon de la sphere");
		rayon = sc.nextDouble();
		
		aire = (4.0 * Math.PI * Math.pow(rayon, 2));
		volume = (4.0 * Math.PI * Math.pow(rayon, 3)) / 3.0;
		
		
		System.out.println("Son aire = " + aire);
		
		System.out.println("Son volume = " + volume);
		
		sc.close();

		

	}

}
