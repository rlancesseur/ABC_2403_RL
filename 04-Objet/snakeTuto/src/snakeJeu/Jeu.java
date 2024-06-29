package snakeJeu;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class Jeu extends JPanel implements ActionListener, KeyListener {
	
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
	ArrayList<Case> corpsSerpent;
	
	Case pomme;
	Random random;
	
	Timer gameLoop;
	int velocityX;
	int velocityY;
	boolean gameOver = false;
	
	Jeu(int largeur, int hauteur) {
		this.largeur = largeur;
		this.hauteur = hauteur;
		setPreferredSize(new Dimension(this.largeur, this.hauteur));
		setBackground(Color.black);
		addKeyListener(this);
		setFocusable(true);
		
		teteSerpent = new Case(5, 5);
		corpsSerpent = new ArrayList<Case>();
		
		pomme = new Case(10, 10);
		random = new Random();
		placePomme();
		
		velocityX = 0;
		velocityY = 0;
		
		gameLoop = new Timer(100, this);
		gameLoop.start();
	}
		
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
			
		}

	public void draw(Graphics g) {
		/*
		for (int i = 0; i < largeur/taille; i++) {
			g.drawLine(i*taille, 0, i*taille, hauteur);
			g.drawLine(0, i*taille, largeur, i*taille);
		}
		*/
		
		g.setColor(Color.red);
		//g.fillRect(pomme.x * taille, pomme.y * taille, taille, taille);
		g.fill3DRect(pomme.x * taille, pomme.y * taille, taille, taille, true);
		
		g.setColor(Color.green);
		//g.fillRect(teteSerpent.x * taille, teteSerpent.y * taille, taille, taille);
		g.fill3DRect(teteSerpent.x * taille, teteSerpent.y * taille, taille, taille, true);
		
		for (int i = 0; i < corpsSerpent.size(); i++) {
			Case partieSerpent = corpsSerpent.get(i);
			//g.fillRect(partieSerpent.x * taille, partieSerpent.y * taille, taille, taille);
			g.fill3DRect(partieSerpent.x * taille, partieSerpent.y * taille, taille, taille, true);
		}
		
		g.setFont(new Font("Arial", Font.PLAIN, 16));
		if (gameOver) {
			g.setColor(Color.red);
			g.drawString("Game Over : " + String.valueOf(corpsSerpent.size()), taille - 16, taille);
		}
		else {
			g.drawString("Score : " + String.valueOf(corpsSerpent.size()), taille - 16, taille);
		}
	}
	
	public void placePomme() {
		pomme.x = random.nextInt(largeur/taille);
		pomme.y = random.nextInt(hauteur/taille);
	}
	
	public boolean collision(Case case1, Case case2) {
		return case1.x == case2.x && case1.y == case2.y;
	}
	
	public void move() {
		if (collision(teteSerpent, pomme)) {
			corpsSerpent.add(new Case(pomme.x, pomme.y));
			placePomme();
		}
		
		for (int i = corpsSerpent.size()-1; i >= 0; i--) {
			Case partieSerpent = corpsSerpent.get(i);
			if (i == 0) {
				partieSerpent.x = teteSerpent.x;
				partieSerpent.y = teteSerpent.y;
			}
			else {
				Case prevPartieSerpent = corpsSerpent.get(i-1);
				partieSerpent.x = prevPartieSerpent.x;
				partieSerpent.y = prevPartieSerpent.y;
			}
		}
		
		teteSerpent.x += velocityX;
		teteSerpent.y += velocityY;
		
		for (int i = 0; i < corpsSerpent.size(); i++) {
			Case partieSerpent = corpsSerpent.get(i);
			if (collision(teteSerpent, partieSerpent)) {
				gameOver = true;
			}
		}
		
		if (teteSerpent.x * taille < 0 || teteSerpent.x * taille > largeur || 
			teteSerpent.y * taille < 0 || teteSerpent.y * taille > largeur) {
			gameOver = true;
			
		}
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		move();
		repaint();	
		if (gameOver) {
			gameLoop.stop();
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP && velocityY != 1) {
			velocityX = 0;
			velocityY = -1;
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN && velocityY != -1) {
			velocityX = 0;
			velocityY = 1;
		}
		else if (e.getKeyCode() == KeyEvent.VK_LEFT && velocityX != 1) {
			velocityX = -1;
			velocityY = 0;
		}
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT && velocityX != -1) {
			velocityX = 1;
			velocityY = 0;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}
	
}
