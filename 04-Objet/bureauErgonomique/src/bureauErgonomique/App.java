package bureauErgonomique;

public class App {

	public static void main(String[] args) {
		
		Bureau bureauTest = new Bureau(120, 100, 300);
		BureauElectrique bureauWafae = new BureauElectrique(70, 200, 150, 100, 64, true);
		BureauElectrique bureauJP = new BureauElectrique(75, 200, 150, 120, 70, true);
		BureauElectriqueReglable bureauReglableTest = new BureauElectriqueReglable(100, 80, 200, 120, 80, true, 90, 100, 110);
		
		boolean aLaHauteur = bureauTest.positionnerALaHauteur(95);
		boolean bureauMonte = bureauReglableTest.monterLeBureau(10);
		bureauMonte = bureauWafae.descendreLeBureau(30);
		boolean priseBranche = bureauWafae.brancheLaPrise();
		priseBranche = bureauWafae.debrancheLaPrise();
		bureauMonte = bureauWafae.monterLeBureau(10);
		priseBranche = bureauWafae.brancheLaPrise();
		aLaHauteur = bureauWafae.positionnerALaHauteur(65);

	}

}