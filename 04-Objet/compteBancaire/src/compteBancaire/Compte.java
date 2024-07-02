package compteBancaire;

public class Compte {
	
	private int numeroCompte;
	private String nomProprietaire;
	private float solde;
	private float decouvertAutorise;
	
	public Compte() {
		numeroCompte = 12345;
		nomProprietaire = "toto";
		solde = 1000;
		decouvertAutorise = -500;
	}
	
	public Compte(int _numeroCompte, String _nomProprietaire, float _solde, float _decouvertAutorise) {
		this.numeroCompte = _numeroCompte;
		this.nomProprietaire = _nomProprietaire;
		this.solde = _solde;
		this.decouvertAutorise = _decouvertAutorise;
	}
	
	public void afficheContenu() {
		System.out.println("Numéro de compte : " + numeroCompte + " / Nom du propriétaire : " + nomProprietaire + " / Solde : " + solde + " / Découvert autorisé : " + decouvertAutorise);
	}
	
	public void crediterMontant(float montant) {
		if(montant > 0) {
			solde += montant;
		}
	}
	
	public boolean debiterSolde(float montant) {
		
		boolean result = false;
		if(montant > 0 && (solde - montant) >= decouvertAutorise ) {
			solde -= montant;
			result = true;
		}
		
		return result;
	}
	
	public void transfererMontant(float montant, Compte compte) {
		solde -= montant;
		compte.solde += montant;		
	}
	
	public boolean superieur(Compte compte) {
		boolean result = false;
		if(solde > compte.solde) {
			result = true;
		}
		return result;
	}

}
