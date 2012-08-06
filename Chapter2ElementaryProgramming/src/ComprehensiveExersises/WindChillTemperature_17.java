package ComprehensiveExersises;

import java.util.Scanner;

public class WindChillTemperature_17 
{
	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the temperature in Farenheit: ");
		double farenheit = input.nextDouble();
		if((farenheit < -58) || (farenheit > 41))
		{
			System.out.println("Invalid data for temperature, it must be between -58 and 41");
		}
		System.out.println("Enter the wind speed miles per hour: ");
		double windSpeed = input.nextDouble();
		if(windSpeed < 2)
		{
			System.out.println("The wind speed must be equal of greater than 2");
		}
		
		double index = 35.74 + (0.615 * farenheit) - (35.75 *  Math.pow(windSpeed, 0.16)) +
				(0.4275 * farenheit) * Math.pow(windSpeed, 0.16);
		
		System.out.println("The wind chill index is: " + index  );
	}

}
