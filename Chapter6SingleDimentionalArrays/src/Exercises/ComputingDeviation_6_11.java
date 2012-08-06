package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ComputingDeviation_6_11 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		
		double[] list = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};
		
		System.out.println("The mean is: " + (int)(mean(list ) * 100) / 100.0);
		System.out.println("The deviation is: " + (int)(deviation(list) * 100000) / 100000.0);
		
	}
	
	public static double mean(double[] list)
	{
		double sum = 0;
//		list = new double[10];
		for(int i=0; i<list.length; i++)
		{
			sum += list[i];
		}
		int n = list.length;
		double mean = sum / n;
		return mean;
		
	}
	
	public static double deviation(double[] list)
	{
		double sum = 0;
//		list = new double[10];
		int n = list.length;
		
		for(int i=0; i<list.length; i++)
		{
			sum += Math.pow(list[i] - (mean(list)), 2);
		}
		double deviation =  Math.sqrt((sum) /(n - 1)  );
		return deviation;
	}

}
