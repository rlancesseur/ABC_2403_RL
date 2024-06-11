package bureauErgonomique;

public class Bureau {
	
	private float hauteurMaxEnM;
	private float hauteurMinEnM;
	private float hauteurEnM;
	private boolean priseBranche;
	
	
	public Bureau() {
		hauteurMaxEnM = 2;
		hauteurMinEnM = 1;
		hauteurEnM = 1.5f;
		priseBranche = true;
	}
	
	public Bureau(float _hauteurMax, float _hauteurMinEnM, float _hauteur, boolean _priseBranche) {
		this.hauteurMaxEnM = _hauteurMax;
		this.hauteurMinEnM = _hauteurMinEnM;
		this.hauteurEnM = _hauteur;
		this.priseBranche = _priseBranche;
	}
	
	public boolean monterLeBureau(float hauteur) {
		
		boolean result;
		if(hauteurEnM + hauteur <= hauteurMaxEnM && priseBranche == true) {
			hauteurEnM += hauteur;
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public boolean descendreLeBureauNiveau1() {
		
		boolean result;
		if(hauteurEnM < hauteurMaxEnM && priseBranche == true) {
			niveau
		}
	}
	
	public boolean descendreLeBureau(float hauteur) {
		
		boolean result;
		if(hauteurEnM - hauteur >= hauteurMinEnM && priseBranche == true) {
			hauteurEnM -= hauteur;
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
