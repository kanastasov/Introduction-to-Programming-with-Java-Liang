package Exercises;

import java.util.Random;

public class ExecutionTime_6_16 
{
	public static void main(String[] args) 
	{
		
		getTime();
	}
	
	public static void getTime()
	{
		long startTime = System.currentTimeMillis();
		
		Random generator = new Random();
		int[] list = new int[10000000];
		int key = generator.nextInt();
		
		
		for(int i=0; i<list.length; i++)
		{
			list[i] = generator.nextInt();
		}
		
		// linear search
//		for(int i=0; i<list.length; i++)
//		{
//			if(list[i] == key)
//			{
//				System.out.println("The index of the key is: " + i);
//			}
//		}
		
		System.out.println(binarySearch(list, key));
		
		
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("The execution time is: " + executionTime + " miliseconds");
	}
	
	public static int binarySearch(int[] list, int key)
	{
			
		int low = 0;
		int high = list.length -1;
		
		while(high >= low)
		{
			int mid = (low + high) / 2;
			if(key < list[mid])
			{
				high = mid -1;
			}
			else if(key == list[mid])
			{
				return mid;
			}
			else
			{
				low = mid + 1;
			}
			
		}
		return -low -1;
	}

}
