package Comprehensive;

import java.util.*;

public class Craps_5_29 
{

	public static void main(String[] args) 
	{
		int num1 = 0,num2 = 0;
		System.out.print(getNumber(num1,num2));

	}
	
	public static String getNumber(int num1, int num2)
	{
		
		Random generator = new Random();
		num1 = generator.nextInt(6) + 1;
		num2 = generator.nextInt(6) + 1;
		int sum = num1 + num2;
		int temp = sum;
		String collect = null;
		while(sum != 1 || sum !=2 || sum !=12 || sum !=7 || sum !=11 )
		{
			
			collect = "You rolled " + num1 + " + " + num2 + " = " +  sum;
			if(sum == 2 || sum == 3 || sum == 12)
			{
				System.out.println("You lose");
				break;
			}
			else if (sum == 7 || sum == 11)
			{
				System.out.println("You win");
				break;
			}
			if(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10)
			{
				while(sum == 7 || sum == temp)
				{			
					System.out.println("Point is " + sum);
					
					num1 = generator.nextInt(6) + 1;
					num2 = generator.nextInt(6) + 1;
					int newsum = num1 + num2;
					if(sum == 7)
					{
						System.out.println("You lose: ");
						break;
					}
					else if(newsum == temp)
					{
						System.out.println("You win: ");
						System.exit(0);
					}
				}
				
				
				
			}
			
			
		}
		return collect;
	}
}
