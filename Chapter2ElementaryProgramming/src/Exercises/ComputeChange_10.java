package Exercises;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComputeChange_10
{
	public static void main(String[] args) {
	    // Create a Scanner
	    Scanner input = new Scanner(System.in);

	    // Receive the amount
	    String myAmount = JOptionPane.showInputDialog("Enter an amount in double, for example 11.56: ");
//	    double amount = input.nextDouble();
	    
	    double amount = Double.parseDouble(myAmount);
	    int remainingAmount = (int)(amount * 100);

	    // Find the number of one dollars
	    int numberOfOneDollars = remainingAmount / 100;
	    remainingAmount = remainingAmount % 100;

	    // Find the number of quarters in the remaining amount
	    int numberOfQuarters = remainingAmount / 25;
	    remainingAmount = remainingAmount % 25;

	    // Find the number of dimes in the remaining amount
	    int numberOfDimes = remainingAmount / 10;
	    remainingAmount = remainingAmount % 10;

	    // Find the number of nickels in the remaining amount
	    int numberOfNickels = remainingAmount / 5;
	    remainingAmount = remainingAmount % 5;

	    // Find the number of pennies in the remaining amount
	    int numberOfPennies = remainingAmount;
	    
	    // Display results
	    String output = "Your amount " + amount + " consists of \n" +
	  	      "\t" + numberOfOneDollars + " dollars\n" +
	  	      "\t" + numberOfQuarters + " quarters\n" +
	  	      "\t" + numberOfDimes + " dimes\n" +
	  	      "\t" + numberOfNickels + " nickels\n" +
	  	      "\t" + numberOfPennies + " pennies";
	    JOptionPane.showMessageDialog(null, output);

	  }

}
