package ExerciseComprehensive;

import java.util.*;
public class PickingACard_24 
{
	public static void main(String[] args)
	{
		
		String[] rank = {"Ace" , "2" , "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suit ={"Clubs", "Diamonds", "Hearts", "Spades"};
		
		Random generator = new Random();
		
		int getRank = generator.nextInt(13);
		int getSuit = generator.nextInt(4);
		
		System.out.println("The card you picked is: " + rank[getRank]  + " of "+ suit[getSuit]);
		
		
	}
}
