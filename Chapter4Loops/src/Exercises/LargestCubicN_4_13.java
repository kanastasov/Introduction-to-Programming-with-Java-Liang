package Exercises;

public class LargestCubicN_4_13
{
	public static void main(String[] args)
	{
		double n = 0;
		while((n * n * n) < 12000)
		{
			n++;
		}
		System.out.println(n);
	}

}
