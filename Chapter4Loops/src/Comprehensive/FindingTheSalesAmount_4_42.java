package Comprehensive;

import java.util.Scanner;
public class FindingTheSalesAmount_4_42 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int salary = 5000;
		int goal =  0;
		goal += salary;
		double salesAmount = 0;
		System.out.println("Enter commision Amount: ");
		double enterAmount = input.nextDouble();
		double commision = 0;
		
		for(commision = enterAmount; commision < 25000; commision++)
		{
			
			commision = salesAmount * 0.12;
		
			salesAmount++;
		}
		System.out.println("For 30000$ you need to make " + salesAmount + "$ Sales for year");
		

	}

}
