package sommeValeurs2Tableaux;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tableau1[] = new int[5];
		int tableau2[] = new int[5];
		int tableau3[] = new int[tableau1.length];
		
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
	
		App.somme(tableau1, tableau2, tableau3);
		
		System.out.print("La somme des valeurs des 2 tableaux précédents sont : " );
		for (int i = 0; i < tableau3.length; i++)
		{
		System.out.print(tableau3[i] + " " );
		}
		
		sc.close();
	}

	/**
	 * Fonction qui rentre la somme du tableau 1 et 2 dans le tableau 3
	 * @param tableau1
	 * @param tableau2
	 * @param tableau3
	 */
	public static void somme(int tableau1[],int tableau2[],	int tableau3[]) {
		
		for (int i = 0; i < tableau1.length; i++)
		{
			tableau3[i] = tableau1[i] + tableau2[i];
		}		
	}
	
}
