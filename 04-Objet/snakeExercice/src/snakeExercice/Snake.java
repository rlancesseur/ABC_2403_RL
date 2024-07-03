package snakeExercice;

public class Snake {
	
	private int nombreLignesHorizontales;
	private int nombreLignesVerticales;
	private int[][] position;
	private int score;
	
	
	public Snake() {
		nombreLignesHorizontales = 10;
		nombreLignesVerticales = 10;
		position = new int[1][1];
		score = 0;
	}
	
	public Snake(int nombreLignesHorizontales, int nombreLignesVerticales, int[][] position, int score) {
		this.nombreLignesHorizontales = nombreLignesHorizontales;
		this.nombreLignesVerticales = nombreLignesVerticales;
		this.position = position;
		this.score = score;
	}
	
	public Snake(Snake SnakeACopier) {
		this.nombreLignesHorizontales = SnakeACopier.nombreLignesHorizontales;
		this.nombreLignesVerticales = SnakeACopier.nombreLignesVerticales;
		this.position = SnakeACopier.position;
		this.score = SnakeACopier.score;
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
