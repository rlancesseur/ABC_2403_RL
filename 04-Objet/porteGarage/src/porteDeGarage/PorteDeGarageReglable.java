package porteDeGarage;

public class PorteDeGarageReglable extends PorteDeGarage {
	
	float hauteur1EnPourcentage;
	float hauteur2EnPourcentage;
	float hauteur3EnPourcentage;
	
	public PorteDeGarageReglable() {
		hauteur1EnPourcentage = 25;
		hauteur2EnPourcentage = 50;
		hauteur3EnPourcentage = 75;
	}
	
	public PorteDeGarageReglable(boolean _estVerouille, float _pourcentageDOuverture, float _pourcentageDOuvertureMin, 
			float _pourcentageDOuvertureMax, float _hauteur1EnPourcentage, float _hauteur2EnPourcentage, float _hauteur3EnPourcentage) {
		super(_estVerouille, _pourcentageDOuverture, _pourcentageDOuvertureMin, _pourcentageDOuvertureMax);
		this.hauteur1EnPourcentage = _hauteur1EnPourcentage;
		this.hauteur2EnPourcentage = _hauteur2EnPourcentage;
		this.hauteur3EnPourcentage = _hauteur3EnPourcentage;		
	}
	
	public PorteDeGarageReglable(PorteDeGarageReglable _PorteDeGarageReglableACopier) {
		super(_PorteDeGarageReglableACopier);
		this.hauteur1EnPourcentage = _PorteDeGarageReglableACopier.hauteur1EnPourcentage;
		this.hauteur2EnPourcentage = _PorteDeGarageReglableACopier.hauteur2EnPourcentage;
		this.hauteur3EnPourcentage = _PorteDeGarageReglableACopier.hauteur3EnPourcentage;
	}
	
	public void mettreALaHauteur1() {
		pourcentageDOuverture = hauteur1EnPourcentage;
	}
	
	public void mettreALaHauteur2() {
		pourcentageDOuverture = hauteur2EnPourcentage;
	}
	
	public void mettreALaHauteur3() {
		pourcentageDOuverture = hauteur3EnPourcentage;
	}

}
