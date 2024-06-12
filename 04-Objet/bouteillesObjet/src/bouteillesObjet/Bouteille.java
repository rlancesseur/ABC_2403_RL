package bouteillesObjet;

public class Bouteille {
	
	//attributes
	
	private float contenanceEnL;
	private float contenuEnL;
	private boolean ouvert;
	private String typeDuContenue;

	//access/modifier
	
	//constructor
	
	//constructeur par defaut
	
	public Bouteille() {
		contenanceEnL = 1;
		contenuEnL = 1;
		ouvert = false;
		typeDuContenue = "H2O";
	}
	
	//constructeur classique
	
	public Bouteille(float _contenanceEnL, float _contenuEnL, boolean _ouvert, String _typeDuContenue) {
		this.contenanceEnL = _contenanceEnL;
		this.contenuEnL = _contenuEnL;
		this.ouvert = _ouvert;
		this.typeDuContenue = _typeDuContenue;
	}
	
	//constructeur par recopie ou de clonage
	
	public Bouteille(Bouteille _bouteilleARecopier) {
		this.contenanceEnL = _bouteilleARecopier.contenanceEnL;
		this.contenuEnL = _bouteilleARecopier.contenuEnL;
		this.ouvert = _bouteilleARecopier.ouvert;
		this.typeDuContenue = _bouteilleARecopier.typeDuContenue;
	}
	
	
	//methods
	
	public float donneContenanceEnCl() {
		
		float result = this.contenanceEnL * 100;
		
		return result;
	}
	
	
	public float donneContenueEnCL() {
		
		float result = this.contenuEnL * 100;
		
		return result;
	}
	
	
	public boolean estPleine() {
		
		boolean result;
		if(this.contenuEnL == this.contenanceEnL) {
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	
	public boolean ouvrir() {
		
		boolean result;
		if(this.ouvert == false) {
			this.ouvert = true;
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	

	public boolean fermer() {
		
		boolean result;
		if(this.ouvert == true) {
			this.ouvert = false;
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	
	public boolean laRemplir() {
		
		boolean result;
		if(this.contenuEnL < this.contenanceEnL && this.ouvert == true) {
			this.contenuEnL = this.contenanceEnL;
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	
	public boolean laRemplir(float quantite) {
		
		boolean result = false;
		if(this.contenuEnL + quantite <= this.contenanceEnL && this.ouvert) {
			this.contenuEnL += quantite;
			result = true;
		}

		return result;
	}
	
	
	public boolean laVider() {
		
		boolean result;
		if(this.contenuEnL > 0 && this.ouvert == true) {
			this.contenuEnL = 0;
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	
	public boolean laVider(float quantite) {
		
		boolean result;
		if(this.contenuEnL - quantite >= 0 && this.ouvert == true) {
			this.contenuEnL -= quantite;
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
}
