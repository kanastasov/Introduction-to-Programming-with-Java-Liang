package Examples;

import java.util.Scanner;

public class Sudoko 
{
	public static void main(String[] args) 
	{
		
		int[][] matrix = readASolution();
		System.out.println(isValid(matrix) ? " Valid solution" : "Invalid solution");
		
		
	}
	
	public static int[][] readASolution()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sudoko puzzle solution: ");
		int[][] matrix = new int[9][9];
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				matrix[i][j] = input.nextInt();
			}
		}
		return matrix;
		
	}
	
	public static boolean isList(int[] list)
	{
		int[] temp = new int[list.length];
		System.arraycopy(list, 0, temp, 0, list.length);
		
		java.util.Arrays.sort(temp);
		
		
		for(int i=0; i<9; i++)
		{
			if(temp[i] != i+1)
			{
				return false;
			}
		}
		
		return true;
	}
	
	
	public static boolean isValid(int[][] matrix)
	{
		//check each row
		for(int i=0; i<9; i++)
		{
			if(!isList(matrix[i]))
			{
				return false;
			}
		}
		
		// check collums
		for(int j=0; j<9; j++)
		{
			int[] columm = new int[9];
			for(int i=0; i<9; i++)
			{
				columm[i] = matrix[i][j];
			}
			if(!isList(columm))
			{
				return false;
			}
		}
		
		
		//check sells
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				// stating element in the 3x3 box
				int k=0;
				
				int[] list = new int[9];
				
				for(int row= i*3; row<i*3 + 3; row++)
				{
					for(int col = j*3; col < j*3 + 3; col++)
					{
						list[k++] = matrix[row][col];
					}
				}
				
				if(!isList(list))
				{
					return false;
				}
			}
		}
		return true;
	}
}
