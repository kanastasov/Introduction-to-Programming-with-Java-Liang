package Comprehensive;


import java.util.Scanner;
import java.util.Random;

public class ScissorRockPaper_4_34 {


	public static void main(String[] args) 
	{
		getResult();
		
	}
	public static void getResult()
	{
		Scanner input = new Scanner(System.in);
		int humanCount = 0, computerCount = 0;
		while(humanCount < 3 && computerCount < 3)
		{
			Random generator = new Random();
			System.out.println("Enter 0 for scissor, 1 for rock and 2 for paper:");
			
			String[] game = {"Scissor", "Rock", "Paper"};
			int comp = generator.nextInt(3);
			int human = input.nextInt(3);
			
			
			
			if(((comp == 0) && (human == 0)) || ((comp == 1) && (human == 1)) || ((comp == 2) && (human == 2))) 
			{
				System.out.println("The computer is: " + game[comp] + ". You are " + game[human]  + ". It is draw!");
					
			}
			else if(((comp == 0) && (human == 2)) || ((comp == 2) && (human == 1)) || ((comp == 1) && (human == 0))) 
			{
				System.out.println("The computer is: " + game[comp] + ". You are " + game[human]  + ". You loose, try again!!!");
				++computerCount;
			}
			else
			{
				System.out.println("The computer is: " + game[comp] + ". You are " + game[human]  + ". Comgrats you win!!!");
				++humanCount;
			}
		}
	}

}
