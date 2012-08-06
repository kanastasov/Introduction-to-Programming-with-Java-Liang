package Comprehensive;

import java.util.Scanner;

public class LoanAmortizationSchedule_4_22 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Loand amount: ");
		double loanAmount = input.nextDouble();
		System.out.println("Number of Years: ");
		int numberOfYears = input.nextInt();
		System.out.println("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;

		double monthlyPayment = loanAmount * monthlyInterestRate / (1
			      - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
	    double totalPayment = monthlyPayment * numberOfYears * 12;
	    
	    
		
		System.out.println("Monthly payment: " + (int)(monthlyPayment * 100) / 100.0 );
		System.out.println("Total Payment: " + (int)(totalPayment * 100) / 100.0);
		
		double balance = loanAmount;
		double interest = 0, principal = 0;
		System.out.println("Payment# \t" + "Interest \t\t" + "Principal \t\t" + " Balance \n" );
		for(int i=1; i<=numberOfYears * 12; i++)
		{
			 interest = (int)(monthlyInterestRate * balance * 100) / 100.0;
			 principal = (int)(monthlyPayment - interest * 100) / 100.0;
			 balance = (int)((balance - principal) * 100) / 100.0; 
			System.out.println( i + " \t\t" + interest + " \t\t" + principal + " \t\t" + balance );
		}
	
		
	}

}
