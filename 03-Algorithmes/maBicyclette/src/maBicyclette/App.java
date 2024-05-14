package maBicyclette;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		boolean beauTemps;
		boolean veloOk;
		boolean reparationsImmediates;
		boolean livrePossede;
		boolean livreDispoBibliotheque;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Répondre par true ou false");
		System.out.println("Est-ce qu'il fait beau ?");
		beauTemps = sc.nextBoolean();
		
		if(beauTemps == true) {
			System.out.println("Je vais me balader");
			
			System.out.println("Est-ce que le vélo est en bon état ?");
			veloOk = sc.nextBoolean();
				
				if(veloOk == true) {
					System.out.println("J'irai me ballader à bicyclette");
				}
				else {
					System.out.println("Je vais chez le garagiste");
					
					System.out.println("Est-ce que le garagiste peut réparer le vélo immédiatement ?");
					reparationsImmediates = sc.nextBoolean();
						
						if (reparationsImmediates == true) {
							System.out.println("J'irai me ballader à bicyclette");
						}
						else {
							System.out.println("J'irai cueillir des joncs");
						}
				}
		}
		
		else {
			System.out.println("Je vais lire un livre");
			
			System.out.println("Est ce que je possède GoT ?");
			livrePossede = sc.nextBoolean();
			
				if(livrePossede == false) {
					System.out.println("Je vais à la bibliothèque");
				
					System.out.println("Est-ce qu'il y a GoT à la bibliothèque ?");
					livreDispoBibliotheque = sc.nextBoolean();
					
					if(livreDispoBibliotheque == true) {
						System.out.println("J'emprunte GoT");
					}
						else {
							System.out.println("J'emprunte un roman policier");
						}
				
				
				System.out.println("Je rentre chez moi");
				
				}
				else {
					System.out.println("Je lis GoT");
				}
				
				System.out.println("Lecture de mon livre dans le fauteuil");
		}
		
		 sc.close();
		
	}

}
