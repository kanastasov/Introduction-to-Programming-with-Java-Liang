package Exercises;
import java.util.Scanner;
public class FinancialApplication_05 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and the gratuity rate: ");
		
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		financial(subtotal, gratuity);
	}

	public static void financial(double subtotal, double gratuity)
	{
		gratuity = subtotal * 0.15;
		double total = subtotal + gratuity;
		System.out.println("The gratuity is: " + gratuity + " and the total is: " + total);
		
		
	}
}
