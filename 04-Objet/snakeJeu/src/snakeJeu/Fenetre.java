package snakeJeu;

import javax.swing.JFrame;

public class Fenetre extends JFrame {
	
	public Fenetre() {
		setTitle("Snake");
		setSize(800, 600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		Fenetre jeu = new Fenetre();

	}

}
