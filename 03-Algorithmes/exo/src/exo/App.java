package exo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		App.afficherJourHeures();

	}

	public static void afficherJourHeures() {
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    Date date = new Date();
	    System.out.println("On est le " + s.format(date));
		
	}
	
}
