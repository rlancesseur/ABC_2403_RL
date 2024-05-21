package calculNombresParfaits;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombreParfait;
		int moitie;
		int sommeDiviseurs = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez un nombre : ");
		nombreParfait = sc.nextInt();
		
		moitie = nombreParfait / 2;
		
		for (int i = 1; i <= moitie; i++)
		{
			sommeDiviseurs += i;
				if (nombreParfait % i == 0 && sommeDiviseurs == nombreParfait ) {
					System.out.println(nombreParfait + " est un nombre parfait.");
				}
		}
					
		
		sc.close();

	}

}
