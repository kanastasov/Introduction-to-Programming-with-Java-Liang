package Exercise3dot11To3dot20;

import java.util.Scanner;

public class NumberOfDaysInMonth_11 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; 
		System.out.println("Enter a month with 1-12");
		int month = input.nextInt();
		System.out.println("Enter a year");
		int year = input.nextInt();
		
		if((month < 1) || (month > 12))
		{
			System.out.println("Invalid data for months: must be between 1 and 12");
			System.exit(0);
		}
		
		// check if the year is leap
		if(((year % 4 == 0  ) && (year % 100 != 0)) || year % 400 == 0)
		{
			System.out.println("The " + year + " year is a leap year");
			if((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12))
			{
				System.out.println("Month " + month + " " +  year + " has 31 days");
			}
			else if (month == 2)
			{
				System.out.println("Month " + month + " " +  year + " has 29 days");
			}
			else
			{
				System.out.println("Month " + month + " " +  year + " has 30 days");
			}
		
		}
		else
		{
			System.out.println("The " + year + " year is NOT a leap year");
			if((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12))
			{
				System.out.println("Month " + month + " " +  year + " has 31 days");
			}
			else if (month == 2)
			{
				System.out.println("Month " + month + " " +  year + " has 28 days");
			}
			else
			{
				System.out.println("Month " + month + " " +  year + " has 30 days");
			}
			
		}
		
		
		
	}

}
