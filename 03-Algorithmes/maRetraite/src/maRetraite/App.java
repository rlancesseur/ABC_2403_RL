package maRetraite;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int age;
		int retraiteApres;
		int retraiteAvant;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez votre âge : ");
		age = sc.nextInt();
		
		retraiteApres = age - 60;
		retraiteAvant = 60 - age;
		
		if(age > 60) {
			System.out.println("Vous êtes à la retraite depuis " + retraiteApres + " années.");
		}
		
		else if(age < 60) {
			System.out.println("Il vous reste " + retraiteAvant + " années avant la retraite.");
		}
		
		else if(age == 60) {
			System.out.println("C'est le moment de prendre sa retraite.");
		}
		
		else
			System.out.println("La valeur fournie n'est pas un âge valide.");
		
		sc.close();

	}

}
