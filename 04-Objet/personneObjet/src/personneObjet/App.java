package personneObjet;

public class App {

	public static void main(String[] args) {
		
		Personne personne1 = new Personne("Lancesseur", "Rémi", 32, 1500, 500);
		
		float charge = personne1.calculerCharges();
		
		personne1.modifierRevenus(1700, 650);		
		
		charge = personne1.calculerCharges();
	
	}

}
