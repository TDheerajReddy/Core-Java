// Smiley		19-05-2021
import java.applet.*;
import java.awt.*;
public class Smiley  extends Applet
{
	public void paint(Graphics g)
	{
		Font f = new Font("Helvetica", Font.BOLD,20);
		g.setFont(f);
		
		g.setColor(Color.blue);
		g.drawString("Keep Smiling",90,20);	
		
		g.setColor(Color.yellow);
		g.fillOval(60,60,200,200);
		
		g.setColor(Color.black);
		g.fillOval(100,120,20,20);
		g.fillOval(200,120,20,20);
		g.drawLine(165,125,175,175);
		g.drawLine(165,175,175,175);
		g.drawArc(110,130,95,95,0,-180);
	}
}
/* <applet code=Smiley.class width=500 height=500></applet> */