package Comprehensive;

import java.util.Scanner;

public class ComputingCDValue_4_31 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the sum: ");
		double sum = input.nextDouble();
		System.out.println("Enter the annual percentage: ");
		double percentage = input.nextDouble();
		System.out.println("Enter the number of months: ");
		double months = input.nextInt();
		double total = 0;
		System.out.println("Month \t CD Value");
		for(int i=1; i<= months; i++)
		{
			total = sum  + sum * percentage / 1200;			
			System.out.println( i + "\t" + total);
			sum = total;
		}
		
	}

}
