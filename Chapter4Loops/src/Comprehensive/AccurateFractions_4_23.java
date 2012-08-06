package Comprehensive;

public class AccurateFractions_4_23 
{
	public static void main(String[] args)
	{
		
		double numerator = 1;
		double denominator = 10;
		calculateFractions(numerator, denominator);
	}
	
	public static void calculateFractions(double numerator, double denominator)
	{
		double num = 0;
		double sumPossitive = 0;
		double counter = denominator -1;
		while(num < counter )
		{
			
			sumPossitive += (numerator / denominator);
			System.out.println(num + 1 +  "  "  + numerator / denominator + "   ");
			denominator--;
			num++;
			
		}
		System.out.println("The Possitive sum is: " + sumPossitive);
		System.out.println();
	}
}
