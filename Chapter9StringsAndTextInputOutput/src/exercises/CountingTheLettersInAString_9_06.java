package exercises;

import java.util.Random;

public class CountingTheLettersInAString_9_06 
{

	public static void main(String[] args) 
	{

		String s = " avcfgthytrfghjkloiujhyg";
		System.out.println("the number of letters is: " + countLetters(s));
	}

	public static int countLetters(String s)
	{
		int count = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				count++;
			}
		}
		return count;
		
	}
}
