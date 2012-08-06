package Exercises;

public class GreatestCommonDivisor_6_14 
{

	public static void main(String[] args) 
	{
		int number1 = 125;
		int number2 = 1025;
		int number3 = 625, number4 = 225, number5 = 815;
		System.out.println(gcd(number1, number2));
		
		System.out.println(gcd(number1, number2, number3, number4, number5));
		 
	}
	
	public static int gcd(int number1, int number2)
	{
		int n = 2;
		int temp = 0;
		int gcd = 0;
		
		// if first number is greater swap them
		if(number1 > number2)
		{
			temp = number1;
			number1 = number2;
			number2 = temp;
		}
		while(number2  > n )
		{
			if(number1 % n == 0 && number2 % n == 0 )
			{
				gcd = n;
			}
			n++;
		}
		return gcd;
	}
	
	public static int gcd(int... numbers)
	{
		int gcd = numbers[0];
		for(int i=0; i<numbers.length; i++)
		{
			gcd = gcd(gcd, numbers[i]);
		}
		
		return gcd;
		
	}

}
