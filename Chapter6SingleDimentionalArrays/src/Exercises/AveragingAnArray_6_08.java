package Exercises;

import java.util.*;
public class AveragingAnArray_6_08 
{

	public static void main(String[] args) 
	{
		int[]list = new int[10];
		System.out.println("The average for the int array is: " + average(list));
		double[] myList = new double[10];
		System.out.println("The average for the double array is: " + average(myList));
		
	}
	
	public static int average(int[] list)
	{
		Random generator = new Random();
		int average = 0;
		int sum =0;
		list = new int[10];
		for(int i=0; i<list.length; i++)
		{
			list[i] = generator.nextInt(10);
//			System.out.println(list[i] + " ");
			sum += list[i];
		}
		average = sum / list.length;
		return average;
	}
	
	public static double average(double[] list)
	{
		Random generator = new Random();
		double average = 0;
		double sum =0;
		list = new double[10];
		for(int i=0; i<list.length; i++)
		{
			list[i] = generator.nextDouble() * 10;
//			System.out.println(list[i] + " ");
			sum += list[i];
		}
		average = sum / list.length;
		return average;
	}

}
