package voitureObjet;

public class App {

	public static void main(String[] args) {
		
		Voiture voiture1 = new Voiture();
		Voiture voiture2 = new Voiture(true, true, true, true, "Ferrari");
		Voiture voiture3 = new Voiture(false, true, true, false, "Maserati");
		Voiture voiture4 = new Voiture(false, false, true, false, "Peugeot");
		
		boolean porteOuverte = voiture2.fermerPorteConducteur();
		porteOuverte = voiture2.ouvrirPorteConducteur();
		boolean pharesAllumes = voiture4.allumerPhares();
		pharesAllumes = voiture4.eteindrePhares();
		boolean moteurDemarre = voiture2.arreterMoteur();
		moteurDemarre = voiture2.demarrerMoteur();

	}

}
