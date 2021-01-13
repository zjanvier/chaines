import java.util.Scanner;

/*
* @Author : jzagabe
* @Date : Jan 10, 2021
* @Description: Programme permettant de comparer l'occupation
* d'un parking sur deux jours consécutifs
*
*/

public class Parking
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int nb = sc.nextInt();
		sc.nextLine();
		String hier = sc.nextLine();
		String actuel = sc.nextLine();
		
		
		int compte = 0; 
		
		for (int i = 0; i < nb; i++) 
		{	
			if (hier.charAt(i) == actuel.charAt(i) && actuel.charAt(i) == 'C') {
				compte++;
			}		
				
		}
		
		System.out.println(compte);
		sc.close();

	}

}
