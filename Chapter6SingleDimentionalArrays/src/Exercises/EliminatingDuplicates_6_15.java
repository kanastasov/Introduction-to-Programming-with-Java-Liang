package Exercises;

import java.util.Random;

public class EliminatingDuplicates_6_15 
{
	public static void main(String[] args) 
	{
		int[] list = new int[10];
		eliminateDuplicates(list);

	}

	public static void eliminateDuplicates(int[] list )
	{
		Random generator = new Random();
		list = new int[11];
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
		System.out.print("Dinstinct Numbers: ");
		for(int i=0; i<counts.length ; i++)
		{
			if(counts[i] != 0)
			{
				System.out.print( i + ", " );
			}
		}
	}
}
