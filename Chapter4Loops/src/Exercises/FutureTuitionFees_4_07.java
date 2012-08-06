package Exercises;

public class FutureTuitionFees_4_07 
{
	public static void main(String[] args) 
	{
		double tutionFee = 10000;
		double sum = tutionFee;
		double increase = 0;
		double sum2 = 0;
		
		System.out.println("Year:" + 1 + " " + sum);
		for(int i=1; i<10; i++)
		{
			increase += sum * 0.05;
			sum = increase + tutionFee;
			System.out.println("Year:" + (i + 1) + " " + sum);
			sum2 += sum;
			if(i == 4)
			{
				System.out.println( "\n" + "The total sum you need to pay for four years is: " + (sum2 - increase) + "\n");

			}
				
			//stackoverflow
		}
	}

}
