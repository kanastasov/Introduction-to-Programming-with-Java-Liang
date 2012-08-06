package Exercises;

public class TestFan_8_08 
{

	public static void main(String[] args) 
	{
		Fan_8_08 myFan1 = new Fan_8_08();
		myFan1.setSpeed(myFan1.FAST);
		myFan1.setRadius(10);
		myFan1.setColor("Yellow");
		myFan1.setOn(true);
		System.out.println(myFan1.toString());
		
		System.out.println();
		Fan_8_08 myFan2 = new Fan_8_08();
		myFan2.setSpeed(myFan2.MEDIUM);
		myFan2.setRadius(5);
		myFan2.setColor("Blue");
		myFan2.setOn(false);
		System.out.println(myFan2.toString());
		

	}

}
