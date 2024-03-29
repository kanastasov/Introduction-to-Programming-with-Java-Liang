package ComprehensiveExersises;

import java.util.Scanner;

public class CurrentTime_25 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time zone offset to GMT: ");
		int timezone = input.nextInt();
		
		// Obtain the total milliseconds since midnight, Jan 1, 1970
	    long totalMilliseconds = System.currentTimeMillis();

	    // Obtain the total seconds since midnight, Jan 1, 1970
	    long totalSeconds = totalMilliseconds / 1000;

	    // Compute the current second in the minute in the hour
	    long currentSecond = (int)(totalSeconds % 60);

	    // Obtain the total minutes
	    long totalMinutes = totalSeconds / 60;

	    // Compute the current minute in the hour
	    long currentMinute = (int)(totalMinutes % 60);

	    // Obtain the total hours
	    long totalHours = totalMinutes / 60;

	    // Compute the current hour
	    long currentHour = (int)(totalHours % 24);

	    // Display results
	    System.out.println("Current time is " + (currentHour + timezone) + ":"
	      + currentMinute + ":" + currentSecond + " GMT");
	}

}
