package Exercise3dot11To3dot20;

import java.util.Scanner;
import java.util.Random;

public class HeadOrTail_14 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int x = generator.nextInt(2);
		
		System.out.println("Head or Tail? Enter  0 for head and 1 for tail");
		int temp = input.nextInt(2);
		
		if(x == temp)
		{
			System.out.println("Congrats you are right, you won a bride");
		}
		else
		{
			System.out.println("Sorry wrong answer, you lost all your money");
		}
		
		System.out.println("Your guess is: " + temp);
		System.out.println("The answer is: " + x);
	}

}
