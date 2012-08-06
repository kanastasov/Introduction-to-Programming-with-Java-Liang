package Exercise3dot11To3dot20;

import java.util.Scanner;
import java.util.Random;

public class RandomUpperCaseLeeter_16 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		int letter = generator.nextInt(26) + 65;
	
//		System.out.println(letter);
		char ch = (char)letter;
		System.out.println(ch);
	}

}
