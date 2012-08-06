package Exercise3dot11To3dot20;

import java.util.Scanner;

public class CheckingANumber_12 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a int");
		int x = input.nextInt();
		
		if((x % 5 == 0) && (x % 6 == 0))
		{
			System.out.println(x + " is divisable by both 5 and 6");
		}
		else if((x % 5 != 0) && (x % 6 != 0))
		{
			System.out.println(x + " is not divisible by either 5 or 6");
		}
		else
		{
			System.out.println(x + " is divisible by 5 or 6, but not both");
		}
	}

}
