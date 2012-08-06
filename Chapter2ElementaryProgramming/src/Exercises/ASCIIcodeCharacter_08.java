package Exercises;
import java.util.Scanner;
public class ASCIIcodeCharacter_08 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ASCII code: ");
		int digit = input.nextInt();
		getAscii(digit);
	}

	public static void getAscii(int digit)
	{
		char c = (char)digit;
		System.out.println("The character for ASCII code " + digit + " is " + c);
	}
}
