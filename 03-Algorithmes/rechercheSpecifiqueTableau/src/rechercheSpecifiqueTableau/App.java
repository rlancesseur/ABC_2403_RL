package rechercheSpecifiqueTableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int limiteTableau;
		float somme = 0;
		float moyenne;
		int notesSuperieuresMoyenne = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez le nombre de valeur que vous comptez saisir : ");
		limiteTableau = sc.nextInt();
		
		float tableau[] = new float[limiteTableau];
		
		System.out.println("Saisissez vos valeurs : ");
		for (int i = 0; i < limiteTableau; i++)
		{
			tableau[i] = sc.nextFloat();
		}
		
		
		for (int i = 0; i < limiteTableau; i++)
		{
			somme += tableau[i];
		}
		
		moyenne = somme / limiteTableau;
		
		for (int i = 0; i < limiteTableau; i++)
		{
			if(tableau [i] > moyenne) {
				notesSuperieuresMoyenne ++;
			}
		}
		
		System.out.println("Le nombre de notes supérieures à la moyenne est de : " + notesSuperieuresMoyenne);
		
		
		sc.close();
	}

}
