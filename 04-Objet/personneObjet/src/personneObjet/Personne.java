package personneObjet;

public class Personne {
	
	final String nom;
	final String prenom;
	int age;
	float salaire;
	float autreRevenus;
	
	public Personne() {
		nom = "Dallas";
		prenom = "Korben";
		age = 30;
		salaire = 1000;
		autreRevenus = 500;
	}
	
	public Personne(String _nom, String _prenom, int _age, float _salaire, float _autreRevenus) {
		this.nom = _nom;
		this.prenom = _prenom;
		this.age = _age;
		this.salaire = _salaire;
		this.autreRevenus = _autreRevenus;
	}
	
	public Personne(Personne _PersonneARecopier) {
		this.nom = _PersonneARecopier.nom;
		this.prenom = _PersonneARecopier.prenom;
		this.age = _PersonneARecopier.age;
		this.salaire = _PersonneARecopier.salaire;
		this.autreRevenus = _PersonneARecopier.autreRevenus;
	}
	
	public void modifierRevenus(float nouveauSalaire, float nouveauRevenus) {
		
		this.salaire = nouveauSalaire;
		this.autreRevenus = nouveauRevenus;
	}
	
	public float calculerCharges() {
		
		float result = ((this.salaire * 20) / 100) + ((this.autreRevenus * 15) / 100);
		
		if (age > 50) {
			result = ((this.salaire * 10) / 100) + ((this.autreRevenus * 7.5f) / 100);
		}
		
		return result;
	}

}