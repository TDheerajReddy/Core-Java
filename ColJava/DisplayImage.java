// Display Image		19-05-2021
import java.applet.*;
import java.awt.*;
public class DisplayImage  extends Applet
{
	Image pic;
	public void init()
	{
		pic = getImage(getDocumentBase(),"Vicky.jpg");
	}
	public void paint(Graphics g)
	{
		g.drawImage(pic, 30, 30, this);
	}
}
/* <applet code=DisplayImage.class width=500 height=500></applet> */