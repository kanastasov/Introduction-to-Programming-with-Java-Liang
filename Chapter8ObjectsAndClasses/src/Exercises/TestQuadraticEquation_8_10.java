package Exercises;

public class TestQuadraticEquation_8_10
{

	public static void main(String[] args) 
	{

		QuadraticEquation_8_10 qua  = new QuadraticEquation_8_10();
		qua.setA(1.2);
		qua.setB(10.3);
		qua.setC(2.5);
		if(qua.getDescriminat() > 0)
		{
			System.out.println(qua.getRoot1() + " and " + qua.getRoot2());
		}
		else if(qua.getDescriminat() == 0)
		{
			System.out.println(qua.getRoot1_1());
		}
		else
		{
			System.out.println("No real roots");
		}
//		System.out.println(qua.toString());
		
		
	}

}