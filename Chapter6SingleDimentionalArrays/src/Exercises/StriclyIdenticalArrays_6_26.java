package Exercises;

public class StriclyIdenticalArrays_6_26 
{
	public static void main(String[] args) 
	{

		int[] list1 = {5, 2, 5, 6, 6, 1};
		int[] list2 = {5, 2, 5, 6, 6, 1};
		if(equal(list1, list2))
		{
			System.out.println("The two lists are identical: ");
		}
		else
		{
			System.out.println("The two lists are not identical: ");
		}
	}

	public static boolean equal(int[] list1, int[] list2)
	{
		boolean equal;
		if(list1.length == list2.length)
		{
			for(int i=0; i<list1.length; i++)
			{
				if(list1[i] != list2[i])
				{
					return equal = false;
				}
			}
		}
		return equal = true;
	}
}
