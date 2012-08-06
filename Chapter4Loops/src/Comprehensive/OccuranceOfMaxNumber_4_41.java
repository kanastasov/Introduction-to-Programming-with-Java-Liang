package Comprehensive;

import java.util.Scanner;

public class OccuranceOfMaxNumber_4_41 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int number = 1;
		int max = 0;
		int count = 1;
		System.out.println("Enter numbers: ");
		while(number != 0)
		{
			number = input.nextInt();
			if(number > max)
			{
				max = number;
				count = 0;
			}
			if(number == max)
			{
				count++;
			}
		}
		
		System.out.println("The largest number is: " + max);
		System.out.println("The occurance count of the largest number is: " + count);
	}

}
