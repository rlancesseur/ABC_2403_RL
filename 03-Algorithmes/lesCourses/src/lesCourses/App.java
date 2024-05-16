package lesCourses;

import java.util.Scanner;

public class App {

	
	  public static int getPGCD(int numerateur, int denominateur) {
   	   
   	   int pgcd=1;
   	   int a=numerateur;
   	   int b= denominateur;
   	   
   	   if (a!=0 && b!=0) {
   	      if (a < 0)
   	            a = -a;
   	        if (b < 0)
   	          b = -b;
   	        while (a!=b) {
   	        	  if (a < b)
   	            	{
   	            		 b = b-a;
   						
   					} else
   					{
   						 a = a-b;
   					}
					
				}
   	     pgcd=a;
   	   }
      
   	   return pgcd;
      }
	
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
		double X;
		double Y;
		int numX;
		int denomX;
		int denomY;
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
		
	 int diviseurCommun = getPGCD(factorielleChevauxPartants, factorielleChevauxJoues);
		numX = factorielleChevauxPartants;
		
		denomX = factorielleDiff;
				
		
		System.out.println("Dans l'ordre : " + numX + " chance sur " + denomX + " de gagner soit :"+ numX+"/"+denomX + "diviseur"+ diviseurCommun);
	//	System.out.println("Dans le désordre : une chance sur " + Y + " de gagner");
		
		sc.close();
	}
	
}
     

