package ComprehensiveExersises;

import java.util.Scanner;

public class DistanceOfTwoPoints_20 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double total = Math.pow( Math.pow(x2 - x1, 2) + ( Math.pow (y2 - y1, 2)), 0.5);
		System.out.println("The distance of the two points is: " + total);
	}

}
