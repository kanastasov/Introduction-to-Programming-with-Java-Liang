package Exercises;

public class ComputingSeries_5_14 
{

	public static void main(String[] args) 
	{
		System.out.println("i \t\t m(i)");
		for(int i=10; i<=100; i+=10)
		{
			System.out.println(i +"\t\t" + calculatePi(i));
		}
		
	}
	
	public static double calculatePi(int end)
	{
		double pi = 0;
		double term;
		for(int i=1; i<=end; i+=2)
		{
			term = 4.0 * (1.0 / (2 * i  - 1) -1.0 / (2 * i + 1));
			pi +=term;
		}
		return pi;
	}

}
