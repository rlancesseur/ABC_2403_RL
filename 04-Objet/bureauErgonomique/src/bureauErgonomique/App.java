package bureauErgonomique;

public class App {

	public static void main(String[] args) {
		
		BureauElectrique bureau1 = new BureauElectrique();
		BureauElectrique bureauWafae = new BureauElectrique(100, 64, true, 75, 75, 100);
		BureauElectrique bureauJP = new BureauElectrique(120, 70, true, 70, 73, 110);
		
		boolean bureauMonte = bureauWafae.monterLeBureau(10);
		bureauMonte = bureauWafae.descendreLeBureau(30);
		boolean misALaHauteur = bureauWafae.mettreALaHauteur1();
		misALaHauteur = bureauWafae.mettreALaHauteur2();
		misALaHauteur = bureauWafae.mettreALaHauteur3();
		boolean priseBranche = bureauWafae.brancheLaPrise();
		priseBranche = bureauWafae.debrancheLaPrise();
		bureauMonte = bureauWafae.monterLeBureau(10);
		priseBranche = bureauWafae.brancheLaPrise();
		misALaHauteur = bureauWafae.positionnerALaHauteur(95);

	}

}
