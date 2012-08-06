package Exercises;

public class CelsiusToFahrenheit_5_08 
{

	public static void main(String[] args) 
	{
		System.out.println("Celsius \t Fahrenheit \t Fahrenheit \t Celsius");
		for(double celsius = 40, fahrenheit = 120 ; celsius >30; celsius--, fahrenheit -=10 )
		{
			System.out.println(celsius+ " \t\t" + celsiusToFahrenheit(celsius) + "\t\t" + fahrenheit + "\t\t" + fahrenheitToCelsius(fahrenheit)  );
		}
		
	}
	
	public static double celsiusToFahrenheit(double celsius)
	{
		double fahrenheit = (1.8) * celsius + 32;
		return fahrenheit;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		double celsius = (fahrenheit - 32) / (1.8);
		return celsius;
	}

}
