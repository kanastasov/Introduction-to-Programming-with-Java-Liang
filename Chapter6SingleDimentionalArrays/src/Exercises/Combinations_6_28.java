package Exercises;
import java.util.*;

public class Combinations_6_28 
{
	public static void main(String[] args) 
	{
		display();
	}

	public static void display()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10 integers:");
		int n =0;
		int[] list = new int[10];
		while(n<10)
		{
			int number = input.nextInt();
			list[n] = number;
			n++;
		}
		
		for(int i=0; i<list.length; i++)
		{
			for(int j=i+1; j<list.length; j++)
			{
				System.out.println(list[i] + " " + list[j]);
			}
		}
	}
}
