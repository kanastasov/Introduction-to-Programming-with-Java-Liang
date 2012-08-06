package Exercises;

public class SmallestNSquare_4_12 
{
	public static void main(String[] args) 
	{
		
		double n = 12000;
		while((n * n) > 16000)
		{
			n--;
		}
		System.out.println(n + 1);

	}

}
