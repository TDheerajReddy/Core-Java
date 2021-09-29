//Beep sound
import java.util.*;
import java.awt.*;
class Beep
{
	public static void main(String ar[])
	{
		int a=7;
		char bp=(char)a;
		for(a=1;a<=10;a++)
		{
			System.out.println("bp"+bp);
			Toolkit.getDefaultToolkit().beep();
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
