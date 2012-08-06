package ComprehensiveExersises;

public class FinacialApplicationCompoundValue_15
{
	public static void main(String[] args) 
	{
		int save = 100;
		double interestRate = 0.00417;
		double value = save * ( 1 + interestRate);
		System.out.println("1 " + value);
		for(int i=0; i<5; i++)
		{
			value = (save + value) * ( 1 + interestRate);
			System.out.println(i + 2 + " "  + value);
		}
	}
}
