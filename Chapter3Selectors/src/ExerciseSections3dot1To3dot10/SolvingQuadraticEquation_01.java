package ExerciseSections3dot1To3dot10;

import java.util.Scanner;

public class SolvingQuadraticEquation_01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
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
			double x = (-b) / 2 * a;
			System.out.println("The root is: " + x);
		}
		else
		{
			System.out.println("The equalsion has no real roots");
		}
		
	}

}
