package Comprehensive;

import java.util.Scanner;

public class ClockCountdown_4_43 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner input = new Scanner(System.in);
		
		Thread t = Thread.currentThread();
		System.out.println("Enter the number of seconds: ");
		int seconds = input.nextInt();
		
		while(seconds != 1)
		{
			t.sleep(1000);
			System.out.println(seconds + " seconds remianing");
			seconds--;
			if(seconds == 1)
			{
				t.sleep(1000);
				System.out.println(seconds + " second remianing");
			}
			if(seconds == 1)
			{
				System.out.println("Stopped");
			}
		}
	}
}
