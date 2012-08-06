package Exercises;

import java.util.*;

public class SmallestElement_6_09 
{

	public static void main(String[] args) 
	{
		double[] list = new double[10];
		System.out.println("The minimum number is:  " + min(list));
	}
	
	public static double min(double[] list)
	{
		Random generator = new Random();
		
		list = new double[10];
		double min = 10;
		for(int i=0; i<list.length; i++)
		{
			list[i] = generator.nextDouble() * 10;
			if(min > list[i])
			{
				//swap the value of min with the current list[i]
				min = list[i];
			}
			System.out.println(list[i] +  " ");
			
		}
		return min;
	}

}
