package Exercises;

public class TrigonometricsCosSin 
{

	public static void main(String[] args) 
	{
		System.out.println("Degree\tSin\t\tCos");

	    for (int degree = 0; degree <= 360; degree += 10)
	    {
	    	System.out.printf("%3d\t%6.4f\t\t%6.4f\n", degree,
	        Math.sin(degree * Math.PI / 180),
	        Math.cos(degree * Math.PI / 180));
	    }
	}
	public static void getSin(int degrees)
	{
		Math.sin(1);
	}
	
	public static void getCos(int degrees)
	{
		
	}

}
