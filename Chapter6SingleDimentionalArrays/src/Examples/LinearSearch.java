package Examples;

public class LinearSearch 
{
	public static void main(String[] args)
	{
		int[] list = {1, 4, 7, 3, 55, 32, 29};
		int key = 322;
		System.out.println("The key you are looking for is in possition " + linearSearch(list, key));
	}
	
	public static int linearSearch(int[] list, int key)
	{
		for(int i=0; i<list.length; i++)
		{
			if(key == list[i])
			{
				return i;
			}
			
		}
		return -1;
	}

}
