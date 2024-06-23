package bureauErgonomiqueBis;

import java.math.BigDecimal;

public class BureauElectrique extends Bureau {
	
	final private BigDecimal hauteurMaxEnCM;
	final private BigDecimal hauteurMinEnCM;
	private boolean priseBranche;
	private BigDecimal hauteur1EnCM;
	private BigDecimal hauteur2EnCM;
	private BigDecimal hauteur3EnCM;
	
	
	public BureauElectrique() {
		super();
		hauteurMaxEnCM = BigDecimal.valueOf(120);
		hauteurMinEnCM = BigDecimal.valueOf(80);
		priseBranche = true;
		hauteur1EnCM = BigDecimal.valueOf(90);
		hauteur2EnCM = BigDecimal.valueOf(100);
		hauteur3EnCM = BigDecimal.valueOf(110);
	}

	public BureauElectrique(BigDecimal _hauteurEnCM, BigDecimal _largeurEnCM, BigDecimal _longueurEnCM, BigDecimal _hauteurMaxEnCM, 
			BigDecimal _hauteurMinEnCM, boolean _priseBranche, BigDecimal _hauteur1EnCM, BigDecimal _hauteur2EnCM, BigDecimal _hauteur3EnCM) {
		super(_hauteurEnCM, _largeurEnCM, _longueurEnCM);
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
	
	public boolean positionnerALaHauteur(BigDecimal hauteur) {
		
		boolean result = false;
		if(priseBranche == true && hauteur.compareTo(hauteurMinEnCM) >= 0 && hauteur.compareTo(hauteurMaxEnCM) <= 0) {
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

