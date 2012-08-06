package Exersices;

import java.util.Random;

public class LocatingLargestElementInMatrix_7_13 
{
	public static void main(String[] args) 
	{
		double[][] matrix = new double[4][4];
		System.out.println(locateLargest(matrix));
		
	}
	
	public static double[] locateLargest(double[][] m)
	{
		Random generator = new Random();
		double[] max = null; 
		for(int i=0; i<m.length; i++)
		{
			max = m[i] ;
			for(int j=0; j<m[i].length; j++)
			{
				m[i][j] = generator.nextDouble();
				
				if(m[i][j] > max[i])
				{
					max[i] = m[i][j];
				}
				return max;
			}
			
		}
		return max;
		
		
	}

}
