package exercises;

import java.util.Scanner;

public class CheckingPassword_9_03 
{
	public static void main(String[] args) 
	{

		String pass = "Impossible583";
		
		System.out.println("Is it valid? " + isValidPass(pass));
	}

	public static boolean isValidPass(String pass)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a pass: ");
		pass = input.nextLine();
		if(hasLength(pass)  && hasDigitsAndLetters(pass) && hasTwoDigits(pass))
		{
			return true;
		}
		return false;
		
			
			
		
		
	}
	
	public static boolean hasLength(String pass)
	{
		if(pass.length() >= 8)
		{
			return true;
		}
		
		return false;
	}
	
	//check if the whole string consists of digits and letters
	public static boolean hasDigitsAndLetters(String pass)
	{
		for(int i=0; i<pass.length(); i++)
		{
			if(!Character.isLetterOrDigit((pass.charAt(i))))
			{
				return false;
			}
			
		}
		return true;
	}
	
	
	
	// check whether the password has at least 2 digits
	public static boolean hasTwoDigits(String pass)
	{
		int counter = 0;
		for(int i=0; i<pass.length(); i++)
		{
			if(Character.isDigit(pass.charAt(i)))
			{
				counter ++;
			}
			
		}
		System.out.println("Number of digits: " + counter);
		if(counter >= 2)
		{
			return true;
		}
		return false;
	}
}
