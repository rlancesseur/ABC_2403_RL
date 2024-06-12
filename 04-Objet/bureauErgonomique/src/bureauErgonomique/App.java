package bureauErgonomique;

public class App {

	public static void main(String[] args) {
		
		Bureau bureau1 = new Bureau();
		Bureau bureau2 = new Bureau(2.5f, 1, 1.3f, true);
		Bureau bureau3 = new Bureau(2f, 0.5f, 1f, false);
		Bureau bureau4 = new Bureau(3, 2, 2.3f, false);
		Bureau bureau5 = new Bureau(5, 1, 1.5f, true);
		
		
		boolean bureauMonte = bureau2.monterLeBureau(0.5f);
		boolean bureauDescendu = bureau3.descendreLeBureau(0.2f);
		boolean priseBranche = bureau4.brancheLaPrise();
		priseBranche = bureau5.debrancheLaPrise();
		priseBranche = bureau5.brancheLaPrise();
		boolean niveau1 = bureau5.Niveau1();
		boolean niveau2 = bureau5.Niveau2();
		boolean niveau3 = bureau5.Niveau3();
		priseBranche = bureau2.debrancheLaPrise();
		priseBranche = bureau2.brancheLaPrise();
		bureauMonte = bureau2.monterLeBureau(2);
		bureauMonte = bureau2.monterLeBureau(0.5f);
		niveau1 = bureau2.Niveau1();
	}

}
