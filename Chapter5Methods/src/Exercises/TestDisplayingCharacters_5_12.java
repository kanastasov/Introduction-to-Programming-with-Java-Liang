package Exercises;

import CaseStudy.RandomCharacter;

public class TestDisplayingCharacters_5_12 
{
	public static void main(String[] args) 
	{
		final int NUMBER_OF_CHARS = 250;
	    final int CHARS_PER_LINE = 30;

	    // Print random characters between 'a' and 'z', 25 chars per line
//	    for (int i = 0; i < NUMBER_OF_CHARS; i++) 
//	    {
////	      char ch = RandomCharacter.getRandomLowerCaseLetter();
//	      char ch2 = DisplayingCharacters_5_12.getRandomDigitCharacter();
//	      if ((i + 1) % CHARS_PER_LINE == 0)
//	        System.out.println(" " +  ch2);
//	      else
//	        System.out.print( " " + ch2);
//	    }
	    for(int i=0; i<NUMBER_OF_CHARS; i++)
	    {
	    	DisplayingCharacters_5_12.printChars('l', 'Z', 20);
		    
	    }
	    
	}

}
