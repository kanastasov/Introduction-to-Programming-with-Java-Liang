package ExerciseSections3dot1To3dot10;

import java.util.Scanner;

public class BMI_06 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter wight in pounds: ");
		double weight = input.nextDouble();
		double kilos = weight * 0.4535923;
		
		System.out.println("Enter height in inches");
		double height = input.nextDouble();
		double cms = height * 0.0254;
		double bmi = kilos / Math.pow(cms,2);
		
		System.out.println("BMI is: "  + bmi);
	}

}
