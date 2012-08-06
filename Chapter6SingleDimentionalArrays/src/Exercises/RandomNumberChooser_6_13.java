package Exercises;

import java.util.*;

public class RandomNumberChooser_6_13 
{

	public static void main(String[] args) 
	{
		for(int i=0; i<100; i++)
		{
			System.out.println(getRandom(i));
		}
	
	}
	
	public static int getRandom(int... number)
	{
		Random generator = new Random();
		
		int numberr = generator.nextInt(53) + 1; 
		return numberr;
	}
}
