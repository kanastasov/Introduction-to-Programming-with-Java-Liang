package Exercise3dot11To3dot20;

import java.util.Scanner;
public class ValidateTriangle_19 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three edges: ");
		double first = input.nextDouble();
		double second = input.nextDouble();
		double third = input.nextDouble();
		boolean canForm = false;
		
		if((first + second > third) && (first + third > second) &&  (third + second > first))
		{
			canForm = true;
		}
		else
		{
			canForm = false;
		}
		
		System.out.println("Can edges: " + first + ", " + second + ", " + third + " form a triangle?" + canForm);
	}

}
