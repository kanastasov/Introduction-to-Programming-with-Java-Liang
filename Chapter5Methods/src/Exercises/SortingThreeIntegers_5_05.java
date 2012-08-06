package Exercises;

public class SortingThreeIntegers_5_05 
{

	public static void main(String[] args) 
	{
		double num1 = 1, num2 = 5, num3 = 3;
		displaySortedNumbers(num1, num2, num3);
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3)
	{
		double temp;
		
		if(num1 > num2)
		{
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		
		if(num1 > num3)
		{
			temp = num3;
			num3 = num1;
			num1 = temp;
		}
		
		if(num2 > num3)
		{
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		
		System.out.println("The sorted numbers are: " + num1 + " " + num2 + " " + num3);
	}
}
