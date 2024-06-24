package bureauErgonomique;

public class App {

	public static void main(String[] args) {
		
		BureauElectrique bureau1 = new BureauElectrique();
		BureauElectrique bureauWafae = new BureauElectrique(70, 200, 150, 100, 64, true);
		BureauElectrique bureauJP = new BureauElectrique(75, 200, 150, 120, 70, true);
		
		boolean bureauMonte = bureauWafae.monterLeBureau(10);
		bureauMonte = bureauWafae.descendreLeBureau(30);
		boolean priseBranche = bureauWafae.brancheLaPrise();
		priseBranche = bureauWafae.debrancheLaPrise();
		bureauMonte = bureauWafae.monterLeBureau(10);
		priseBranche = bureauWafae.brancheLaPrise();

	}

}