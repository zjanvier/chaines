import java.util.Scanner;
/*
* @Author : jzagabe
* @Date : Jan 10, 2021
* @Description: Programme permettant de déterminer le gagnant dans un
* jeu de basketball en se basant sur le nombre et le type (simple,double, triple)
* de panier marqué entre deux équipes
*
*/
public class Scores
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt() * 3 + sc.nextInt() * 2 + sc.nextInt();
		int b = sc.nextInt() * 3 + sc.nextInt() * 2 + sc.nextInt();
		
		if(a > b) 
			System.out.println("A");
		else
			if(b > a) System.out.println("B");
			else
				System.out.println("N");
		sc.close();

	}

}
