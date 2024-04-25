package calculAireVolumeSphere;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		double rayon;
		
		double aire;
		
		double volume;
		
		Scanner sc;
		
		
		sc = new Scanner(System.in);
		
		
		System.out.println("Veuillez saire le rayon de la spere");
		rayon = sc.nextInt();
		
		aire = (4 * 3.14 * (rayon*rayon));
		volume = (4 * 3.14 * (rayon*rayon*rayon)) / 3;
		
		
		System.out.println("Son aire = " + aire);
		
		System.out.println("Son volume " + volume);
		
		sc.close();

		

	}

}
