package Exercises;

import java.util.GregorianCalendar;

public class GregorianCalendar_8_05 
{
	public static void main(String[] args) 
	{
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("Year:" + calendar.get(GregorianCalendar.YEAR) + ":"  + "Month" + calendar.get(GregorianCalendar.MONTH)
				+ ":" + "day" + calendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		calendar.setTimeInMillis(1234567898765L);

//		System.out.println(calendar.getTimeInMillis());
		System.out.println(calendar.getTime());
	}

}
