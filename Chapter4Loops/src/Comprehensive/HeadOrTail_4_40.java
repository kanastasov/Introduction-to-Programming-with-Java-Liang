package Comprehensive;

import java.util.*;
public class HeadOrTail_4_40 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int headCount = 0, tailCount = 0;
		for(int i=0; i<1000000; i++)
		{
			int number = generator.nextInt(2);
			if(number == 0)
			{
				headCount++;
				
			}
			else
			{
				tailCount++;
			}
			

		}
		System.out.println("Number Of Heads Occured: " + headCount);
		System.out.println("Number of Tail Occured: " + tailCount);
		
	}

}
