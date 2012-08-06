package Exercises;

import java.util.Random;

public class IndexOfSmallestElement_6_10 
{

	public static void main(String[] args) 
	{

		double[] list = new double[10];
		System.out.println("The possition of the  minimum number is:  " + min(list));
	}
	
	public static int min(double[] list)
	{
		Random generator = new Random();
		
		list = new double[10];
		double min = 10;
		int index = 0;
		for(int i=0; i<list.length; i++)
		{
			list[i] = generator.nextDouble() * 10;
			if(min > list[i])
			{
				//swap the value of min with the current list[i]
				min = list[i];
				index = i;
			}
			System.out.println(list[i] +  " ");
			
		}
		return  index;
	}


}
