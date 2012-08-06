package ExerciseSections3dot1To3dot10;

import java.util.Random;
import java.util.Scanner;

public class LearningAddition_04 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random randomGenerator = new Random();
		int number1 = randomGenerator.nextInt(100);
		int number2 = randomGenerator.nextInt(100);
		System.out.println("What is the sum of: " + number1 + " + " + number2);
		int sum = number1 + number2;
		int answer = input.nextInt();
		boolean isEqual = false;
		if(sum == answer)
		{
			isEqual = true;
			System.out.println("Is " + sum + " equal to " + answer + " ? " + isEqual);
		}
		else
		{
			System.out.println("Is " + sum + " equal to " + answer + " ? " + isEqual);
		}
		
		
//		System.out.println(number1 + "  " + number2);
	}

}
