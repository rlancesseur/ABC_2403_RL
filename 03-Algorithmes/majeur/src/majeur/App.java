package majeur;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez votre âge : ");
		age = sc.nextInt();
		
		if (age < 0) {
			System.out.println("Vous n'êtes pas encore né.");
		}
		
		else if (age >= 0 && age < 18) {
			System.out.println("Vous êtes mineur.");
		}
		
		else 
			System.out.println("Vous êtes majeur.");
		
		sc.close();		
		

	}

}
