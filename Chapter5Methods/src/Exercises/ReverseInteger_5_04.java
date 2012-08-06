package Exercises;

public class ReverseInteger_5_04 
{
	public static void main(String[] args) 
	{
		int number = 3456;
		reverse(number);
		
	}
	public static void reverse(int number)
	{
		
		String store = "";
		String temp ="" + number;
		for(int i=temp.length() - 1; i>= 0; i--)
		{
			store ="" + temp.charAt(i);
			System.out.print(store);
		}
	}

}
