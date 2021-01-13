import java.util.Scanner;
/*
* @Author : jzagabe
* @Date : Jan 10, 2021
* @Description: Programme permettant de décoder des messages 
*
*/

public class TimeDecompress {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//recupérer l'entrée de l'usager et la mettre dans une variable int
		int nb=sc.nextInt(); 
		int []n=new int [nb];// tableau pour les entiers
		String []s=new String [nb]; // tableau pour les Strings
		
		sc.nextLine();  // passer à la ligne suivante
		
		//recuperer le tout
		for(int i=0;i<nb;i++)
		{
			n[i]=sc.nextInt();
			s[i]=sc.nextLine();
		}
				
		for(int i=0;i<nb;i++)
		{
			for(int j=0;j<n[i];j++)
			{
				System.out.print(s[i]);
			}
			System.out.println();
		}
		sc.close();
	}

}
