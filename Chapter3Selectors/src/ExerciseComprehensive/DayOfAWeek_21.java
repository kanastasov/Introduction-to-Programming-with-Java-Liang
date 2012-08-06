package ExerciseComprehensive;

import java.util.Scanner;

public class DayOfAWeek_21 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String[] h = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		
		System.out.println("Enter year: (e.g. 2012): ");
		int year = input.nextInt();
		System.out.println("Enter month: 1 - 12: ");
		int month = input.nextInt(14);
		int m = month;
		if(m == 1 ) 
		{
			m = 13;
			--year;
		}
		else if(m == 2)
		{
			m = 14;
			--year;
		}
		int k = year % 7;// year of the century
		System.out.println("k is: " + k);
		int j = year / 100; // century
		System.out.println("Enter the day of the month: 1-31: ");
		int dayOfMonth = input.nextInt();
		int q = dayOfMonth;
		
		int test = (q + ((26*(m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
		
		int proba = 124 % 7;
		System.out.println("proba is:" + proba);
		
		
		System.out.println("Day of the week is " + h[test]);
		
		
		
		
	}

}
