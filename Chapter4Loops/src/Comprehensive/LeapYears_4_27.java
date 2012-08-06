package Comprehensive;

public class LeapYears_4_27 
{

	public static void main(String[] args) 
	{
		
	    int count = 0;
		for(int year = 2001; year <=2100; year++)
		{
		    boolean isLeapYear = 
		      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		    System.out.println(year + " is a leap year? " + isLeapYear);
		    count++;
		    if(count % 10 == 0)
		    {
		    	System.out.println();
		    }
		}
	    
	    
	}

}
