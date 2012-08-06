package Exercises;

public class SummingTheDigitsInInteger_5_02 
{
	public static void main(String[] args) 
	{
		long n = 234;
		System.out.println(sumDigits(n));
	}
	
	public static int sumDigits(long n)
	{
		
		int sum = 0;
		while(n > 0)
		{
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

}
