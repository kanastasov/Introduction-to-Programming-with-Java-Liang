package exercises;

import java.util.*;
import java.io.*;

public class ReformattingJavaSourceCode_9_16 
{

	
	  /**Main method*/
	  public static void main(String[] args) throws Exception
	  {
	    // Check command line parameter usage
	    if (args.length != 1) 
	    {
	      System.out.println(
	        "Usage: java Exercise9_16 filename");
	      System.exit(0);
	    }

	    // Check if source file exists
	    File sourceFile = new File(args[0]);
	    if (!sourceFile.exists()) 
	    {
	       System.out.println("Source file " + args[0] + " not exist");
	       System.exit(0);
	    }

	    StringBuilder buffer = new StringBuilder();
	    Scanner input = new Scanner(sourceFile);

	    while (input.hasNext())
	    {
	      String s = input.nextLine();
	      String s1 = s.trim();
	      if (s1.charAt(0) == '{') 
	      {
	        buffer.append(" {");
	        if (s1.length() > 1) 
		        buffer.append("\r\n" + s.replace('{', ' '));
	      }
	      else
	        buffer.append("\r\n" + s);
	    }

	    input.close();

	    // Write buffer into the file
	    PrintWriter output = new PrintWriter(sourceFile);
	    output.print(buffer.toString());
	    output.close();
	  }
	}


