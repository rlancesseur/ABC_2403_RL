package concatenerTableau;

public class App {

	public static void main(String[] args) {
		
		String[] tab = {"Riri", "Fifi", "et", "Loulou"};
		
		System.out.println(concatener(tab));

	}
	
	public static String concatener(String tableau[]) {
		
		String result = "";
		for(int i = 0; i < tableau.length; i++) {
		result += tableau[i] + " ";
		}

		return result;
	}

}
