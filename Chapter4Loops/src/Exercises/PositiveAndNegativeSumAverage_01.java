package Exercises;

import java.util.Scanner;

public class PositiveAndNegativeSumAverage_01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int possitiveCounter = 0 , negativeCounter = 0, totalCounter = 0, number=1;
		int possitiveSum = 0, negativeSum = 0;
		
		System.out.println("Enter an int value, the program exits if the input is 0: ");
		while(number != 0)
		{
			number = input.nextInt();
			
			if(number >= 1)
			{
				possitiveCounter++;
				possitiveSum += number;
			}
			else if(number < 0)
			{
				negativeCounter ++;
				negativeSum += number;
			}
		}
		totalCounter = possitiveCounter + negativeCounter;
		float sum = possitiveSum + negativeSum;
		System.out.println("The number of positives is: " + possitiveCounter);
		System.out.println("The number of negatives is: " + negativeCounter);
		System.out.println("The total is: " + (totalCounter + 1));
		System.out.println("The average is: " + sum / totalCounter);
		
		
	}

}
