package Exersices;

public class SortingStudentsOnGrades_7_03 
{

	public static void main(String[] args) 
	{
		

		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E' ,'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E' ,'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E' ,'A', 'D'},
				{'C', 'B', 'A', 'E', 'C', 'D', 'E', 'E' ,'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E' ,'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E' ,'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E' ,'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E' ,'A', 'D'}};
		
		int[] store = new int[answers.length];
		
		char[] keys ={'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E' ,'A', 'D'};
		
		
		// grade all students
		for(int i=0; i<answers.length; i++)
		{
			//grade one student
			
			int correctCount = 0;
			
			for(int j=0; j<answers[i].length; j++)
			{
				if(answers[i][j] == keys[j])
				{
					correctCount++;
				}
			}
			store[i] = correctCount;
			System.out.println("Student " + i + "'s correct count is " + correctCount);
		}
		
		java.util.Arrays.sort(store);
		
		for(int i=0; i<store.length; i++)
		{
			System.out.println(store[i] + " ");
		}
	}

}
