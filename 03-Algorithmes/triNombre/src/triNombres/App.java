package triNombres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int A;
		int B;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez un nombre : ");
		A = sc.nextInt();
		
		System.out.print("Saisissez un nombre : ");
		B = sc.nextInt();
		
		if (A < B) {
			System.out.println(A + " " + B);
		}
		
		else
			System.out.println(B + " " + A);

		sc.close();
		
	}

}
