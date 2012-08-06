package Exercises;

import java.util.*;

public class SortingStudents_6_19 
{
	public static void main(String[] args) 
	{
		int[] list = getStudentDetails();

		System.out.println("Original Studnets list: ");
		printArray(list);
		
		bubbleSort(list);
		
		System.out.println("\nAfter bubble sort Students list: ");
		printArray(list);
		
	}
	
	public static int getStudnetsNumber()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of students: ");
		int numOfStud = input.nextInt();
		return numOfStud;
	}
	
	public static int[] getStudentDetails()
	{
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int store = getStudnetsNumber();
		int[] list = new int[store];
		int n =0;
		
		
		while(store > n)
		{
			System.out.println("Enter student names:");
			String names = input.nextLine();
			int score = generator.nextInt(5) + 2;
			list[n] = score;
			System.out.println(names + "'s score  is " + score);
			n++;
		}
		return list;
	}
	
	public static void bubbleSort(int[] list)
	{
		
		for(int i=0; i<list.length; i++)
		{
			for(int j=i + 1; j<list.length ; j++)
			{
				if(list[i] < list[j])
				{
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
				
			}
			
		}
	}
	
	
	public static void printArray(int[] list)
	{
		for(int i=0; i<list.length; i++)
		{
			System.out.print(list[i] + ", ");
		}
	}

}
