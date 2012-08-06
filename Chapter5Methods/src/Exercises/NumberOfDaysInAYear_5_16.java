package Exercises;

public class NumberOfDaysInAYear_5_16 
{

	public static void main(String[] args)
	{
		for(int year = 2000; year <=2100; year++)
		{
			System.out.println(year + "\t\t" + numberOfDaysInYear(year));
		}
		
	}

	public static int numberOfDaysInYear(int year)
	{
		
		    boolean isLeapYear = 
		      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//		    System.out.println(year + " is a leap year? " + isLeapYear);
		    if(isLeapYear)
		    {
		    	return 366;
		    }
		    return 365;
	}
}
