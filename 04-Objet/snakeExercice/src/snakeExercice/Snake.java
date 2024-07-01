package snakeExercice;

public class Snake {
	
	int[][] fenetre;
	int xPosition;
	int yPosition;
	int[] position;
	boolean bordure;
	boolean collision;
	boolean gameOver;
	
	
	public Snake() {
		fenetre = new int[20][20];
		xPosition = 5;
		yPosition = 5;
		position = new int[1];
		bordure = false;
		collision = false;
		gameOver = false;
	}
	
	public Snake(int[][] fenetre, int xPosition, int yPosition, int[] position, boolean bordure, boolean collision, boolean gameOver) {
		this.fenetre = fenetre;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.position = position;
		this.bordure = bordure;
		this.collision = collision;
	}
	
	public Snake(Snake SnakeACopier) {
		this.fenetre = SnakeACopier.fenetre;
		this.xPosition = SnakeACopier.xPosition;
		this.yPosition = SnakeACopier.yPosition;
		this.position = SnakeACopier.position;
		this.bordure = SnakeACopier.bordure;
		this.collision = SnakeACopier.collision;
		this.gameOver = SnakeACopier.gameOver;
	}
	
	
	public static boolean estUneBordure(int[][] tableau) {
		
		boolean bordure = false;
		
		for(int i = 0; i <= tableau[i][0] && i <= tableau[0][i]; i++) {
			bordure = true;
		}
		
		for(int i = tableau.length; i >= tableau[i][0] && i >= tableau[0][i]; i-- ) {
			bordure = true;
		}
		
		return bordure;
	}
	
	public static void gameOver() {
		if(bordure == true) {
			gameOver = true;
		}
	}
	

}
