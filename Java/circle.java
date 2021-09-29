//Program 3 on Threading with Applet
import java.util.*;											//for threading
import java.applet.*;										//for applets
import java.awt.*;
import java.awt.event.*;									//'event' - perform action(eg- click)
public class circle extends Applet implements Runnable
{
	int r,gr,b;
	Thread t1;
	public void init()
	{
		t1=new Thread(this);								//Run current class only
		t1.start();
	}
	public void run()
	{
		try
		{
			while(true)
			{
				Random ra=new Random();
				r=ra.nextInt(225);
				gr=ra.nextInt(225);
				b=ra.nextInt(225);							//initialized Random Colors
				repaint();
				t1.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void paint(Graphics g)
	{
		g.setColor(new Color(r,0,0));					//set colour for r
		g.fillOval(120,100,80,80);						//fill oval/circle with colour
		g.setColor(new Color(0,gr,0));
		g.fillOval(220,100,80,80);
		g.setColor(new Color(0,0,b));
		g.fillOval(320,100,80,80);						//3 circles and 3 colours
	}
}
//<applet code=circle height=400 width=500></applet>
