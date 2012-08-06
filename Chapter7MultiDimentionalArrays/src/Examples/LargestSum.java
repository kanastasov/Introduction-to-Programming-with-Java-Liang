package Examples;

public class LargestSum 
{

	public static void main(String[] args) 
	{
		
		int[][] matrix = new int[10][10];
		
		
		for(int row =0; row<matrix.length; row++)
		{
			for(int col=0; col<matrix[row].length; col++)
			{
				matrix[row][col] = (int) (Math.random() * 10);
				System.out.print(matrix[row][col] + " ");
				
			}
			System.out.println();
		}
		
		
		int maxRow = 0; // current largest sum
		int indexOfMaxRow = 0;
		
		
		for(int col=0; col<matrix[0].length; col++)
		{
			
			maxRow += matrix[0][col];
			
		}
		
		for(int row =1; row<matrix.length; row++)
		{
			int totalOfThisRow = 0;
			
			for(int col=0; col<matrix[row].length; col++)
			{
				totalOfThisRow += matrix[row][col];
				
				if(totalOfThisRow > maxRow)
				{
					maxRow = totalOfThisRow;
					indexOfMaxRow = row;
					
				}
			}
		}

		
		System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
	}

}
