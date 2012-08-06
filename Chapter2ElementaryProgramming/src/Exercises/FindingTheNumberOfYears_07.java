package Exercises;
import java.util.Scanner;
public class FindingTheNumberOfYears_07 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		
		long minutes = input.nextLong();
		getYears(minutes);
	}
	
	public static void getYears(long minutes)
	{
		long days = (minutes / 24) / 60;
		long years = days / 365;
		
		System.out.println(minutes + " minutes is approximately " + years +" years and " + (days % 365) + " days" );
		
	}

}
