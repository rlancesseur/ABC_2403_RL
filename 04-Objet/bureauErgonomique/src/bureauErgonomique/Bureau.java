package bureauErgonomique;

public class Bureau {
	
	protected float hauteurEnCM;
	protected float largeurEnCM;
	protected float longueurEnCM;

	
	public Bureau() {
		hauteurEnCM = 80;
		largeurEnCM = 90;
		longueurEnCM = 100;
	}
	
	public Bureau(float _hauteurEnCM, float _largeurEnCM, float _longueurEnCM) {

		this.hauteurEnCM = _hauteurEnCM;
		this.largeurEnCM = _largeurEnCM;
		this.longueurEnCM = _longueurEnCM;
	}
	
	public Bureau(Bureau _BureauARecopier) {
		
		this.hauteurEnCM = _BureauARecopier.hauteurEnCM;
		this.largeurEnCM = _BureauARecopier.largeurEnCM;
		this.longueurEnCM = _BureauARecopier.longueurEnCM;
	}
	
}
