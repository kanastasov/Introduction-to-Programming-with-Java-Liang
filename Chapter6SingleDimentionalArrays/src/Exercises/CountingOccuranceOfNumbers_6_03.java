package Exercises;

import java.util.*;

public class CountingOccuranceOfNumbers_6_03 
{

	public static void main(String[] args) 
	{
		countNumbers();
	}
	
	public static void countNumbers()
	{
		Random generator = new Random();
		int[] list = new int[11];
		int[] counts = new int[10];
		int counter = 0;
		int number = 1;
		
		
		while(counter <= 10)
		{
				number = generator.nextInt(10);
				list[counter] = number;
				counter++;
		}
		
		for(int i=0; i<list.length ; i++)
		{
			counts[list[i]]++;
			
			


			System.out.print(list[i] + ", ");

		}
		

		System.out.println();
		
		for(int i=0; i<counts.length ; i++)
		{
			if(counts[i] != 0)
			{
				System.out.print("Number : " + i + "  occurs " + counts[i] + " \n");
			}
			
		}
	}

}
