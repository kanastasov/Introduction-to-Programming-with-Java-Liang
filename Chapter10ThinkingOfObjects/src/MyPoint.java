
public class MyPoint 
{
	private int x;
	private int y;
	
	public MyPoint()
	{
		 x = 0;
		 y = 0;
	}
	
	public MyPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}
	
	public double distance(MyPoint point)
	{
		return distance(this,point);
		
	}
	
	 public static double distance(MyPoint p1, MyPoint p2) 
	 {
	        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) +
	            (p1.y - p2.y) * (p1.y - p2.y));
	 }
	 
	 public static void main(String[] args) 
	 {
	        MyPoint p1 = new MyPoint();
	        MyPoint p2 = new MyPoint(10, 30);
	        System.out.println(p1.distance(p2));
	        System.out.println(MyPoint.distance(p1, p2));
	    }

}
