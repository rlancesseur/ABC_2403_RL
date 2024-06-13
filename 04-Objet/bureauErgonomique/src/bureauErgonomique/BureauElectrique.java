package bureauErgonomique;

public class BureauElectrique extends Bureau {
	
	private float hauteurMaxEnCM;
	private float hauteurMinEnCM;
	private float hauteurEnCM;
	private boolean priseBranche;
	
	
	public BureauElectrique() {
		hauteurMaxEnCM = 120;
		hauteurMinEnCM = 80;
		hauteurEnCM = 100f;
		priseBranche = true;
	}
	
	public BureauElectrique(float _hauteurMaxEnCM, float _hauteurMinEnCM, float _hauteur, boolean _priseBranche) {
		this.hauteurMaxEnCM = _hauteurMaxEnCM;
		this.hauteurMinEnCM = _hauteurMinEnCM;
		this.hauteurEnCM = _hauteur;
		this.priseBranche = _priseBranche;
	}
	
	public boolean monterLeBureau(float hauteur) {
		
		boolean result;
		if(hauteurEnCM + hauteur <= hauteurMaxEnCM && priseBranche == true) {
			hauteurEnCM += hauteur;
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public boolean Niveau1() {
		
		boolean result;
		if(priseBranche == true) {
			hauteurEnCM = (hauteurMaxEnCM - hauteurMinEnCM) / 2.5f; 
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public boolean Niveau2() {
		
		boolean result;
		if(priseBranche == true) {
			hauteurEnCM = (hauteurMaxEnCM - hauteurMinEnCM) / 2; 
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public boolean Niveau3() {
		
		boolean result;
		if(priseBranche == true) {
			hauteurEnCM = (hauteurMaxEnCM - hauteurMinEnCM) / 1.5f; 
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public boolean descendreLeBureau(float hauteur) {
		
		boolean result;
		if(hauteurEnCM - hauteur >= hauteurMinEnCM && priseBranche == true) {
			hauteurEnCM -= hauteur;
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public boolean brancheLaPrise() {
		
		boolean result;
		if(priseBranche == false) {
			priseBranche = true;
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public boolean debrancheLaPrise() {
		
		boolean result;
		if(priseBranche = true) {
			priseBranche = false;
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}

}
