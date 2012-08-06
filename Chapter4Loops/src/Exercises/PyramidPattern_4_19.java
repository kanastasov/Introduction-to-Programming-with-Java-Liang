package Exercises;

import java.util.Scanner;

public class PyramidPattern_4_19 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Enter number of lines");
		 int x = 8;

	        for (int i = 1; i <= x; i++) 
	        {

	            for (int j = 1; j <= x - i; j++)
	            {
	            	System.out.print("   ");
	            }
	                
	            System.out.print(1);
	            
	            for (int k = i; k >= 2; k--)
	            {
	            	
	            	System.out.print("  " + (2 * k -1)); // uncomplete
	            }   

	         
//	            for (int k = 2; k <=i; k++)
//	            {
//	            	System.out.print("  " + k);
//	            }
//	            System.out.print("  " + 1);
	                
	            System.out.println();
	        }		
	}

}
