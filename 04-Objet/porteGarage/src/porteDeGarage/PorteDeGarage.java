package porteDeGarage;

public class PorteDeGarage {
	
	boolean estVerouille;
	float pourcentageDOuverture;
	final float pourcentageDOuvertureMin;
	final float pourcentageDOuvertureMax;
	
	public PorteDeGarage() {
		estVerouille = true;
		pourcentageDOuverture = 0;
		pourcentageDOuvertureMin = 0;
		pourcentageDOuvertureMax = 100;
	}
	
	public PorteDeGarage(boolean _estVerouille, float _pourcentageDOuverture, float _pourcentageDOuvertureMin, float _pourcentageDOuvertureMax) {
		this.estVerouille = _estVerouille;
		this.pourcentageDOuverture = _pourcentageDOuverture;
		this.pourcentageDOuvertureMin = _pourcentageDOuvertureMin;
		this.pourcentageDOuvertureMax = _pourcentageDOuvertureMax;
	}

	public PorteDeGarage(PorteDeGarage _PorteDeGarageACopier) {
		this.estVerouille = _PorteDeGarageACopier.estVerouille;
		this.pourcentageDOuverture = _PorteDeGarageACopier.pourcentageDOuverture;
		this.pourcentageDOuvertureMin = _PorteDeGarageACopier.pourcentageDOuvertureMin;
		this.pourcentageDOuvertureMax = _PorteDeGarageACopier.pourcentageDOuvertureMax;
	}
	
	public boolean verouiller() {
		boolean result = false;
		 if(pourcentageDOuverture == 0 && estVerouille == false) {
			 estVerouille = true;
			 result = true;
		 }
		 return result;
	}
	
	public boolean deverouiller() {
		boolean result = false;
		if(pourcentageDOuverture == 0 && estVerouille == true) {
			estVerouille = true;
			result = true;
		}
		return result;
	}
	
	public boolean ouvrirALaHauteur(float pourcentage) {
		boolean result = false;
		if(pourcentageDOuverture < pourcentage && pourcentage <= pourcentageDOuvertureMax) {
			pourcentageDOuverture = pourcentage;
			result = true;
		}
		
		return result;
	}
	
	public boolean fermerALaHauteur(float pourcentage) {
		boolean result = false;
		if(pourcentageDOuverture > pourcentage && pourcentage >= pourcentageDOuvertureMin) {
			pourcentageDOuverture = pourcentage;
			result = true;
		}
		return result;
	}
	
}
