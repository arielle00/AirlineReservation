import javax.swing.*;

public class WindowUtilities 
{
	public static void setNativeLookAndFeel() 
	{
		try
		{
                    //set the application's gui look and feel to cross platform also called 'Metal
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}
                //handle exception
                catch(Exception e)
		{
			System.out.println("Error setting native LAF: " + e);
		}
	}
}

