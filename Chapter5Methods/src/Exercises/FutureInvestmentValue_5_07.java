package Exercises;

import java.util.Scanner;

public class FutureInvestmentValue_5_07 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter investment amount: ");
		int investmentAmount = input.nextInt();
		
		System.out.println("Enter yearly interest rate: ");
		double yearlyInterestRate = input.nextDouble();
		
		System.out.println("Years \t Future Value");
//		int numOfYears = input.nextInt();
		
		for(int numOfYears=1; numOfYears <=30; numOfYears++)
		{
			System.out.println(numOfYears + " \t  " + futureInvestmentValue(investmentAmount, yearlyInterestRate, numOfYears));
					
		}
		
		
		
	
	}
	
	public static double futureInvestmentValue(double investmentAmount, double yearlyInterestRate, int numOfYears)
	{
		double futureValue = investmentAmount * (Math.pow(1 + (yearlyInterestRate / 12) / 100, numOfYears * 12));
//		System.out.println(futureValue);
		return futureValue;
	
		
		
	}

}
