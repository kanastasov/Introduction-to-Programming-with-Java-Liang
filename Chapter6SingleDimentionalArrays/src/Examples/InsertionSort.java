package Examples;

public class InsertionSort 
{

	public static void main(String[] args) 
	{

		double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
		System.out.println("Original array:");
		for(int i=0; i<list.length; i++)
		{
			System.out.print(list[i] + " ");
		}
		System.out.println();
		
		insertionSort(list);
		System.out.println("Array after insertion sort: ");
		for(int i=0; i<list.length; i++)
		{
			System.out.print(list[i] + " ");
		}
	}
	
	public static void insertionSort(double[] list)
	{
		for(int i=1; i<list.length; i++)
		{
			double currentElement = list[i];
			
			int k;
			for(k = i-1; k>=0 && list[k] > currentElement; k--)
			{
				list[k + 1] = list[k];
			}
			
			// insert the current element into k+1
			list[k + 1] = currentElement;
		}
	}

}
