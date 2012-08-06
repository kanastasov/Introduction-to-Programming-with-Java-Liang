package Exercises;

import java.util.Scanner;

public class QuadraticEquation_6_25
{
	public static void main(String[] args) 
	{
		
		
	}
	
	public static double solveQuadratic(double[] eqn, double[] roots)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double x = 0;
		double discriminant = (b * b) - (4 * a * c);
		System.out.println("The discriminant is: " + discriminant +  " and ");
		
		
		if(discriminant > 0)
		{
			double root1 =(-b  + Math.pow((b * b) - (4 * a * c) , 0.5) ) / (2 * a);
			double root2 =(-b  - Math.pow((b * b) - (4 * a * c) , 0.5) ) / (2 * a);
			System.out.println("The roots are: " + root1 + " and " + root2);
		}
		else if(discriminant == 0)
		{
			 x = (-b) / 2 * a;
			System.out.println("The root is: " + x);
		}
		else
		{
			System.out.println("The equalsion has no real roots");
		}
		return x;
	}


}
