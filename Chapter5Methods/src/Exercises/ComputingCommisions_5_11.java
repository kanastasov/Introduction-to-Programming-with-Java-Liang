package Exercises;

public class ComputingCommisions_5_11 
{

	public static void main(String[] args) 
	{
		System.out.println("Sales Amount \t Commision");
		for(double salesAmount = 10000; salesAmount<100000; salesAmount += 5000)
		{
			System.out.println(salesAmount + "\t\t " + computeCommision(salesAmount));
		}
		
	}
	
	public static double computeCommision(double salesAmount)
	{
		double commision = salesAmount * 0.12;
		return commision;
	}

}
