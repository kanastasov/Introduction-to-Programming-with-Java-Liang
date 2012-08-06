package Comprehensive;

public class FindingTheSalesAmount_4_39 
{
	public static void main(String[] args) 
	{
		int salary = 5000;
		int goal =  0;
		goal += salary;
		double salesAmount = 0;
		double commision = 10000;
		
		while (commision < 25000)
		{
			
			commision = salesAmount * 0.12;
		
//			System.out.println("Commmision is: " + commision);
//			System.out.println("Sales amount is: " + salesAmount);
			salesAmount++;
		}
		System.out.println("For 30000$ you need to make " + salesAmount + "$ Sales for year");
		
		
	}

}
