package Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CheckDuties 
{
	public static void main(String[] args) throws IOException
	{
//		System.out.println(getCurrentDate());
		createAFile();
		
	}
	
	public static void createAFile() throws IOException
	{
//		String msg = "Enter name of the file: ";
//		String fileName = JOptionPane.showInputDialog(msg);
		File file = new File(getCurrentDate() + ".txt");
		
		if(!file.exists())
		{
			file.createNewFile();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry Sir, but you have already added information about the current date " + getCurrentDate());
			System.exit(0);
		}
		
		PrintStream fileWriter = new PrintStream(getCurrentDate() + ".txt");
		Scanner fileReader;
		double totalLearningHours = 0;
		try {
			
			fileReader = new Scanner(file);
			
			String java = JOptionPane.showInputDialog("How many hours of java do you have today?");
			fileWriter.println("Java: " + java + " hours");
			totalLearningHours += Integer.parseInt(java);
			
			String functionalProgramming = JOptionPane.showInputDialog("How many hours of functional programming do you have today?");
			fileWriter.println("Functional Programming: " + functionalProgramming + " hours");
			totalLearningHours += Integer.parseInt(functionalProgramming);
			
			String math = JOptionPane.showInputDialog("How many hours of matematics do you have today?");
			fileWriter.println("Mathematics: " + math + " hours");
			totalLearningHours += Integer.parseInt(math);
			
			String webDevelopment = JOptionPane.showInputDialog("How many hours web development do you have today?");
			fileWriter.println("Web Development : " + webDevelopment + " hours");
			totalLearningHours += Integer.parseInt(webDevelopment);
			
			String deutsch = JOptionPane.showInputDialog("Wie viele Stunden Deutsch haben Sie heute?");
			fileWriter.println("Deutsch: " + deutsch + " Stunden");
			totalLearningHours += Integer.parseInt(deutsch);
			
			String physicalDevelopment = JOptionPane.showInputDialog("How many hours physical development do you have today?");
			fileWriter.println("Physical Development : " + physicalDevelopment + " hours");
			
			
			fileWriter.println("Dear Mr. Kiril Anastasov you have " + totalLearningHours + 
					" hours of learning and " + physicalDevelopment +  " hours for physical development for "  +  getCurrentDate());
			
			
			if(totalLearningHours <= 2)
			{
				fileWriter.println("Very poor performance for " + getCurrentDate());
			}
			
			else if(totalLearningHours <= 4)
			{
				fileWriter.println("Poor performance for " + getCurrentDate() + ", but not like doing nothing at all. ");
			}
			
			else if(totalLearningHours <= 6)
			{
				fileWriter.println("Average performance for " + getCurrentDate()+ ". It is alright but you can do it much better.");
			}
			
			else if(totalLearningHours <= 8)
			{
				fileWriter.println("Good performance for " + getCurrentDate() + ". Overrall good but you can do it better tomorrow.");
			}
	
			else if(totalLearningHours >= 10)
			{
				fileWriter.println("Very well Sir, you have had an outstanding acomplishements for " + getCurrentDate() + ". You just need to keep doing the same!");
			}
			else
			{
				fileWriter.println("You are either cheating or not doing anything at all in either case it is not good!!!");
			}
	
			
			
			
			if(totalLearningHours < 6 )
			{
				File commentFile = new File("Comments for " + getCurrentDate() + ".txt");
				
				if(!commentFile.exists())
				{
					commentFile.createNewFile();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Sorry Sir, but you have already added comments about the current date " + getCurrentDate());
					System.exit(0);
				}
				PrintStream commentFileWriter = new PrintStream("Comments for " + getCurrentDate() + ".txt");
				
				String informScientist = "I am sorry to inform you but you haven't achived the minimum required working hours for the day!";
				JOptionPane.showMessageDialog(null, informScientist);
				commentFileWriter.println(informScientist);
				
				String hasRealReason = JOptionPane.showInputDialog("Was there a  serius reason for not completing you duties today?");
				if(hasRealReason.equalsIgnoreCase("yes"))
				{
					commentFileWriter.println("You are excused because you have had a serious reason for not completing you duties today.");
					String whatReasonWas = JOptionPane.showInputDialog("What was the serious reason?");
					commentFileWriter.println("Reason: " + whatReasonWas);
				}
				else
				{
					String comment = JOptionPane.showInputDialog("Why didn't you complete your duties today?");
					commentFileWriter.println("Reason: " + comment + "\n. You should be working harder and reduce " + comment +  " if you want to achieve your goals!");
					
				}
				
				
				
				
				
				
			}
			
			
			
			
//			while(fileReader.hasNextLine())
//			{
//				System.out.println(fileReader.nextLine());
//			}
			
			// close the readers and writers
//			commentFileWriter.close();
			fileReader.close();
			fileWriter.close();
		} catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NullPointerException ne) 
		{
			// TODO Auto-generated catch block
			ne.printStackTrace();
		}
		
	}
	
	public static String getCurrentDate()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date myDate = new Date();
		String stringDate = sdf.format(myDate);
		return stringDate;
//		System.out.println(sdf);
		
	}
}
