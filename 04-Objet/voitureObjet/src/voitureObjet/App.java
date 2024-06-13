package voitureObjet;

public class App {

	public static void main(String[] args) {
		
		Voiture voiture1 = new Voiture();
		Voiture voiture2 = new Voiture(true, true, true, "Ferrari");
		Voiture voiture3 = new Voiture(false, true, true, "Maserati");
		Voiture voiture4 = new Voiture(false, false, false, "Peugeot");
		
		boolean porteOuverte = voiture2.fermerPorteConducteur();
		porteOuverte = voiture2.ouvrirPorteConducteur();
		boolean pharesAllumes = voiture2.allumerPhares();

	}

}
