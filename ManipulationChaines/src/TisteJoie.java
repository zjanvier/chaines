import java.util.Scanner;
/*
* @Author : jzagabe
* @Date : Jan 10, 2021
* @Description: Programme permettant de lire les suites de caractères
* exprimant soit la joie, soit la tristesse dans un message donné
*
*/
public class TisteJoie
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		
		char []arr=s.toCharArray();
		int happy=0;
		int sad=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]==':')&&(arr[i+1]=='-'))
			{
				if(arr[i+2]==')')
						happy++;
				else
					if(arr[i+2]=='(')
						sad++;
			}
		}
		if((sad==0)&&(happy==0))
			System.out.println("Aucune");
		else
			if(happy>sad)
				System.out.println("Joyeuse");
			else
				if(sad>happy)
					System.out.println("Triste");
				else
						System.out.println("Incertaine");
		
		sc.close();
	}

}
