package Exercise3dot11To3dot20;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeapYear_18
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
	    String message = JOptionPane.showInputDialog(null,"Enter a year: " );

	    int year = Integer.parseInt(message);
	    // Check if the year is a leap year 
	    boolean isLeapYear = 
	      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    
	 // Display the result in a message dialog box
	    JOptionPane.showMessageDialog(null, year + " is a leap year? " + isLeapYear);
	    

	}

}
