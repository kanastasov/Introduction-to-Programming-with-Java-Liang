package Examples;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		
		int[] list = { 2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 70, 79};
		int key = 12;
		int j = binarySearch(list, key);
		System.out.println(j);
		
//		System.out.println(binarySearch(list, key));

	}
	
	public static int binarySearch(int[] list, int key)
	{
		int low = 0;
		int high = list.length - 1;
		
		while(low <= high)
		{
			int middle = (low + high) / 2;
			
			if(key < list[middle])
			{
				high = middle -1;
			}
			else if(key == list[middle])
			{
				return middle;
			}
			else
			{
				low = middle + 1;
			}
		}
		
		return (-low - 1);
	}
}
