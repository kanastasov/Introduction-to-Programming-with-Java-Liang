package Comprehensive;

public class DecimalToHex_4_38 
{
	public static void main(String[] args) 
	{
		
//		Illegal solution
//		String number2 = Integer.toHexString(720);
//		System.out.println(number2);
		
		int decimal = 720;
		int number = decimal;
		String hexSum = "";
		while(number > 0)
		{
			
			int singal = number % 16;
			if(singal == 15)
			{
				hexSum = "F" + hexSum;
			}
			else if(singal == 14)
			{
				hexSum = "E" + hexSum;
			}
			else if(singal == 13)
			{
				hexSum = "D" + hexSum;
			}
			else if(singal == 12)
			{
				hexSum = "C" + hexSum;
			}
			else if(singal == 11)
			{
				hexSum = "B" + hexSum;
			}
			else if(singal == 10)
			{
				hexSum = "A" + hexSum;
			}
			else
			{
				hexSum = singal + hexSum;
			}
			number /= 16;
		}
		System.out.println(decimal + "'s hex representation is: " + hexSum);
		
	}

}
