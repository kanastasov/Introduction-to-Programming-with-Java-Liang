package Exercises;

import java.util.*;
public class CountingSingleDigits_6_07 
{

	public static void main(String[] args) 
	{

		countDigits();
	}

	public static void countDigits()
	{
		Random generator = new Random();
		int[] list = new int[101];
		int[] counts = new int[10];
		
		for(int i=1; i<=100; i++)
		{
			list[i] = generator.nextInt(10);
			counts[list[i]]++;
			
			if(i % 10 == 0)
			{
				System.out.println(list[i]);
			}
			else
			{
				System.out.print(list[i] + " ");
			}
		}
		System.out.println();
		for(int i=0; i<counts.length; i++)
		{
			System.out.println("number " + i + " occurs " + counts[i]);
		}
		
	}
}
