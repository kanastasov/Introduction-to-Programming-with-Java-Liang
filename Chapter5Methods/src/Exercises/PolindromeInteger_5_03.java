package Exercises;

public class PolindromeInteger_5_03 
{
	public static void main(String[] args) 
	{

		int number = 454;
		reverse(number);
		isPalindrome(number);
		if(isPalindrome(number))
		{
			System.out.println("The number is Palindrome:");
		}
		else
		{
			System.out.println("The number is not Panlindrome: ");
		}
	}

	public static StringBuilder reverse(int number)
	{
		StringBuilder sb = new StringBuilder();
		String store = "";
		String temp ="" + number;
		for(int i=temp.length() - 1; i>= 0; i--)
		{
			store ="" + temp.charAt(i);
			sb.append(store);
		}
		
		System.out.println("StringBuilder: " + sb);
		return sb;
	}
	
	public static boolean isPalindrome(int number)
	{
		
		StringBuilder number2 = reverse(number);
		System.out.println("IsPalindrome: " + number2);
		
		if(number2.equals(number))
		{
			return true;
		}
		return false;
	}
}
