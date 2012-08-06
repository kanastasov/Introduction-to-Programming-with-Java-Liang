package Exercises;
import java.util.Date;


public class Date_8_03 
{
	public static void main(String[] args) 
	{

		
		for(long i=1000; i<=1000000000; i *= 10)
		{
			Date dd = new Date(i);
			System.out.println(dd.toString());
			
			
			
			
		}
		
	}
	
}
