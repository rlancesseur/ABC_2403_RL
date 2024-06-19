package bureauErgonomique;

public class Bureau {
	
	private String matiere;
	protected float hauteurEnCM;

	public Bureau() {
		matiere = "Bois";
		hauteurEnCM = 110;
	}
	
	public Bureau(String _matiere, float _hauteurEnCM) {
		this.matiere = _matiere;
		this.hauteurEnCM = _hauteurEnCM;
	}
	
	public Bureau(Bureau _BureauARecopier) {
		this.matiere = _BureauARecopier.matiere;
		this.hauteurEnCM = _BureauARecopier.hauteurEnCM;
	}
	
}
