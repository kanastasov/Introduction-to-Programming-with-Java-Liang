package Exercises;

public class TestLinearEquation_8_11 
{
	public static void main(String[] args) 
	{
		LinearEquation_8_11 li = new LinearEquation_8_11();
		
		li.setA(5);
		li.setB(20);
		li.setC(5);
		li.setD(4);
		li.setE(49);
		li.setF(10);
		
		if(li.isSolvable())
		{
			System.out.println("x: " + li.getX() + "  " +" y: " +  li.getY());
			
		}
		
		
	}

}
