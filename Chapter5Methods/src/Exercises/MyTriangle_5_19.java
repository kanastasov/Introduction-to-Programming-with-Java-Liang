package Exercises;

import java.util.*;

public class MyTriangle_5_19 
{
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three sides for triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		if(isValid(side1,side2,side3))
		{
			System.out.println("The P is: " + getArea(side1, side2, side3));
		}
		else
		{
			System.out.println("The three sides can't form a triangle: ");
		}
		

	}

	public static boolean isValid(double side1, double side2, double side3)
	{
		boolean canForm = false;
		
		if((side1 + side2 > side3) && (side1 + side3 > side2) &&  (side3 + side2 > side1))
		{
			return canForm = true;
		}
		return canForm = false;
	}
	
	public static double getArea(double side1, double side2, double side3)
	{
		double S = (side1 + side2 +side3) / 2;
		double P = Math.sqrt(S * (S - side1) * (S - side2) * (S - side3));
		return P;
				
	}
}
