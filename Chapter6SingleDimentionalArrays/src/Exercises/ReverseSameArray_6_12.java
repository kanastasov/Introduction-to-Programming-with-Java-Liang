package Exercises;

public class ReverseSameArray_6_12 
{

	public static void main(String[] args) 
	{

		int[] list = {1,2,3,4,5,6,7,8};
		
			reverse(list);
			for(int i=1; i<list.length; i++)
			{
				System.out.println(list[i]);
			}
		
	}

	public static double[] reverseArray(double[] list)
	{
		for(int  j = list.length -1, i=1 ; j>0; j--, i++)
		{
			list[i] = j;
		}
		
		return list;
	}
	
	public static int[] reverse(int[] list) 
	{
	    for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) 
	    {
	      int temp = list[i];
	      list[i] = list[j];
	      list[j] = temp;
	    }

	    return list;
	  }
}
