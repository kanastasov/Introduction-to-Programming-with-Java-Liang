package Exercises;

public class NSidedPolygon_8_09 
{
	private int n;
	private double side;
	private double x;
	private double y;
	
	public NSidedPolygon_8_09()
	{
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	
	public NSidedPolygon_8_09(int n, double side)
	{
		this.n = n;
		this.side = side;
	}
	
	public NSidedPolygon_8_09(int n, double side, double x, double y)
	{
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int getN() 
	{
		return n;
	}

	public void setN(int n) 
	{
		this.n = n;
	}

	public double getSide()
	{
		return side;
	}

	public void setSide(double side) 
	{
		this.side = side;
	}

	public double getX()
	{
		return x;
	}

	public void setX(double x) 
	{
		this.x = x;
	}

	public double getY() 
	{
		return y;
	}

	public void setY(double y) 
	{
		this.y = y;
	}
	
	public double getPerimeter()
	{
		return (n * side);
	}

	public double getArea()
	{
		double pp = getPerimeter() / n;
		double area =( n * Math.pow(side, 2) ) / (4 * Math.tan(pp));
		return area;
	}

	@Override
	public String toString() 
	{
		return "NSidedPolygon_8_09 [getN()=" + getN() + ", getSide()="
				+ getSide() + ", getX()=" + getX() + ", getY()=" + getY()
				+ ", getPerimeter()=" + getPerimeter() + ", getArea()="
				+ getArea() + "]";
	}
	
	

}
