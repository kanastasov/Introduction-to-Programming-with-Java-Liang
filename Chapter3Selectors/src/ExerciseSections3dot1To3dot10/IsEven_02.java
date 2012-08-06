package ExerciseSections3dot1To3dot10;

import java.util.Scanner;

public class IsEven_02 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int x = input.nextInt();
		boolean check = false;;
		if(x % 2 == 0)
		{
			check = true;
			System.out.println("Is " + x + " an even number: ? " + check);
		}
		else
		{
			System.out.println("Is " + x + " an even number: ? " + check);
		}
		
	}

}
