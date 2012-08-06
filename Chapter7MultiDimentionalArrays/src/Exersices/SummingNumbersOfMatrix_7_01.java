package Exersices;

import java.util.Scanner;

public class SummingNumbersOfMatrix_7_01 
{
	public static void main(String[] args) 
	{
		int[][] matrix = new int[4][4];
		System.out.println(sumMatrix(matrix));
		
	}

	public static double sumMatrix(int[][]m)
	{
		Scanner input = new Scanner(System.in);
		
		double sum = 0;
		
		System.out.println("Enter a 4 by 4 matrix row by row");
		for(int i=0; i<m.length; i++)
		{
			for(int j=0; j<m[i].length; j++)
			{
				m[i][j] = input.nextInt();
				sum += m[i][j];	
			}
		}
		return sum;
//		System.out.println("Sum of the matrix is: " + sum);
	}
}
