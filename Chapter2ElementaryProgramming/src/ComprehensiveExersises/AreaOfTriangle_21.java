package ComprehensiveExersises;

import java.util.Scanner;

public class AreaOfTriangle_21 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points for the triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double side1 = Math.pow( Math.pow(x2 - x1, 2) + ( Math.pow (y2 - y1, 2)), 0.5);
		System.out.println("The distance of the two points is: " + side1);
		double side2 = Math.pow( Math.pow(x3 - x2, 2) + ( Math.pow (y3 - y2, 2)), 0.5);
		System.out.println("The distance of the two points is: " + side2);
		double side3 = Math.pow( Math.pow(x1 - x3, 2) + ( Math.pow (y1 - y3, 2)), 0.5);
		System.out.println("The distance of the two points is: " + side3);
		
		double s = (side1 + side2 + side3)/2;
		double area = Math.pow(s*(s-side1) * (s - side2) * (s - side3), 0.5);
		System.out.println(area);

		
		
		
		
		
		
		
	}

}
