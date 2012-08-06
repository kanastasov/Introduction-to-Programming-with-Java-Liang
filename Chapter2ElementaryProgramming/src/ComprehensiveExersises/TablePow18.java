package ComprehensiveExersises;

public class TablePow18 
{
	public static void main(String[] args) 
	{
		System.out.println("a	b	pow(a, b)");
		for(int a = 1, b = 2; a < 6; a++, b++)
		{
			System.out.println(a +"	"	+b + "	"	+	Math.pow(a, b));
		}
	}

}
