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
		long factorielleChevauxPartants = 1;
		long factorielleChevauxJoues = 1;
		int difference = 1;
		long factorielleDifference = 1;
		long X;
		long Y;
		long numX;
		long denomX;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez le nombre de chevaux partants : ");
		chevauxPartants = sc.nextInt();
		System.out.print("Saisissez le nombre de chevaux joués : ");
		chevauxJoues = sc.nextInt();
		
		for (int i = 1; i <= chevauxPartants; i++)
		{
			factorielleChevauxPartants *= i;
		}
		
		for (int i = 1; i <= chevauxJoues; i++)
		{
			factorielleChevauxJoues *= i;
		}
		
		difference = chevauxPartants - chevauxJoues;
		
		for (int i = 1; i <= difference; i++)
		{
			factorielleDifference *= i;
		}
		
	    X = factorielleChevauxPartants / factorielleDifference;
		Y = factorielleChevauxPartants / (factorielleChevauxJoues * factorielleDifference);
		
		System.out.println("Dans l’ordre : une chance sur " + X + " de gagner ");
		System.out.println("Dans le desordre : une chance sur " + Y + " de gagner ");
   	 

	   /* int diviseurCommun = getPGCD(factorielleChevauxPartants, factorielleChevauxJoues);
	    
		numX = factorielleChevauxPartants;
		
		denomX = factorielleDifference;
				
		
		System.out.println("Dans l'ordre : " + numX + " chance sur " + denomX + " de gagner soit :"+ numX+"/"+denomX + " diviseur "+ diviseurCommun);
		System.out.println("Dans le désordre : une chance sur " + Y + " de gagner");
		*/
		
		sc.close();
	}
	
}
     

