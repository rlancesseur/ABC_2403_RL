package sommeValeurs2Tableaux;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tableau1[] = new int[5];
		int tableau2[] = new int[5];
		int tableauSomme[] = new int[tableau1.length];
		
		System.out.println("Saisissez les 5 nombres du premier tableau : ");
		for (int i = 0; i < 5; i++)
		{
			tableau1[i] = sc.nextInt();
		}
		
		System.out.println("Saisissez les 5 nombres du deuxième tableau : ");
		for (int i = 0; i < 5; i++)
		{
			tableau2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < tableau1.length; i++)
		{
			tableauSomme[i] = tableau1[i] + tableau2[i];
		}
		
		System.out.print("La somme des valeurs des 2 tableaux précédents sont : " );
		for (int i = 0; i < tableauSomme.length; i++)
		{
		System.out.print(tableauSomme[i] + " " );
		}
		
		sc.close();
	}

}
