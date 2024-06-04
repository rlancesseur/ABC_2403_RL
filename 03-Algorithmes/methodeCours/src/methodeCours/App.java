package methodeCours;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		double resultat;
		String prenom = "Mickaël";
		String nom = "Devoldere";
		String phrase;
		
		resultat = App.additionner(5, 10);
		
		System.out.println(resultat);
		
		phrase = App.ConcatenerPrenomNom(prenom, nom);
		
		System.out.println(phrase);
		
		App.afficherJourHeures();		
		
	}
	
	public static double additionner(double valeur1, double valeur2) {
		double somme = 0;
		somme = valeur1 + valeur2;
		return somme;
	}

	public static void afficherJourHeures() {
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    Date date = new Date();
	    System.out.println("On est le " + s.format(date));
		
	}
	
	public static String ConcatenerPrenomNom(String prenom, String nom) {
		
		String retour;
		
		retour = prenom + " " + nom;
		
		return retour;
		
	}
	
}
