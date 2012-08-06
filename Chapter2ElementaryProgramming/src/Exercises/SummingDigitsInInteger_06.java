package Exercises;
import java.util.Scanner;

public class SummingDigitsInInteger_06 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a digit between 0 and 1000");
		int digit = input.nextInt();
		extract(digit);
	}
	public static void extract(int digit)
	{
		int sum = 0;
		while(digit != 0)
		{
			sum += digit % 10;
			digit /= 10;
		}
		System.out.println(sum);
		
	}

}
