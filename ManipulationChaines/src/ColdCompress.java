import java.util.Scanner;
/*
* Author : jzagabe
* Date : Jan 10, 2021
* Description: Programme permettant déchiffrer les séquences de symboles 
* consécutifs contenus dans des messages
*
*/

public class ColdCompress {

public static void main(String[] args) {
		
		int compteur = -1; 
		
		Scanner sc = new Scanner(System.in);
		int nb = sc.nextInt(); // nombre de lignes
		sc.nextLine();
		// créer un tableau pour contenir toutes les lignes
		String[] myString = new String[nb]; 
		
		// insérer les valeurs (une ligne à la fois) dans la tableau
		for (int i = 0; i < nb; i++) 
		{
			myString[i] = sc.nextLine();
		}
	
		

		for (int i = 0; i < nb; i++) 
		{	
			for (int j = 0; j < myString[i].length(); j++) 
			{
				
				if (j < (myString[i].length() - 1)) // on n'est pas à la fin de la ligne
				{
					if (myString[i].charAt(j) != myString[i].charAt(j+1)) 
					{
						System.out.print(j - compteur + " " + myString[i].charAt(j) + " ");
						compteur = j;	// mettre à jour le compteur
					}			
				} else {
					// on est à la fin de la ligne
					System.out.print(j - compteur + " " + myString[i].charAt(j));				
				}
				
			}
			System.out.println();
			compteur = -1; //remettre à -1 avant de commencer la ligne qui suit;
		}
		
		
		sc.close();
	}

}
