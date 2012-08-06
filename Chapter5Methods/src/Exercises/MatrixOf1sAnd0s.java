package Exercises;

import java.util.*;

public class MatrixOf1sAnd0s 
{
	public static void main(String[] args) 
	{
		int n = 3;
		printMatrix(n);
	}
	
	public static void printMatrix(int n)
	{
		Random generator =  new Random();
		 
		 for(int i=1; i<=n; i++)
		 {
			 for(int j=1; j<=n; j++)
			 {
				 int number = generator.nextInt(2);
				 System.out.print(number + " ");

			 }
			 System.out.println();
		 }
		
	}

}
