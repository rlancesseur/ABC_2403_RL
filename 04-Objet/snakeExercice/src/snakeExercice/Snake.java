package snakeExercice;

public class Snake {
	
	private int[][] fenetre;
	private int[][] position;
	private boolean collision;
	private boolean gameOver;
	
	
	public Snake() {
		fenetre = new int[20][20];
		position = new int[1][1];
		collision = false;
		gameOver = false;
	}
	
	public Snake(int[][] fenetre, int[][] position, boolean collision, boolean gameOver) {
		this.fenetre = fenetre;
		this.position = position;
		this.collision = collision;
		this.gameOver = gameOver;
	}
	
	public Snake(Snake SnakeACopier) {
		this.fenetre = SnakeACopier.fenetre;
		this.position = SnakeACopier.position;
		this.collision = SnakeACopier.collision;
		this.gameOver = SnakeACopier.gameOver;
	}
	
	
	private void estUneBordure(int[][] tableau) {

		
		for(int i = 0; i <= tableau[i][0] && i <= tableau[0][i]; i++) {
			tableau[i][0] = 1;
			tableau[0][i] = 1;
		}
		
		for(int i = tableau.length; i >= tableau[i][0] && i >= tableau[0][i]; i-- ) {
			tableau[i][0] = 1;
			tableau[0][i] = 1;
		}

	}
	
	private void versLeHaut() {
	}
	
	private void versLeBas() {
	}
	
	private void versLaGauche() {
	}
	
	private void versLaDroite() {
	}
	

}
