
public class Fractions 
{
	public static void main(String[] args) 
	{
		double numerator = 1;
		double denominator = 3;
		calculateFractions(numerator, denominator);
	}
	
	public static void calculateFractions(double numerator, double denominator)
	{
		int num = 0;
		double sumNegative = 0;
		double sumPossitive = 0;
		while(num != 3)
		{
			sumNegative += -(numerator / denominator);
			System.out.println(-(numerator / denominator ));
			denominator += 4;
			num++;
			
		}
		System.out.println("The negative sum is: " + sumNegative);
		
		num = 0;
		denominator = 5;
		while(num != 3)
		{
			
			sumPossitive += (numerator / denominator);
			System.out.println(numerator / denominator + "   ");
			denominator += 4;
			num++;
			
		}
		System.out.println("The Possitive sum is: " + sumPossitive);
		System.out.println();
		System.out.println("Result is: "  + 4 * (1 + (sumNegative + sumPossitive)));	
	}

}
