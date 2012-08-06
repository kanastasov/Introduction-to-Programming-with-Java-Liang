
public class PrimeNumbers_10_06 
{

	public static void main(String[] args) 
	{
		StackOfIntegers_10_05 stack = new StackOfIntegers_10_05();
		
		boolean isPrime = false;
		int num;
		for(num = 2; num<=120; num++)
		{
			for(int i=2; i< num; i++)
			{
				if(num % i == 0)
				{
					isPrime = false;
					break;
				}
				isPrime = true;
			}
			if(isPrime)
			{
				stack.push(num);
				System.out.print(num + " ");
			}
		}
		System.out.println();
		while(!stack.empty())
		{
			System.out.print(stack.pop() + " ");
		}
	}
}
