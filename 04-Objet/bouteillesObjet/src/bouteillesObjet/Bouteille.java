package bouteillesObjet;

public class Bouteille {
	
	private float contenanceEnL;
	private float contenuEnL;
	private boolean ouvert;
	private String typeDuContenue;

	
	public float donneContenanceEnCl() {
		
		float contenanceEnCl = contenanceEnL * 100;
		
		return contenanceEnCl;
		
	}
	
	public float donneContenueEnCL() {
		
		float contenuEnCl = contenuEnL * 100;
		
		return contenuEnCl;
		
	}
	
	public boolean estPleine() {
		
		if(contenuEnL == contenanceEnL)
		return;
	}
	
	/*
	public boolean ouvrir() {
		
	}
	
	public boolean fermer() {
		
	}
	
	public boolean laRemplir() {
		
	}
	
	public boolean laRemplir(float quantite) {
		
	}
	
	public boolean laVider() {
		
	}
	
	public boolean laVider(float quantite) {
		
	}*/
	
}
