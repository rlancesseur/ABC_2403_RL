package bureauErgonomique;

import java.math.BigDecimal;

public class BureauElectrique extends Bureau {
	
	private static float _hauteurEnCM;
	final private float hauteurMaxEnCM;
	final private float hauteurMinEnCM;
	private boolean priseBranche;
	private float hauteur1EnCM;
	private float hauteur2EnCM;
	private float hauteur3EnCM;
	
	
	public BureauElectrique() {
		super();
		hauteurMaxEnCM = 120;
		hauteurMinEnCM = 80;
		priseBranche = true;
		hauteur1EnCM = 90;
		hauteur2EnCM = 100;
		hauteur3EnCM = 110;
	}
	
	public BureauElectrique(BigDecimal _hauteurEnCM, BigDecimal _largeurEnCM, BigDecimal _longueurEnCM, float _hauteurMaxEnCM, float _hauteurMinEnCM,
			boolean _priseBranche, float _hauteur1EnCM, float _hauteur2EnCM, float _hauteur3EnCM) {
		super(BigDecimal _hauteurEnCM, BigDecimal _largeurEnCM, BigDecimal _longueurEnCM);
		this.hauteurMaxEnCM = _hauteurMaxEnCM;
		this.hauteurMinEnCM = _hauteurMinEnCM;
		this.priseBranche = _priseBranche;
		this.hauteur1EnCM = _hauteur1EnCM;
		this.hauteur2EnCM = _hauteur2EnCM;
		this.hauteur3EnCM = _hauteur3EnCM;
	}
	
	public BureauElectrique(BureauElectrique _BureauElectriqueARecopier) {
		super();
		this.hauteurMaxEnCM = _BureauElectriqueARecopier.hauteurMaxEnCM;
		this.hauteurMinEnCM = _BureauElectriqueARecopier.hauteurMinEnCM;
		this.priseBranche = _BureauElectriqueARecopier.priseBranche;
		this.hauteur1EnCM = _BureauElectriqueARecopier.hauteur1EnCM;
		this.hauteur2EnCM = _BureauElectriqueARecopier.hauteur2EnCM;
		this.hauteur3EnCM = _BureauElectriqueARecopier.hauteur3EnCM;
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
	
	public boolean positionnerALaHauteur(float hauteur) {
		
		boolean result = false;
		if(priseBranche == true && hauteur >= hauteurMinEnCM && hauteur <= hauteurMaxEnCM) {
			super.hauteurEnCM = hauteur;
			result = true;
		}
		
		return result;
	}
	
	public boolean mettreALaHauteur1() {
		
		return positionnerALaHauteur(hauteur1EnCM);
	}
	
	public boolean mettreALaHauteur2() {
		
		return positionnerALaHauteur(hauteur2EnCM);
	}
	
	public boolean mettreALaHauteur3() {
		
		return positionnerALaHauteur(hauteur3EnCM);
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

