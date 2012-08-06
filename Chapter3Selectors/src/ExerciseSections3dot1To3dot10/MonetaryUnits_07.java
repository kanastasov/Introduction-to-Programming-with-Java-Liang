package ExerciseSections3dot1To3dot10;

import java.util.Scanner;

public class MonetaryUnits_07 
{
	public static void main(String[] args) 
	{
		
	    Scanner input = new Scanner(System.in);

	    // Receive the amount
	    System.out.print("Enter an amount in double, for example 11.56: ");
	   double amount = input.nextDouble();
	   
	   
	   
	   int dollars =(int)(amount * 100) / 100;
	   int cents = (int)(amount * 100) % 100;
	   cents %= 100;
	   if(dollars == 1 && cents == 1)
	   {
		   System.out.println(dollars + " dollar " + cents + " cent");
	   }
	   else
	   {
		   System.out.println(dollars + " dollars and " + cents + " cents");
	   }
	}

}
