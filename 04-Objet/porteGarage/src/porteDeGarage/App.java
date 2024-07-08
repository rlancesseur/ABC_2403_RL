package porteDeGarage;

public class App {

	public static void main(String[] args) {

		PorteDeGarage porteDeGarageDeRemi = new PorteDeGarage(false, 50, 0, 100);
		
		boolean porteFerme = porteDeGarageDeRemi.fermerALaHauteur(60);
		porteFerme = porteDeGarageDeRemi.fermerALaHauteur(20);
		porteFerme = porteDeGarageDeRemi.fermerALaHauteur(100);
		porteFerme = porteDeGarageDeRemi.fermerALaHauteur(0);
		porteFerme = porteDeGarageDeRemi.fermerALaHauteur(15);
		

		PorteDeGarage porteDeGarageDeMarie = new PorteDeGarage(true, 0, 0, 100);
		
		boolean porteVerouille = porteDeGarageDeMarie.verouiller();
		porteVerouille = porteDeGarageDeMarie.deverouiller();
		
		

	}

}
