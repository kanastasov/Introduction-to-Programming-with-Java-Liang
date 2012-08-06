package ExerciseComprehensive;

import java.util.Scanner;
public class PointInARectangle_23 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double distance1 = 10 / 2;
		double distance2 = 5 / 2;
		
		if((x <= distance1 ) && (y <= distance2))
		{
			System.out.println("Points " + x + " and " + y + " are in the rectangle: ");
		}
		else
		{
			System.out.println("Points"  + x + " and " + y + " are  NOT in the rectangle: ");
		}
		
		
	}

}
