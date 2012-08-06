package Exercise3dot11To3dot20;


import javax.swing.JOptionPane;

public class WindChillTemperature_20 
{
	public static void main(String[] args) 
	{
		
		String temp = JOptionPane.showInputDialog(null,"Enter the temperature in Farenheit: " );
		
		
		double farenheit = Double.parseDouble(temp);
		if((farenheit < -58) || (farenheit > 41))
		{
			JOptionPane.showMessageDialog(null, "Invalid data for temperature, it must be between -58 and 41");
			System.exit(0);
		}
		
		
		String enter = JOptionPane.showInputDialog(null,"Enter the wind speed miles per hour: ");
		double windSpeed = Double.parseDouble(enter);
		if(windSpeed < 2)
		{
			JOptionPane.showMessageDialog(null, "The wind speed must be equal of greater than 2");
			System.exit(0);
		}
		
		double index = 35.74 + (0.615 * farenheit) - (35.75 *  Math.pow(windSpeed, 0.16)) +
				(0.4275 * farenheit) * Math.pow(windSpeed, 0.16);
		
		JOptionPane.showMessageDialog(null,"The wind chill index is: " + index  );
//		System.out.println("The wind chill index is: " + index  );
	}

}
