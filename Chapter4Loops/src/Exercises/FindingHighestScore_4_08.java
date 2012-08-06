package Exercises;

import java.util.Scanner;
public class FindingHighestScore_4_08 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double max = 1;
		String theName = "";
		System.out.println("Enter number of studnets: ");
		int x = input.nextInt();
		while(x > 0)
		{
			System.out.println("Enter Sudent's name");
			String name = input.next();
			System.out.println("Enter Student's score");
			double score = input.nextDouble();
			
			if(score > max)
			{
				max = score;
				theName = name;
			}
			x--;
		}
		System.out.println("The student: " + theName + " has the greatest score: " + max);
	}

}
