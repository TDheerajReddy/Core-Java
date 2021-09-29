// Graphics method examples		19-05-2021
import java.applet.*;
import java.awt.*;
public class GraphicsDemo extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawString("Dheeraj",50,50);
		g.drawLine(20,30,40,250);
		g.drawRect(70,100,30,30);
		
		g.setColor(Color.blue);
		g.fillRect(170,100,30,30);	//y axis is same as campare to above rectangle
		g.drawOval(70,200,30,40);	//x axis is same as campare to above rectangle
		
		g.setColor(Color.green);
		g.fillOval(170,150,30,30);
		g.drawArc(90,150,30,30,30,250);
		g.fillArc(270,150,30,30,0,150);
	}
}
/* <applet code=GraphicsDemo.class width=500 height=500></applet> */