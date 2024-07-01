package snakeExercice;

public class App {

	public static void main(String[] args) {
		
		int[][] fenetre = new int [20][20];
		int[][] position = new int [1][1];
		
		Snake jeu = new Snake(fenetre, position, false, false);

	}

}
