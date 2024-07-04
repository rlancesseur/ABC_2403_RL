package concatenerTableau;

public class App {

	public static void main(String[] args) {
		
		String[] tab = {"Riri", "Fifi", "et", "Loulou"};
		
		concatener(tab);

	}
	
	public static void concatener(String tableau[]) {
		
		for(int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i] + " ");
		}
	}

}
