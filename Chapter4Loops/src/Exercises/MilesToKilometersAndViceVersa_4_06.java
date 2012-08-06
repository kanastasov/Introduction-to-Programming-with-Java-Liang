package Exercises;

public class MilesToKilometersAndViceVersa_4_06 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Miles:    Kilometers:      		 Kilometers:       Miles:");
		for(int miles=1, kilometers = 20; miles<11; miles ++, kilometers += 5)
		{
			System.out.println(miles + " 	      " + miles * 1.609 + "        	 	 "  + kilometers + "           " + kilometers / 1.609 );
		}

	}

}
