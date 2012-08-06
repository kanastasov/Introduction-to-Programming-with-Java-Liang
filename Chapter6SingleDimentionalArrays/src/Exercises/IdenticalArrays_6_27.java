package Exercises;

public class IdenticalArrays_6_27 
{
	public static void main(String[] args) 
	{
		int[] list1 = {5, 2, 5, 6, 6, 1};
		int[] list2 = {5, 5, 2 ,6 ,1, 6};
		equals(list1, list2);
		
		
		
	}
	
	public static boolean equals(int[] list1, int[] list2)
	{
		int[] store1 = getCount(list1);
		int[] store2 = getCount(list2);
		
		boolean identical = false;
		for(int i=0; i<store1.length; i++)
		{
			if(store1[i] != store2[i])
			{
				identical = false;
				break;
				
			}
			else
			{
				identical = true;
			}
		}
		System.out.println("\nAre the two lists identical? " + identical);
		
		return identical;
	}
	
	public static int[] getCount(int[] list)
	{
		System.out.println();
		int [] counts = new int[10];
		for(int i=0; i<list.length; i++)
		{
			counts[list[i]]++ ;
		}
		
		for(int i=0; i<counts.length; i++)
		{
			System.out.print(counts[i] + " ");
		}
		return counts;
	}

}
