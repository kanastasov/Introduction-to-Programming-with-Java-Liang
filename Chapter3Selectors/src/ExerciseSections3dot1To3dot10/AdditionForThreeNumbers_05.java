package ExerciseSections3dot1To3dot10;

import java.util.Random;
import java.util.Scanner;

public class AdditionForThreeNumbers_05 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random randomGenerator = new Random();
		int number1 = randomGenerator.nextInt(9);
		int number2 = randomGenerator.nextInt(9);
		int number3 = randomGenerator.nextInt(9);
		
		
		
		System.out.println("What is the sum of: " + number1 + " + " + number2 + " + " + number3);
		
		int sum = number1 + number2 + number3;
		int answer = input.nextInt();
		boolean isEqual = false;
		if(sum == answer)
		{
			isEqual = true;
			System.out.println("Your answer is: " + isEqual);
		}
		else
		{
			System.out.println("Your answer is: " + isEqual);
		}


	}

}
