package ComprehensiveExersises;

import javax.swing.JOptionPane;

public class FinancialApplicationInterestGUI_12 
{
	
	public static void main(String[] args) 
	{
		String myBalance = JOptionPane.showInputDialog("Enter balance: ");
		int balance = Integer.parseInt(myBalance);
		String myAnnualInterestRate = JOptionPane.showInputDialog("Enter annual interest rate: ");
		double annualInterestRate = Double.parseDouble(myAnnualInterestRate);
		
		getInterest(balance, annualInterestRate);
	}
	public static void getInterest(int balance, double annualInterestRate)
	{
		double interest = balance * (annualInterestRate / 1200);
		JOptionPane.showMessageDialog(null, "The interest is: " + interest);
	}

}
