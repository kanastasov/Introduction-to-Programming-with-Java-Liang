package Exercises;

import java.util.Scanner;

public class FindingSecondHighestScore_4_09 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double max = 1;
		double score2 = 0;
		String firstName = "";
		String secondName = null;
		System.out.println("Enter number of students: ");
		int x = input.nextInt();
		while(x > 0)
		{
			System.out.println("Enter Sudent's name");
			String name = input.next();
			System.out.println("Enter Student's score");
			double score = input.nextDouble();
			
			//find max
			if(score > max)
	        {
	            score2 = max;
	            max = score;
	            secondName = firstName;
	            firstName = name;
	        }

	        //find second max
	        if(score < max && score > score2)
	        {
	            score2 = score;
	            secondName = name;
	        }
			
			
			x--;
		}
		System.out.println("The student: " + firstName + " has the greatest score: " + max);
		System.out.println("Second student " + secondName + " with second results: " + score2);

	}

}
