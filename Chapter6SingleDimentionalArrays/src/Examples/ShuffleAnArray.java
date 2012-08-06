package Examples;

public class ShuffleAnArray 
{
	public static void main(String[] args) 
	{
		int[] numbers  = new int[10];
		
		//generates an array
		for(int i=0; i< numbers.length; i++)
		{
			numbers[i] = i + 1;
		}
		
		//print original array
		for(int i=0; i<numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		// shuffle array
		for(int i=0; i<numbers.length; i++)
		{
			int index = (int)(Math.random() * numbers.length);
			int temp = numbers[i];
			numbers[i] = numbers[index];
			numbers[index] = temp;
			
			
		}
		//print shuffled array
		for(int i=0; i<numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		
	}

}
