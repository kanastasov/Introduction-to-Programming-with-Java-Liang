package Exercises;

public class FeetsToMeters_5_09 
{

	public static void main(String[] args) 
	{

		System.out.println("Feet \t Meter \t Meter \t Feet");
		for(double feet = 1, meter = 20 ; feet <= 10; feet++, meter +=5 )
		{
			System.out.println(feet + " \t\t" + footToMeter(feet) + "\t\t" + meter + "\t\t" + meterToFoot(meter)  );
		}
		
	}
	
	public static double footToMeter(double foot)
	{
		double meter = 0.305 * foot;
		return meter;
	}
	
	public static double meterToFoot(double meter)
	{
		double foot = meter / 0.305;
		return foot;
	}

}
