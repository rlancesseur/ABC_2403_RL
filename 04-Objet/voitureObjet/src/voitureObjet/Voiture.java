package voitureObjet;

public class Voiture {
	
	private boolean porteConducteur;
	private boolean phares;
	private boolean moteur;
	private String marque;
	
	public Voiture() {
		porteConducteur = false;
		phares = false;
		moteur = true;
		marque = "Renault";
	}
	
	public Voiture (boolean _porteConducteur, boolean _phares, boolean _moteur, String _marque) {
		this.porteConducteur = _porteConducteur;
		this.phares = _phares;
		this.moteur = _moteur;
		this.marque = _marque;
	}
	
	public boolean ouvrirPorteConducteur() {
		
		boolean result = false;
		if(this.porteConducteur == false) {
			this.porteConducteur = true;
			result = true;
		}
		
		return result;
	}
	
	public boolean fermerPorteConducteur() {
		
		boolean result = false;
		if(this.porteConducteur == true) {
			this.porteConducteur = false;
			result = true;
		}
		
		return result;		
	}
	
	public boolean allumerPhares() {
		
		boolean result = false;
		if(this.phares == false) {
			this.phares = true;
			result = true;
		}
		
		return result;
	}

	public boolean eteindrePhares() {
		
		boolean result = false;
		if(this.phares == true) {
			this.phares = false;
			result = true;
		}
		
		return result;
	}
	
	public boolean demarrerMoteur() {
		
		boolean result = false;
		if(this.moteur == false) {
			this.moteur = true;
			result = true;
		}
		
		return result;
	}
	
	public boolean arreterMoteur() {
		
		boolean result = false;
		if(this.moteur == true) {
			this.moteur = false;
			result = true;
		}
		
		return result;
	}
	
}
