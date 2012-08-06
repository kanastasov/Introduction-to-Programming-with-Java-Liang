package Exercises;

public class SquareRoot_5_18 
{
	public static void main(String[] args) 
	{
		System.out.println("Number\tSquareRoot");
		for(int num=0; num<=20; num +=2)
		{
			getSQRT(num);
		
		}
	}

	public static void getSQRT(int num)
	{
		System.out.println(num +"\t\t"+Math.sqrt(num));
	}
}
