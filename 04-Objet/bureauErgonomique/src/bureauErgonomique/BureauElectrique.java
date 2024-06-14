package bureauErgonomique;

public class BureauElectrique extends Bureau {
	
	final private float hauteurMaxEnCM;
	final private float hauteurMinEnCM;
	private float hauteurEnCM;
	private boolean priseBranche;
	private float hauteur1EnCM;
	private float hauteur2EnCM;
	private float hauteur3EnCM;
	
	
	public BureauElectrique() {
		hauteurMaxEnCM = 120;
		hauteurMinEnCM = 80;
		hauteurEnCM = 100;
		priseBranche = true;
		hauteur1EnCM = 90;
		hauteur2EnCM = 100;
		hauteur3EnCM = 110;
	}
	
	public BureauElectrique(float _hauteurMaxEnCM, float _hauteurMinEnCM, float _hauteurEnCM, 
			boolean _priseBranche, float _hauteur1EnCM, float _hauteur2EnCM, float _hauteur3EnCM) {
		this.hauteurMaxEnCM = _hauteurMaxEnCM;
		this.hauteurMinEnCM = _hauteurMinEnCM;
		this.hauteurEnCM = _hauteurEnCM;
		this.priseBranche = _priseBranche;
		this.hauteur1EnCM = _hauteur1EnCM;
		this.hauteur2EnCM = _hauteur2EnCM;
		this.hauteur3EnCM = _hauteur3EnCM;
	}
	
	public BureauElectrique(BureauElectrique _BureauElectriqueARecopier) {
		this.hauteurMaxEnCM = _BureauElectriqueARecopier.hauteurMaxEnCM;
		this.hauteurMinEnCM = _BureauElectriqueARecopier.hauteurMinEnCM;
		this.hauteurEnCM = _BureauElectriqueARecopier.hauteurEnCM;
		this.priseBranche = _BureauElectriqueARecopier.priseBranche;
		this.hauteur1EnCM = _BureauElectriqueARecopier.hauteur1EnCM;
		this.hauteur2EnCM = _BureauElectriqueARecopier.hauteur2EnCM;
		this.hauteur3EnCM = _BureauElectriqueARecopier.hauteur3EnCM;
	}
	
	public boolean monterLeBureau(float hauteur) {
		
		boolean result;
		if(hauteurEnCM + hauteur <= hauteurMaxEnCM && hauteur > 0 && priseBranche == true) {
			hauteurEnCM += hauteur;
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public boolean mettreALaHauteur1() {
		
		boolean result;
		if(priseBranche == true) {
			hauteurEnCM = hauteur1EnCM; 
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public boolean mettreALaHauteur2() {
		
		boolean result;
		if(priseBranche == true) {
			hauteurEnCM = hauteur2EnCM; 
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public boolean mettreALaHauteur3() {
		
		boolean result = false;
		if(priseBranche == true) {
			hauteurEnCM = hauteur3EnCM; 
			result = true;
		}
		
		return result;
	}
	
	public boolean descendreLeBureau(float hauteur) {
		
		boolean result = false;
		if(hauteurEnCM - hauteur >= hauteurMinEnCM && priseBranche == true) {
			hauteurEnCM -= hauteur;
			result = true;
		}
		
		return result;
	}
	
	public boolean positionnerALaHauteur(float hauteur) {
		
		boolean result = false;
		if(priseBranche == true && hauteur > hauteurMinEnCM && hauteur < hauteurMaxEnCM) {
			hauteurEnCM = hauteur;
			result = true;
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
