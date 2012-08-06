package Exercises;

import java.util.Scanner;

public class ComputeChange_09 
{


	  public static void main(String[] args) 
	  {
	    // Create a Scanner
	    Scanner input = new Scanner(System.in);

	    // Receive the amount
	    System.out.print("Enter an amount in double, for example 1156: ");
	   int amount = input.nextInt();
	   
	   int cents = amount % 1000;
	   cents %= 100;
	   
	   int dollars = amount / 100;
	   
	   System.out.println(dollars + " dollars and " + cents + " cents");
	   
	   
//	   cents /= 1000;
	   


	 }
}


