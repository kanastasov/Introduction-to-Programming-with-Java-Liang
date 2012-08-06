package ComprehensiveExersises;

import java.util.Random;

public class RandomCharacter_19 
{
	public static void main(String[] args) 
	{
		Random randomGenerator = new Random();
		int number = randomGenerator.nextInt(25) + 65;
		char c = (char) number;
		System.out.println(c  + "  "+ number);
		
		long time = System.currentTimeMillis();
		

	}

		
}
