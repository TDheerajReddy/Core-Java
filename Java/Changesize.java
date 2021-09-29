//Program 2 on Threading with Applet
import java.util.*;											//for threading
import java.applet.*;										//for applets
import java.awt.*;
public class Changesize extends Applet implements Runnable		//'Runnable' interface is under java.lang package
{
	int x=16;
	Thread t1;
	Label l1;												//'t1'&'l1' both are object or reference variable
	public void init()
	{
		l1=new Label(
		"Welcome"
		);
		l1.setFont(new Font("Arial",Font.BOLD,16));
		t1=new Thread(this);								//Run current class only
		add(l1);											//Add Label on Applet Viewer
		t1.start();
	}
	public void run()
	{
		try
		{
			while(true)
			{
				Font f=new Font("Arial",Font.BOLD,x++);		//increasing font size
				l1.setFont(f);
				if(x==34)
				{
					l1.setForeground(Color.magenta);		//when font size is 34 then it turns the colour magenta 
					break;
				}
				t1.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
//<applet code=Changesize height=400 width=500></applet>
