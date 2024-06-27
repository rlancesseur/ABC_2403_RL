package bureauErgonomique;

public class BureauElectriqueReglable extends BureauElectrique {
	
	private float hauteur1EnCM;
	private float hauteur2EnCM;
	private float hauteur3EnCM;
	
	
	public BureauElectriqueReglable() {
		super();
		hauteur1EnCM = 90;
		hauteur2EnCM = 100;
		hauteur3EnCM = 110;
	}
	
	public BureauElectriqueReglable(float _hauteurEnCM, float _largeurEnCM, float _longueurEnCM, float _hauteurMaxEnCM, float _hauteurMinEnCM,
			boolean _priseBranche, float _hauteur1EnCM, float _hauteur2EnCM, float _hauteur3EnCM) {
		super(_hauteurEnCM, _largeurEnCM, _longueurEnCM, _hauteurMaxEnCM, _hauteurMinEnCM, _priseBranche);
		this.hauteur1EnCM = _hauteur1EnCM;
		this.hauteur2EnCM = _hauteur2EnCM;
		this.hauteur3EnCM = _hauteur3EnCM;
	}
	
	public BureauElectriqueReglable(BureauElectriqueReglable _BureauElectriqueReglableARecopier) {
		super(_BureauElectriqueReglableARecopier);
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
