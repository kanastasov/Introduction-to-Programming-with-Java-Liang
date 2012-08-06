package ComprehensiveExersises;
import java.util.Scanner;
public class FinancialApplicationInterest_12 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter balance and annual interest rate: ");
		int balance = input.nextInt();
		double annualInterestRate = input.nextDouble();
		getInterest(balance, annualInterestRate);
	}
	public static void getInterest(int balance, double annualInterestRate)
	{
		double interest = balance * (annualInterestRate / 1200);
		System.out.println("The interest is: " + interest);
		
	}

}
