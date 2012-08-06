package Comprehensive;

import java.util.Scanner;

public class CompoundValue_4_30 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double total = 0;
		System.out.println("Enter a sum");
		double sum = input.nextInt();
		System.out.println("Enter annual Interest rate: ");
		double annualRate = input.nextDouble();
		double interest = (annualRate / 100) / 12;
		System.out.println(interest);
		System.out.println("Enter the number of months: ");
		int months = input.nextInt();
		for(int i = 1; i<=months; i++)
		{
			total += sum * (1 + interest);
			System.out.println(total);
			sum *=  (1 + interest);
		}
		
		
	}

}
