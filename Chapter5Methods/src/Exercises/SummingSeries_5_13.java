package Exercises;

public class SummingSeries_5_13 
{
	public static void main(String[] args) 
	{
		
		double numerator = 1;
		double denominator = 2;
		calculateFractions(numerator, denominator);
	}
	
	public static void calculateFractions(double numerator, double denominator)
	{
		double num = 1;
		double sumPossitive = 0;
		double counter = 20;
		System.out.println("1 \t\t m(1) \n");
		while(num <= counter )
		{
			
			sumPossitive += (numerator / denominator);
			System.out.println(num + " \t\t" + sumPossitive);
			denominator ++;
			numerator ++;
			num++;
			
		}
	}
}
