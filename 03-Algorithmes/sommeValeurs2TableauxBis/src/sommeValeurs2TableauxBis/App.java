package sommeValeurs2TableauxBis;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tableau1[] = new int[3];
		int tableau2[] = new int[3];
		int somme = 0;
		
		System.out.println("Saisissez les 3 nombres du premier tableau : ");
		for (int i = 0; i < 3; i++)
		{
		tableau1[i] = sc.nextInt();
		}
		
		System.out.println("Saisissez les 3 nombres du deuxième tableau : ");
		for (int i = 0; i < 3; i++)
		{
			tableau2[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < tableau1.length; i++)
		{
			for (int i2 = 0; i2 < tableau2.length; i2++)
			{
			somme += tableau1[i] * tableau2[i2];
			}
		}
		
		System.out.print("La somme des produits des deux tableaux est de : " + somme);
		
		sc.close();
	}

}
