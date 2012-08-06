package Comprehensive;
import java.util.Scanner;
public class DecimalToBinary_4_37 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
// illegal solution
//		String number = Integer.toBinaryString(65);
//		System.out.println(number);
		
		
		System.out.println("Enter a decimal value to be converted into binary: ");
		int number = input.nextInt();
		String sum = "";
		while(number > 0)
		{
			if(number % 2 == 0)
			{
				sum += 0;
			}
			else
			{
				sum += 1;
			}
			
			number /= 2;
			
		}
		
		
//		binary in reverse order
//		System.out.println(sum);
		String reverse ="";
		for(int i=sum.length() - 1; i>=0; i--)
		{
			// the binary equvalent
			reverse = "" + sum.charAt(i)  ;
			System.out.print(reverse);
		}
	}

}
