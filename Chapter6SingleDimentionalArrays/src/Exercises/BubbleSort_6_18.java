package Exercises;

import java.util.*;

public class BubbleSort_6_18 
{
	public static void main(String[] args) 
	{
		Random generator = new Random();
		
		int[] list = new int[11];
		for(int i=0; i<list.length; i++)
		{
			list[i] = generator.nextInt(10);
		}
		
		System.out.println("Original Random array: ");
		printArray(list);
		
		bubbleSort(list);
		
		System.out.println("\nAfter bubble sort: ");
		printArray(list);
	}

	public static void bubbleSort(int[] list)
	{
		for(int i=0; i<list.length; i++)
		{
			for(int j=i + 1; j<list.length ; j++)
			{
				if(list[i] > list[j])
				{
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
				
			}
			
		}
	}
	
	public static void printArray(int[] list)
	{
		for(int i=0; i<list.length; i++)
		{
			System.out.print(list[i] + ", ");
		}
	}
}
