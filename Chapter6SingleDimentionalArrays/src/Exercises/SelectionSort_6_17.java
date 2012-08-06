package Exercises;

public class SelectionSort_6_17 
{
	public static void main(String[] args) 
	{
		double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
		
		System.out.println("Original array: ");
		for(int i=0; i<list.length; i++)
		{
			System.out.print(list[i] + " ");
		}
		
		selectionSort(list);
		
		System.out.println();
		System.out.println("Array after selection sort");
		for(int i=0; i<list.length; i++)
		{
			System.out.print(list[i] + " ");
		}
		
	}
	
	public static void selectionSort(double[] list)
	{
		
		for(int i=list.length -1; i>=0; i--)
		{
			double currentMax = list[i];
			int currentMaxIndex = i;
			
			for(int j=i -1; j>=0; j--)
			{
				if(currentMax < list[j])
				{
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			
			//swap list[i] with list[currentMinIndex] if necesary:
			if(currentMaxIndex != i)
			{
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
		
		
	
		
	}

}
