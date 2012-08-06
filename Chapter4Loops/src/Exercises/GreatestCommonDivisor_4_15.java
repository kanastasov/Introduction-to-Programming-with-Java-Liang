package Exercises;

import java.util.Scanner;

public class GreatestCommonDivisor_4_15 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first possitive integer: ");
		int n1 = input.nextInt();
		System.out.println("Enter second possitive integer: ");
		int n2 = input.nextInt();
		
		if(n1 < n2)
		{
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		int d = n1 - n2;
		
		while(d > 2)
		{
			if(n1 % d == 0 && n2 % d == 0)
			{
				System.out.println("The greatest common divisor of " + n1 + " " + n2 + " is " + d);
				break;
			}
			d--;
		}
	}

}
