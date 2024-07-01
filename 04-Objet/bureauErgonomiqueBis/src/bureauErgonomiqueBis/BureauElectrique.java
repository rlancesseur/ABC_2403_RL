package bureauErgonomiqueBis;

import java.math.BigDecimal;

public class BureauElectrique extends Bureau {
	
	final private BigDecimal hauteurMaxEnCM;
	final private BigDecimal hauteurMinEnCM;
	private boolean priseBranche;
	
	
	public BureauElectrique() {
		super();
		hauteurMaxEnCM = BigDecimal.valueOf(120);
		hauteurMinEnCM = BigDecimal.valueOf(80);
		priseBranche = true;
		
	}

	public BureauElectrique(BigDecimal _hauteurEnCM, BigDecimal _largeurEnCM, BigDecimal _longueurEnCM, BigDecimal _hauteurMaxEnCM, 
			BigDecimal _hauteurMinEnCM, boolean _priseBranche) {
		super(_hauteurEnCM, _largeurEnCM, _longueurEnCM);
		this.hauteurMaxEnCM = _hauteurMaxEnCM;
		this.hauteurMinEnCM = _hauteurMinEnCM;
		this.priseBranche = _priseBranche;
	}
	
	public BureauElectrique(BureauElectrique _BureauElectriqueARecopier) {
		super();
		this.hauteurMaxEnCM = _BureauElectriqueARecopier.hauteurMaxEnCM;
		this.hauteurMinEnCM = _BureauElectriqueARecopier.hauteurMinEnCM;
		this.priseBranche = _BureauElectriqueARecopier.priseBranche;
	}

	
	public boolean monterLeBureau(BigDecimal hauteur) {
		
		boolean result = false;
		if((super.hauteurEnCM.add(hauteur)).compareTo(hauteurMaxEnCM) < 0 && hauteur.compareTo(BigDecimal.ZERO) >= 0 && priseBranche == true) {
			super.hauteurEnCM = super.hauteurEnCM.add(hauteur);
			result = true;
		}
		
		return result;
	}
	
	public boolean descendreLeBureau(BigDecimal hauteur) {
		
		boolean result = false;
		if((super.hauteurEnCM.subtract(hauteur)).compareTo(hauteurMaxEnCM) < 0 && hauteur.compareTo(BigDecimal.ZERO) >= 0 && priseBranche == true) {
			super.hauteurEnCM = super.hauteurEnCM.subtract(hauteur);
			result = true;
		}
		
		return result;
	}
	
	@Override
	public boolean positionnerALaHauteur(BigDecimal hauteur) {
		
		boolean result = false;
		if(priseBranche == true && hauteur.compareTo(hauteurMinEnCM) >= 0 && hauteur.compareTo(hauteurMaxEnCM) <= 0) {
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

