package Exercises;

import java.util.Scanner;

public class FactorsOfIntegers_4_16 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the factor");
		int fact = input.nextInt();
		
		for(int i=2; i<10; i++)
		{
			if(fact % i == 0)
			{
				fact /= i;
				System.out.print(i + ", ");
				i--;
			}
		}
		
	}

}
