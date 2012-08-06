package Exercises;
import java.util.*;
public class Location_8_13
{
	
	public static String locateLargest(double[][] a)
	{
		Location_8_13 loc = new Location_8_13();
		Random generator = new Random();
		double maxValue = 0;
		String pos = "";
		a = new double[3][4];
		for(int i=0; i<a.length; i++)
		{
			int index = 0;
			for(int j=0; j<a[i].length; j++)
			{
				
				a[i][j] = generator.nextDouble() * 10;
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			int index = 0;
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
				if(maxValue < a[i][j])
				{
					maxValue = a[i][j];
					pos = i + "," + j;
					
				}
				
				
			}
			System.out.println();
		}
		return maxValue + " : " + pos ;
//		System.out.println("Max is: " + maxValue);
	}
	
}
