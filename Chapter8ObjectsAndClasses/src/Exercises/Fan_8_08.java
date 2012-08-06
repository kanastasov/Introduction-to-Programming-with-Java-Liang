package Exercises;

public class Fan_8_08 
{

	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "White";
	
	public Fan_8_08()
	{
		
	}

	public int getSpeed() 
	{
		return speed;
	}

	public void setSpeed(int speed) 
	{
		this.speed = speed;
	}

	public boolean isOn()
	{
		return on;
	}

	public void setOn(boolean on)
	{
		this.on = on;
	}

	public double getRadius() 
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
	
	public String toString()
	{
		return "speed " + speed + "\n"
				+ "color " + color + "\n"
				+ "radius " + radius + "\n"
				+ ((on) ? "fan is on" : "fan is off");
				
	}
}
