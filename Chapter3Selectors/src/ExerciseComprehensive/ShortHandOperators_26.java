package ExerciseComprehensive;

import java.util.Scanner;

public class ShortHandOperators_26 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a int");
		int x = input.nextInt();
		boolean cond1 = false;
		boolean cond2 = false;
		boolean cond3 = false;
		
		if((x % 5 == 0) && (x % 6 == 0))
		{
			cond1 = true;
		}
		
		else if((x % 5 != 0) && (x % 6 != 0))
		{
			cond2 = true;
		}
		else if(((x % 5 != 0) ^ (x % 6 != 0)))
		{
			cond3 = true;
		}
		System.out.println( "Is " +  x + " divisable by both 5 and 6 ? " + cond1);
		System.out.println("Is " +  x +  " not divisible by either 5 or 6 ? " + cond2);
		System.out.println("Is " +  x +  "divisible by 5 or 6, but not both ? " + cond3);
	}

}
