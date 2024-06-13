package bureauErgonomique;

public class App {

	public static void main(String[] args) {
		
		BureauElectrique bureau1 = new BureauElectrique();
		BureauElectrique bureau2 = new BureauElectrique(250, 100, 130, true);
		BureauElectrique bureau3 = new BureauElectrique(200, 50, 100, false);
		BureauElectrique bureau4 = new BureauElectrique(300, 200, 230, false);
		BureauElectrique bureau5 = new BureauElectrique(150, 80, 120, true);
		
		
		boolean bureauMonte = bureau2.monterLeBureau(50);
		boolean bureauDescendu = bureau3.descendreLeBureau(20);
		boolean priseBranche = bureau4.brancheLaPrise();
		priseBranche = bureau5.debrancheLaPrise();
		priseBranche = bureau5.brancheLaPrise();
		boolean niveau1 = bureau5.Niveau1();
		boolean niveau2 = bureau5.Niveau2();
		boolean niveau3 = bureau5.Niveau3();
		priseBranche = bureau2.debrancheLaPrise();
		priseBranche = bureau2.brancheLaPrise();
		bureauMonte = bureau2.monterLeBureau(20);
		bureauMonte = bureau2.monterLeBureau(50);
		niveau1 = bureau2.Niveau1();
	}

}
