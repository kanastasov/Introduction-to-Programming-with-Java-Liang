package CaseSudy;

import java.util.Scanner;

public class GreatestCommonDivisor 
{
	public static void main(String[] args) 
	{
		int gcd = 1; // initialize the gcd
		int k = 2; // Possible gcd
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number1: ");
		int number1 = input.nextInt();
		System.out.println("Enter Number2: ");
		int number2 = input.nextInt();
		
		while(k <= number1 && k<= number2)
		{
			if(number1 % k == 0 && number2 % k == 0)
			{
				gcd = k;
			
			}
			k++;
		}
		System.out.println("The greatest common divisor of " + number1 + ", and " + number2 + " is " + gcd);
		
	}

}
