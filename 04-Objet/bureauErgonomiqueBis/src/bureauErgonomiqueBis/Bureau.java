package bureauErgonomiqueBis;

import java.math.BigDecimal;

public class Bureau {
	
	protected BigDecimal hauteurEnCM;
	protected BigDecimal largeurEnCM;
	protected BigDecimal longueurEnCM;

	
	public Bureau() {
		hauteurEnCM = BigDecimal.valueOf(80);
		largeurEnCM = BigDecimal.valueOf(100);
		longueurEnCM = BigDecimal.valueOf(100);
	}
	
	public Bureau(BigDecimal _hauteurEnCM, BigDecimal _largeurEnCM, BigDecimal _longueurEnCM) {

		this.hauteurEnCM = _hauteurEnCM;
		this.largeurEnCM = _largeurEnCM;
		this.longueurEnCM = _longueurEnCM;
	}
	
	public Bureau(Bureau _BureauARecopier) {
		
		this.hauteurEnCM = _BureauARecopier.hauteurEnCM;
		this.largeurEnCM = _BureauARecopier.largeurEnCM;
		this.longueurEnCM = _BureauARecopier.longueurEnCM;
	}
	
	public boolean positionnerALaHauteur(BigDecimal hauteur) {
		
		boolean result = false;
		if(hauteur.compareTo(hauteur) <= 0) {
			hauteurEnCM = hauteur;
			result = true;
		}
		
		return result;
	}
	
}
