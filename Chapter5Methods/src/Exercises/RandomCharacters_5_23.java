package Exercises;

public class RandomCharacters_5_23 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=100; i++)
		{
			System.out.print(getRandomUpperCaseLetters() + " ");
			System.out.print(getRandomDigits() + " ");
			if(i % 10 == 0)
			{
				System.out.println();
			}
			
		}
	}
	
	public static char getRandomCharacter(char ch1, char ch2)
	{
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	public static char getRandomUpperCaseLetters()
	{
		return getRandomCharacter('A','Z');
	}
	
	public static char getRandomDigits()
	{
		return getRandomCharacter('0', '9');
	}

}
