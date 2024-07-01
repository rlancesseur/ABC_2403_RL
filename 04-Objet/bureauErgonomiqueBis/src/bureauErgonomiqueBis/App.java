package bureauErgonomiqueBis;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		
		BureauElectriqueReglable bureauWafae = new BureauElectriqueReglable(BigDecimal(80), BigDecimal(100), BigDecimal(100), BigDecimal(100),
				BigDecimal(64), true, BigDecimal(75), BigDecimal(75), BigDecimal(100));
		BureauElectriqueReglable bureauJP = new BureauElectriqueReglable(BigDecimal(80), BigDecimal(100), BigDecimal(100), BigDecimal(120),
				BigDecimal(70), true, BigDecimal(70), BigDecimal(73), BigDecimal(110));
		
		
		
		boolean bureauMonte = bureauWafae.monterLeBureau(BigDecimal(10));
		boolean misALaHauteur = bureauWafae.mettreALaHauteur1();
		misALaHauteur = bureauWafae.mettreALaHauteur2();
		misALaHauteur = bureauWafae.mettreALaHauteur3();
		bureauMonte = bureauWafae.monterLeBureau(BigDecimal(50));
		boolean priseBranche = bureauWafae.brancheLaPrise();
		priseBranche = bureauWafae.debrancheLaPrise();
		misALaHauteur = bureauWafae.positionnerALaHauteur(BigDecimal(100));

	}

	private static BigDecimal BigDecimal(int i) {
		
		return BigDecimal.valueOf(i);
	}



}
