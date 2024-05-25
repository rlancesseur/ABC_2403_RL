package intervalles2Nombres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int A;
		int B;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A = ");
		A = sc.nextInt();
		
		System.out.print("B = ");
		B = sc.nextInt();
		
		if(A > B) {
			System.out.print("Résultat = ");
			while(A != B) {
				A -= 1;
				System.out.print(A + " ");
			}
		}
		
		if (B > A) {
			System.out.print("Résultat = ");
			while(B != A) {
				A += 1;
				System.out.print(A + " ");
			}
		}
		
		sc.close();

	}

}
