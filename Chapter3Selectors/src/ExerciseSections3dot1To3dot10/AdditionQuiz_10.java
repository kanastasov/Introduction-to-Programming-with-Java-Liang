package ExerciseSections3dot1To3dot10;

import java.util.Scanner;

public class AdditionQuiz_10 
{
	public static void main(String[] args) 
	{
		
		 // 1. Generate two random single-digit integers
	    int number1 = (int)(Math.random() * 10);
	    int number2 = (int)(Math.random() * 10);

	  

	    System.out.print
	      ("What is " + number1 + " + " + number2 + "? ");
	    Scanner input = new Scanner(System.in);
	    int answer = input.nextInt();

	    // 4. Grade the answer and display the result
	    if (number1 + number2 == answer)
	      System.out.println("You are correct!");
	    else
	      System.out.println("Your answer is wrong.\n" + number1 + " + "
	        + number2 + " should be " + (number1 + number2)); 
	  }
		
	

}
