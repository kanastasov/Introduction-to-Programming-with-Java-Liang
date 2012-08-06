package ComprehensiveExersises;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class FinancialApplicationPayrollGUI_11 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String name = JOptionPane.showInputDialog("Enter employee's name: ");
		
		
//		String name = input.nextLine();
		String newHours = JOptionPane.showInputDialog("Enter number of hours worked in a week: ");
		int hours = Integer.parseInt(newHours);
		
		String newPayRate = JOptionPane.showInputDialog("Enter hourly pay rate: ");
		double hourlyPayRate = Double.parseDouble(newPayRate);
		String newFederalTax = JOptionPane.showInputDialog("Enter federal tax withholding rate:");
		double federalTax = Double.parseDouble(newFederalTax);
		String newStateTax = JOptionPane.showInputDialog("Enter state tax withholding rate:");
		double stateTax = Double.parseDouble(newStateTax);
		System.out.println();
		
		JOptionPane.showMessageDialog(null, "Employee's name: " + name);
		JOptionPane.showMessageDialog(null, "Hours worked: " + hours);
		JOptionPane.showMessageDialog(null, "Pay rate: " + hourlyPayRate);
		double grossPay = hours * hourlyPayRate;
		double federalTaxes = grossPay * 0.20;
		double stateTaxes = grossPay * 0.09;
		double totalDeduction = federalTaxes + stateTaxes;
		JOptionPane.showMessageDialog(null, "Gross pay: " + grossPay);
		JOptionPane.showMessageDialog(null, "Deduction");
		JOptionPane.showMessageDialog(null, ("	Federal Withholding: (20.0%) " + federalTaxes) +"\n" +
				"	State Withholding: (9.0%" + stateTaxes +"\n" +
				"	Total Deduction: " + totalDeduction  +"\n" +
				"Net Pay: " + (grossPay - totalDeduction)
				);
	}

}
