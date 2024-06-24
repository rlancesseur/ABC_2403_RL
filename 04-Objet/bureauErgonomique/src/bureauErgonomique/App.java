package bureauErgonomique;

public class App {

	public static void main(String[] args) {
		
		Bureau bureauTest = new Bureau(120, 100, 300);
		BureauElectrique bureauWafae = new BureauElectrique(70, 200, 150, 100, 64, true);
		BureauElectrique bureauJP = new BureauElectrique(75, 200, 150, 120, 70, true);
		BureauElectriqueReglable bureauReglableTest = new BureauElectriqueReglable(100, 80, 200, 120, 80, true, 90, 100, 110);
		
		boolean aLaHauteur = bureauTest.positionnerALaHauteur(95);
		aLaHauteur = bureauTest.positionnerALaHauteur(0);
		aLaHauteur = bureauTest.positionnerALaHauteur(50);
		
		boolean bureauMonte = bureauWafae.monterLeBureau(10);
		boolean bureauDescendu = bureauWafae.descendreLeBureau(30);
		boolean priseBranche = bureauWafae.brancheLaPrise();
		priseBranche = bureauWafae.debrancheLaPrise();
		priseBranche = bureauWafae.brancheLaPrise();
		bureauMonte = bureauWafae.monterLeBureau(10);
		aLaHauteur = bureauWafae.positionnerALaHauteur(63);
		aLaHauteur = bureauWafae.positionnerALaHauteur(64);
		
		aLaHauteur = bureauReglableTest.positionnerALaHauteur(130);
		aLaHauteur = bureauReglableTest.positionnerALaHauteur(0);
		aLaHauteur = bureauReglableTest.positionnerALaHauteur(115);
		priseBranche = bureauReglableTest.brancheLaPrise();
		bureauMonte = bureauReglableTest.monterLeBureau(10);
		bureauDescendu = bureauReglableTest.descendreLeBureau(20);
		aLaHauteur = bureauReglableTest.mettreALaHauteur1();
		aLaHauteur = bureauReglableTest.mettreALaHauteur2();
		aLaHauteur = bureauReglableTest.mettreALaHauteur3();

	}

}