package voitureObjet;

public class Voiture {
	
	private boolean porteConducteur;
	private boolean phares;
	private boolean moteur;
	private boolean eclairageInterieur;
	private String marque;
	
	public Voiture() {
		porteConducteur = false;
		phares = false;
		moteur = false;
		eclairageInterieur = false;
		marque = "Renault";
	}
	
	public Voiture (boolean _porteConducteur, boolean _phares, boolean _moteur, boolean _eclairageInterieur, String _marque) {
		this.porteConducteur = _porteConducteur;
		this.phares = _phares;
		this.moteur = _moteur;
		this.eclairageInterieur = _eclairageInterieur;
		this.marque = _marque;
	}
	
	public boolean ouvrirPorteConducteur() {
		
		boolean result = false;
		if(this.porteConducteur == false) {
			this.porteConducteur = true;
			this.eclairageInterieur = true;
			result = true;
		}
		
		return result;
	}
	
	public boolean fermerPorteConducteur() {
		
		boolean result = false;
		if(this.porteConducteur == true) {
			this.porteConducteur = false;
			this.eclairageInterieur = false;
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
