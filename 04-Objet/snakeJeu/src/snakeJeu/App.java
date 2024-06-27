package snakeJeu;

import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame {	

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Snake"); 
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Jeu jeu = new Jeu(600, 600);
		frame.add(jeu);
		frame.pack();

	}

}
