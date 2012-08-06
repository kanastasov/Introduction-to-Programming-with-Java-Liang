package Comprehensive;

public class ComputingP
{
	public static void main(String[] args) 
	{


		double numerator = 1;
		double denominator = 3;
		calculateFractions(numerator, denominator);
	}
	
	public static void calculateFractions(double numerator, double denominator)
	{
		double num = 0;
		double sumPossitive = 0;
		double counter = 99 / 2;
		while(num < counter )
		{
			
			sumPossitive += (numerator / denominator);
			System.out.println("Numerator is: " + numerator + " and denominator is: " + denominator);
			System.out.println("Number of operation: " + (num + 1) +  "  "  + numerator / denominator + "   ");
			denominator +=2;
//			numerator +=2;
			num++;
			
		}
		System.out.println("The sum of all fractions is: " + sumPossitive);
		System.out.println();
	}
}
