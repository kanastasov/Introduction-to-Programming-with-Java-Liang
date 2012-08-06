package Exersices;

import java.util.Random;

public class AddingMatrices_7_05 
{

	public static void main(String[] args) 
	{
		double[][] matrix1= new double[3][3];
		double[][] matrix2 = new double[3][3];
		addMatrices(matrix1, matrix2);
	}

	public static double[][] addMatrices(double[][] matrix1, double[][] matrix2)
	{
		Random generator = new Random();
		double[][] store = new double[matrix1.length][matrix1.length];
		for(int i=0; i<matrix1.length; i++)
		{
			for(int j=0; j<matrix1[i].length; j++)
			{
				matrix1[i][j] = generator.nextInt(10);
				matrix2[i][j] = generator.nextInt(10);
				store[i][j] = matrix1[i][j] + matrix2[i][j];
				
				System.out.print(matrix1[i][j] + "\t+ \t " + matrix2[i][j] + "\t= \t" + store[i][j]+ "\n");
			}
			System.out.println();
		}
		return store;
	}
}
