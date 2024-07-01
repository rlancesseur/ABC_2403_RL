package bureauErgonomiqueBis;

import java.math.BigDecimal;

public class BureauElectriqueReglable extends BureauElectrique {
	
	private BigDecimal hauteur1EnCM;
	private BigDecimal hauteur2EnCM;
	private BigDecimal hauteur3EnCM;
	
	public BureauElectriqueReglable() {
		super();
		hauteur1EnCM = BigDecimal.valueOf(90);
		hauteur2EnCM = BigDecimal.valueOf(100);
		hauteur3EnCM = BigDecimal.valueOf(110);
	}
	
	public BureauElectriqueReglable(BigDecimal _hauteurEnCM, BigDecimal _largeurEnCM, BigDecimal _longueurEnCM, BigDecimal _hauteurMaxEnCM, 
			BigDecimal _hauteurMinEnCM, boolean _priseBranche, BigDecimal _hauteur1EnCM, BigDecimal _hauteur2EnCM, BigDecimal _hauteur3EnCM) {
		super(_hauteurEnCM, _largeurEnCM, _longueurEnCM, _hauteurMaxEnCM, _hauteurMinEnCM, _priseBranche);
		this.hauteur1EnCM = _hauteur1EnCM;
		this.hauteur2EnCM = _hauteur2EnCM;
		this.hauteur3EnCM = _hauteur3EnCM;
	}
	
	public BureauElectriqueReglable(BureauElectriqueReglable _BureauElectriqueReglableARecopier) {
		super (_BureauElectriqueReglableARecopier);
		this.hauteur1EnCM = _BureauElectriqueReglableARecopier.hauteur1EnCM;
		this.hauteur2EnCM = _BureauElectriqueReglableARecopier.hauteur2EnCM;
		this.hauteur3EnCM = _BureauElectriqueReglableARecopier.hauteur3EnCM;
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

}
