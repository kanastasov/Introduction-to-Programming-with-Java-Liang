package comprehensive;

import javax.swing.JOptionPane;

public class GuessingTheCapitals_9_22 
{
	public static void main(String[] args) 
	{
		String[][] matrix = {
				{"France", "Paris"},
				{"England", "London"},
				{"Wales", "Cardiff"},
				{"Scotland", "Edinburg"},
				{"Ireland", "Dublin"},
				{"Romania", "Bucharest"},
				{"Macedonia", "Skopie"},
				{"Hundary", "Budapest"}};
		int correctAnsw = 0;
		String txt = "What is the capital of ";
		for(int i=0; i<matrix.length; i++)
		{
			String message = JOptionPane.showInputDialog(txt +  matrix[i][0]);
			
				if(message.equalsIgnoreCase(matrix[i][1]))
				{
					JOptionPane.showMessageDialog(null, "Your answer is correct");
					correctAnsw++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Your answer is wrong");	
				}
					
			}
		
		JOptionPane.showMessageDialog(null, "The correct answers are: " + correctAnsw);
		}
		
		
	

}
