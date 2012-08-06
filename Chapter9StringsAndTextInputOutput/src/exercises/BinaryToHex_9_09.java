package exercises;

public class BinaryToHex_9_09 
{
	public static void main(String[] args) 
	{
		String binary = "1111011";
		binaryToHex(binary);
		//38d
	}
	
	public static void binaryToHex(String binaryValue)
	{
		StringBuilder sb = new StringBuilder(binaryValue);
		
		System.out.println("Original StringBuilder: " + sb);
		sb.reverse();
		
		System.out.println("reversed StringBuilder: " + sb);
		
		int convert = binaryValue.length();
		System.out.println("Legth of the binary: " +  convert);
		
		if(convert % 4 != 0)
		{
			while(convert % 4 != 0)
			{
				
				
				sb.append(0);
				convert ++;
				
				System.out.println("StringBuilder in loop: " + sb);
				System.out.println("Convert in loop: " + convert);
			}
		}
		sb.reverse();
		System.out.println("Ready StringBuilder for use? " + sb);
		String test = null;
//		String test = sb.toString();
		for(int i=0; i<sb.length(); i ++)
		{
			if(i % 4 == 0)
			{
				test = sb.substring(i, (i+4));
				System.out.print(getChar(test));
			}
		}
	}
	
	public static String getChar(String num)
	{
		String number = "";
		switch(num)
		{
			case "0000" : number = "0"; break;
			case "0001" : number = "1"; break;
			case "0010" : number = "2"; break;
			case "0011" : number = "3"; break;
			case "0100" : number = "4"; break;
			case "0101" : number = "5"; break;
			case "0110" : number = "6"; break;
			case "0111" : number = "7"; break;
			case "1000" : number = "8"; break;
			case "1001" : number = "9"; break;
			case "1010" : number = "A"; break;
			case "1011" : number = "B"; break;
			case "1100" : number = "C"; break;
			case "1101" : number = "D"; break;
			case "1110" : number = "E"; break;
			case "1111" : number = "F"; break;
			
		}
		return number;
	}

}
