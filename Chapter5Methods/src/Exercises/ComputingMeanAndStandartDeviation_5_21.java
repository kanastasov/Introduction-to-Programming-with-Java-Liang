package Exercises;

import java.util.*;

public class ComputingMeanAndStandartDeviation_5_21 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double[] readData = {1,2,3,4.5,5.6,6,7,8,9,10};
		
		
		double sum = 0, sum2 = 0;
		double number = 1;
		double n = 0;
		System.out.println("Enter ten numbers: ");
		
		for(int i=0; i<readData.length  ; i++)
		{
			sum += readData[i];
			sum2 += Math.pow(readData[i], 2);
			n++;
		}
		
		System.out.println("Sum 2 is: " + sum2);
		double deviation = Math.sqrt(((sum2 - (Math.pow(sum,2) / n ))) /( n -1)  );
		System.out.println(sum + "   " + number + " " + n);
		double mean = sum / n;
		System.out.println("The mean is: " + mean);
		System.out.println("The standart deviation is:%2f " +deviation );
		
		
		
	}

}
