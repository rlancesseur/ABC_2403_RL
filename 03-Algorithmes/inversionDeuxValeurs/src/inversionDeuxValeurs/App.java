package inversionDeuxValeurs;

import java.util.Scanner; 

public class App {

	public static void main(String[] args) {
		
		int nombreA;
		int nombreB;
		int nombreC;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Saisir A");
		nombreA = sc.nextInt();
		
		System.out.println("Saisir B");
		nombreB = sc.nextInt();
		
		nombreC = nombreA;
		nombreA = nombreB;
		nombreB = nombreC;
		
		System.out.println(nombreA);
		System.out.println(nombreB);
		
		sc.close();

		
	}

}
