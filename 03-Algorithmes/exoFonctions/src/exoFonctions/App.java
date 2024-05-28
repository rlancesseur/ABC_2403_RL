package exoFonctions;

public class App {

	public static void main(String[] args) {
		
		// Ecrire une PROCEDURE qui calcule et affiche le périmètre d'un triangle
		
		int a = 20;
		int b = 30;
		int c = 40;
		
		App.calculerPerimetreTrianle(a, b ,c);
		
		int[] valeurs = new int[] {1, 3, 5, 7, 3, 4, 2, 4, 22};

		App.calculerMoyenne(valeurs);
		
	}

	/**
	 * Procédure qui calcule le périmètre d'un triangle
	 * @param a Côté d'un triangle
	 * @param b Côté d'un triangle
	 * @param c Côté d'un triangle
	 */
	
	public static void calculerPerimetreTrianle(int a, int b, int c)
	{
		
		int perimetre = a + b + c;
		
		System.out.println("Le périmètre est de : " + perimetre);
		
	}
	
	
	public static void calculerMoyenne(int[] tableau)
	{
		int somme = 0;
		
		for(int i = 0; i < tableau.length; i++) {
			somme += tableau[i];
		}
		
		float moyenne;
		moyenne = (float)somme / (float)tableau.length;
		
		System.out.println("La moyenne des valeurs du tableau est de : " + moyenne);
		
	}
	
}