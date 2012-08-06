package Exersices;

import java.util.Scanner;

public class SummingMajorDiagonalOfMatrix_7_02 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int[][] matrix = new int[4][4];
		System.out.println("Enter a 4 by 4 matrix row by row: ");
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[i].length; j++)
			{
				matrix[i][j] = input.nextInt();
				
			}
		}
		
		System.out.println("The diagonal sum is: " + sumMajarDiagonal(matrix));

	}

	public static int sumMajarDiagonal(int[][] matrix)
	{
		int sum =0;
		
		for(int i=0; i<matrix.length; i++)
		{
			sum += matrix[i][i];
		}
		
		return sum;
	}
}
