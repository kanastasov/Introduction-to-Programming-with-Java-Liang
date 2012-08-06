package Exercises;

public class LinearEquation_8_11 
{
//	private int a, b, c, d, e, f;
	private double a, b, c, d, e, f;
	
	public LinearEquation_8_11()
	{
		
	}
	
	public LinearEquation_8_11(int a, int b, int c, int d, int e, int f)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public LinearEquation_8_11(double a, double b, double c, double d, double e, double f)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}

	public boolean isSolvable()
	{
		if((a * d) - (b * c) != 0)
		{
			return true;
		}
		return false;
	}
	
	public double getX()
	{
		double x = ((e*d) - (b* f)) / (a * d) - (b * c) ;
		return x;
	}
	
	public double getY()
	{
		double y = ((a * f) - (e * c)) / (a * d) - (b * c) ;
		return y;
	}

	@Override
	public String toString() 
	{
		return "LinearEquation_8_11 [isSolvable()=" + isSolvable()
				+ ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
	
}
