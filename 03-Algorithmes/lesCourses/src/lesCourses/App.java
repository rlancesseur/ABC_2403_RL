package lesCourses;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int chevauxPartants;
		int chevauxJoues;
		int i = 1;
		int factorielleChevauxPartants = 1;
		int i2 = 1;
		int factorielleChevauxJoues = 1;
		int i3 = 1;
		int diff = 1;
		int factorielleDiff = 1;
		float X;
		float Y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez le nombre de chevaux partants : ");
		chevauxPartants = sc.nextInt();
		System.out.print("Saisissez le nombre de chevaux joués : ");
		chevauxJoues = sc.nextInt();
		
		while (i <= chevauxPartants)
		{
			factorielleChevauxPartants *= i;
			i++;
		}
		
		while (i2 <= chevauxJoues)
		{
			factorielleChevauxJoues *= i2;
			i2++;
		}
		
		diff = chevauxPartants - chevauxJoues;
		
		while (i3 <= diff)
		{
			factorielleDiff *= i3;
			i3++;
		}
		
		X = factorielleChevauxPartants / factorielleDiff;
		
		Y = factorielleChevauxPartants / (factorielleChevauxJoues * factorielleDiff);
				
		System.out.println("Dans l'ordre : une chance sur " + X + " de gagner");
		System.out.println("Dans le désordre : une chance sur " + Y + " de gagner");
		
		sc.close();
	}

}
