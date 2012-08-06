package Comprehensive;

import java.util.Scanner;

public class ComparingLoans_4_21 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.println("Number of Years: ");
		int numberOfYears = input.nextInt();
		
		
		System.out.println("Interest Rate" + "		" + "Monthly Payment" + "		" + "TotalPayment \n");
		
		for(double annualInterestRate=5; annualInterestRate<=8; annualInterestRate += 0.125)
		{
			 double monthlyInterestRate = annualInterestRate / 1200;
			 
			 double monthlyPayment = loanAmount * monthlyInterestRate / (1
				      - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			 
				    double totalPayment = monthlyPayment * numberOfYears * 12;
			System.out.println(annualInterestRate + "%			" + (int)(monthlyPayment * 100) / 100.0 + "			" + (int)(totalPayment * 100) / 100.0);
		}

	}

}
