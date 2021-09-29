//Program 1 on Threading with Applet
import java.util.*;											//for threading
import java.applet.*;										//for applets
import java.awt.*;
public class MyLabel extends Applet implements Runnable		//'Runnable' interface is under java.lang package
{	//'MyLabel' is a child class of 'Applet' class
	Thread t1;
	Label l1;												//'t1'&'l1' both are object or reference variable
	public void init()
	{
		l1=new Label("Welcome");							//Label name
		l1.setFont(new Font("Arial",Font.BOLD,36));			//Label's font style
		add(l1);
		t1=new Thread(this);								//'this' is a keyword, that tells this particular thread is going to run within this class.
		t1.start();
	}
	public void run()
	{
		try
		{
			while(true)
			{
				Random r1=new Random();						//'Random' is a class
				setBackground(new Color(r1.nextInt(225),r1.nextInt(225),r1.nextInt(225)));			//RGB values randomely
				t1.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
//<applet code=MyLabel height=400 width=500></applet>
