package Exercise3dot11To3dot20;

import java.util.Scanner;
import java.util.Random;

public class Lottery_15
{
	public static void main(String[] args) 
	{
		
		Random generator = new Random();
		
		// Generate a lottery
	    int lottery = generator.nextInt(1000) + 100;

	    System.out.println(lottery);
	    // Prompt the user to enter a guess
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter your lottery pick (three digits): ");
	    int guess = input.nextInt();

	    // Get digits from lottery
	    int lotteryDigit1 = lottery / 100;
	    int lotteryDigit2 = lottery % 100;
	    int lotteryDigit3 = lotteryDigit2 % 10;
	    lotteryDigit2 /= 10;
//	    System.out.println(lotteryDigit1 + " " + lotteryDigit2 + " " +  lotteryDigit3);

	    // Get digits from guess
	    //841
	    int guessDigit1 = guess / 100; //8
	    int guessDigit2 = guess % 100;//41
	    int guessDigit3 = guessDigit2  % 10;//1
	    guessDigit2 /= 10;  //4
	    
	    System.out.println(guessDigit1 + " " + guessDigit2 + " " + guessDigit3);

	    System.out.println("The lottery number is " + lottery);

	    // Check the guess
	    if (guess == lottery)
	      System.out.println("Exact match: you win $100,000");
	    else if ((guessDigit1 == lotteryDigit2
	          && guessDigit2 == lotteryDigit1
	          && guessDigit3 == lotteryDigit3) 
	          || (guessDigit1 == lotteryDigit3
	  	      && guessDigit3 == lotteryDigit1
		      && guessDigit2 == lotteryDigit2)
		      || (guessDigit2 == lotteryDigit3
	  	      && guessDigit3 == lotteryDigit2
		      && guessDigit1 == lotteryDigit1))
	    	
	      System.out.println("Match all digits: you win $30,000");
	    else if (guessDigit1 == lotteryDigit1 
	          || guessDigit1 == lotteryDigit2 
	          || guessDigit1 == lotteryDigit3	
 	          || guessDigit2 == lotteryDigit1 
	          || guessDigit2 == lotteryDigit2
	          || guessDigit2 == lotteryDigit3
	          || guessDigit3 == lotteryDigit1
	          || guessDigit3 == lotteryDigit2
	          || guessDigit3 == lotteryDigit3)
	      System.out.println("Match one digit: you win $1,000");
	    else
	      System.out.println("Sorry, no match"); 

	}

}
