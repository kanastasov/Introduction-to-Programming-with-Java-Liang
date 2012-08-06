package Comprehensive;

public class MathCombinations_4_45 
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(int i=2; i<=7; i++)
		{
			for(int j=1; j<2; j++)
			{
				System.out.print(j + " " + i);
				count++;
			
			}
			System.out.println();
		}
		System.out.println("count: " + count);
	}

}
