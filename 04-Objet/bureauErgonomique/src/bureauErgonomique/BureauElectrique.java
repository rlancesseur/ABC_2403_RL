package bureauErgonomique;

public class BureauElectrique extends Bureau {
	
	final protected float hauteurMaxEnCM;
	final protected float hauteurMinEnCM;
	protected boolean priseBranche;
	
	
	public BureauElectrique() {
		super();
		hauteurMaxEnCM = 120;
		hauteurMinEnCM = 80;
		priseBranche = true;
	}
	
	public BureauElectrique(float _hauteurEnCM, float _largeurEnCM, float _longueurEnCM, float _hauteurMaxEnCM, float _hauteurMinEnCM,
			boolean _priseBranche) {
		super(_hauteurEnCM, _largeurEnCM, _longueurEnCM);
		this.hauteurMaxEnCM = _hauteurMaxEnCM;
		this.hauteurMinEnCM = _hauteurMinEnCM;
		this.priseBranche = _priseBranche;
	}
	
	public BureauElectrique(BureauElectrique _BureauElectriqueARecopier) {
		super(_BureauElectriqueARecopier);
		this.hauteurMaxEnCM = _BureauElectriqueARecopier.hauteurMaxEnCM;
		this.hauteurMinEnCM = _BureauElectriqueARecopier.hauteurMinEnCM;
		this.priseBranche = _BureauElectriqueARecopier.priseBranche;
	}
	
	
	public boolean monterLeBureau(float hauteur) {
		
		boolean result = false;
		if(super.hauteurEnCM + hauteur <= hauteurMaxEnCM && hauteur > 0 && priseBranche == true) {
			super.hauteurEnCM += hauteur;
			result = true;
		}
		
		return result;
	}
	
	public boolean descendreLeBureau(float hauteur) {
		
		boolean result = false;
		if(super.hauteurEnCM - hauteur >= hauteurMinEnCM && hauteur > 0 && priseBranche == true) {
			super.hauteurEnCM -= hauteur;
			result = true;
		}
		
		return result;
	}
	
	@Override
	public boolean positionnerALaHauteur(float hauteur) {
		
		boolean result = false;
		if(priseBranche == true && hauteur >= hauteurMinEnCM && hauteur <= hauteurMaxEnCM) {
			super.positionnerALaHauteur(hauteur);
		}
		
		return result;
	}
	
	public boolean brancheLaPrise() {
		
		boolean result = false;
		if(priseBranche == false) {
			priseBranche = true;
			result = true;
		}
		
		return result;
	}
	
	public boolean debrancheLaPrise() {
		
		boolean result = false;
		if(priseBranche == true) {
			priseBranche = false;
			result = true;
		}
		
		return result;
	}

}
