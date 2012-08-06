package Exercises;

public class AsciiTable_4_14 
{
	public static void main(String[] args) 
	{
		int counter = 0;
		for(int i=33; i<=126; i++)
		{
			char ch = (char)i;
			System.out.print(ch + " ");
			counter++; 
			if(counter == 10)
			{
				System.out.println();
				counter = 0;
			}
		}
	}

}
