package Exercises;

public class FindingANumber_4_10 
{
	public static void main(String[] args)
	{
		int counter = 0;
		for(int x=100; x<1000; x++)
		{
			if((x % 5 == 0) && (x % 6 == 0))
			{
				System.out.println(x + " is divisable by both 5 and 6");
				counter ++;
				if(counter == 10)
				{
					counter = 0;
					System.out.println();
				}
			}
//			else if((x % 5 != 0) && (x % 6 != 0))
//			{
//				System.out.println(x + " is not divisible by either 5 or 6");
//			}
//			else
//			{
//				System.out.println(x + " is divisible by 5 or 6, but not both");
//			}
			
		}
	}

}
