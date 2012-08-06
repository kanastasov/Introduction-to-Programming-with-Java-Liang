package Exercises;

public class KilogramsToPoundsAndViceVersa_4_05 
{
	public static void main(String[] args)
	{
		System.out.println("Kilograms:    Pounds:      		 Pounds:       Kilograms");
		for(int kilograms=1, pounds = 20; kilograms<200; kilograms+=2, pounds += 5)
		{
			System.out.println(kilograms + " 	      " + kilograms * 2.2 + "        	 	 "  + pounds + "           " + pounds / 2.2 );
		}

	}

}
