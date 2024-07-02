package compteBancaire;

public class App {

	public static void main(String[] args) {
		
		Compte c = new Compte();
		Compte c1 = new Compte(4242,"Rémi", 2000, -1000);
		Compte c2 = new Compte(1616, "Marie", 3000, -2000);
		
		
		c1.crediterMontant(150);
		c2.crediterMontant(150);
		
		c1.afficheContenu();
		c2.afficheContenu();
		
		boolean ok = c1.debiterSolde(1000);
		if(ok) {
			System.out.println("Débit réussi");
		}
		else {
			System.out.println("Echec du Débit");
		}
		
		ok = c1.debiterSolde(4000);
		if(ok) {
			System.out.println("Débit réussi");
		}
		else {
			System.out.println("Echec du Débit");
		}
		
		c1.transfererMontant(10, c2);
		
		c1.afficheContenu();
		c2.afficheContenu();
		
		if(c1.superieur(c2)) {
			System.out.println("Supérieur");
		}
		else {
			System.out.println("Inférieur");
		}

		
	}

}
