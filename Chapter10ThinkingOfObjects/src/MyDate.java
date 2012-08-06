import java.util.*;

public class MyDate 
{
	private int year;
	private int month;
	private int day;
	
	public MyDate()
	{
		Date date = new Date();
		System.currentTimeMillis();
	}
	
	public MyDate(long elapsedTime)
	{
		Date date = new Date(elapsedTime);
	}
	
	public MyDate(int year, int month, int day)
	{
		Date date = new Date(year,month,day);
	}
	
	public static void setDate(long elapsedTime)
	{
		new Date(elapsedTime);
	}
	
	
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public static void main(String[] args) 
	{

	}

}
