package lesCourses;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int chevauxPartants;
		int chevauxJoues;
		float X;
		float Y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez le nombre de chevaux partants");
		chevauxPartants = sc.nextInt();
		System.out.println("Saisissez le nombre de chevaux joués");
		chevauxJoues = sc.nextInt();
		
		X = chevauxPartants! / (chevauxPartants - chevauxJoues)!;
		Y = chevauxPartants! / (chevauxJoues! * (chevauxPartants - chevauxJoues)!);

		System.out.println("Dans l'ordre : une chance sur " + X + " de gagner");
		System.out.println("Dans le désordre : une chance sur " + Y + " de gagner");
		
		sc.close();
	}

}
