package Exercises;

import java.util.*;

public class Random_8_04 
{
	public static void main(String[] args) 
	{
		Random generator = new Random(1000);
		
		int number = 0;
		for(int i=0; i<50; i++)
		{
			number = generator.nextInt(100);
			System.out.println(i + "  " + number);
		}
	}

}
