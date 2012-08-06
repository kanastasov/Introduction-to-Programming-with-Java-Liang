package ComprehensiveExersises;

import java.util.Scanner;

public class FinancialApplicationFutureInvestment_13 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amount: ");
		int investmentAmount = input.nextInt();
		System.out.println("Enter monthly interest rate: ");
		double monthlyInterestRate = input.nextDouble();
		System.out.println("Enter number of years");
		int numOfYears = input.nextInt();
		
		double futureInvestmentValue = investmentAmount * (Math.pow(1 + monthlyInterestRate / 100, numOfYears * 12));
		System.out.println("Accumulated value is: " + futureInvestmentValue);
		
		double test = Math.pow(1 + monthlyInterestRate, numOfYears * 12);
		System.out.println(test);
		
	}

}
