package triNombresPlus;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int A;
		int B;
		int C;
		int max = 0;
		int moy = 0;
		int min = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez un premier nombre : ");
		A = sc.nextInt();

		System.out.print("Saisissez un deuxième nombre : ");
		B = sc.nextInt();

		System.out.print("Saisissez un troisième nombre : ");
		C = sc.nextInt();

		if (A > B && B > C) {
			max = A;
			moy = B;
			min = C;
		}	
		
		else if (B > A && A > C) {
			max = B;
			moy = A;
			min = C;
		}
		
		else if (A > C && C > B) {
			max = A;
			moy = C;
			min = B;
		}
		
		else if (C > B && B > A) {
			max = C;
			moy = B;
			min = A;
		}
		
		else if (C > A && A > B) {
			max = C;
			moy = A;
			min = B;
		}
		
		/* 
		max = A;
        	if (B > max) {
            	max = B;
        	}
        	if (C > max) {
            	max = C;
        	}

       
        min = A;
        	if (B < min) {
            	min = B;
        	}
        	if (C < min) {
            min = C;
        	}

        moyen = A + B + C - max - min;
        */
		
		System.out.println(max + ", " + moy + ", " + min);
		
		sc.close();
		
	}

}
