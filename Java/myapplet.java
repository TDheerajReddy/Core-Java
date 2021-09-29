//Program 2 on Applet
import java.applet.*;
import java.awt.*;
public class myapplet extends Applet
{
	public void init()
	{
		setBackground(Color.blue);
		System.out.println("Applet Initialized");			//it is print on the console(cmd) not on appletviewer
	}
	public void start()
	{
		System.out.println("Applet Start");
	}
	public void stop()
	{
		System.out.println("Applet Stop");
	}
	public void destroy()
	{
		System.out.println("Applet Destroyed");
	}
	public void paint(Graphics g)				//'Graphics' is a class & 'g' is the object for 'Graphics' class
	{
		g.drawString("Welcome",150,150);		//x axis, y axis
	}
}
//<applet code=myapplet height=400 width=500></applet>
