package exercises;

public class DecimalToBinary_9_10 
{
	public static void main(String[] args) 
	{
		int number = 256;
		//11110111
		System.out.println(decimalToBinary(number));
		
	}

	public static String decimalToBinary(int value)
	{
		StringBuilder sb =  new StringBuilder();
		while(value > 0)
		{
			
			
			if(value % 2 == 0)
			{
				sb.append("0");
			}
			else
			{
				sb.append("1");
			}
			value /= 2;
		}
		sb.reverse();
		return sb.toString() + " ";
	}
}
