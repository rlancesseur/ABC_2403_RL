package snakeJeu;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class Jeu extends JPanel implements ActionListener{
	
	private class Case {	
		int x;
		int y;
		
		Case(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	int largeur;
	int hauteur;
	int taille = 25;
	
	Case teteSerpent;
	
	Case pomme;
	Random random;
	
	Timer gameLoop;
	
	Jeu(int largeur, int hauteur) {
		this.largeur = largeur;
		this.hauteur = hauteur;
		setPreferredSize(new Dimension(this.largeur, this.hauteur));
		setBackground(Color.black);
		
		teteSerpent = new Case(5, 5);
		
		pomme = new Case(10, 10);
		random = new Random();
		placePomme();
		
		gameLoop = new Timer(100, this);
		gameLoop.start();
	}
		
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
			
		}

	public void draw(Graphics g) {
		
		for (int i = 0; i < largeur/taille; i++) {
			g.drawLine(i*taille, 0, i*taille, hauteur);
			g.drawLine(0, i*taille, largeur, i*taille);
		}
		
		g.setColor(Color.red);
		g.fillRect(pomme.x * taille, pomme.y * taille, taille, taille);
		
		g.setColor(Color.green);
		g.fillRect(teteSerpent.x * taille, teteSerpent.y * taille, taille, taille);
	}
	
	public void placePomme() {
		pomme.x = random.nextInt(largeur/taille);
		pomme.y = random.nextInt(hauteur/taille);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();		
	}
	
}
