package Exercises;

public class Patterns_4_18 
{
	public static void main(String[] args) 
	{
		
		//Patters 2
		for(int i=7; i>1; i--)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(j + " ");
				
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		// Pattern 3 
		int x = 7;
        for (int i = 1; i <= x; i++) 
        {

            for (int j = 1; j <= x - i; j++)
            {
            	System.out.print("   ");
            }
                

            for (int k = i; k >= 1; k--)
            {
            	
            	System.out.print("  " + k);
            }   

           	
                
            System.out.println();
        }	
        System.out.println();
       
       //Pattern 1  
        int y = 7;
        for (int i = 1; i <= y; i++) 
        {

            for (int k = 1; k <=i; k++)
            {
            	System.out.print("  " + k);
            }           	              
            System.out.println();
        }	
        
        //Pattern 4         
         System.out.println();
        int z = 7;
        for(int i=z; i>=1; i--)
        {
        	for (int j = 1; j <= z - i; j++)
            {
            	System.out.print("  ");
            }
                 
        	
        	for(int k=1; k<i; k++)
        	{
        		System.out.print(" " + k);
        	}
        	System.out.println();
        }
			
	}
}
