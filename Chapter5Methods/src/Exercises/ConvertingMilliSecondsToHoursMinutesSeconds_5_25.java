package Exercises;

public class ConvertingMilliSecondsToHoursMinutesSeconds_5_25 
{
	public static void main(String[] args) 
	{
		System.out.println(convertMilis(555550000));
	}

	public static String convertMilis(long milis)
	{
		long totalSeconds = milis / 1000;
		long currentSeconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		long hours = totalMinutes / 60;
		
		String description = hours + ":" + currentMinutes + ":" + currentSeconds;
		return description;
	}
}
