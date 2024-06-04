package exo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		String prenom = "Mickaël";
		String nom = "Devoldere";
		String phrase;
		
		phrase = App.ConcatenerPrenomNom(prenom, nom);
		
		System.out.println(phrase);
		
		App.afficherJourHeures();		
		
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
