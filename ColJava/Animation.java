// Animation example		19-05-2021
import java.applet.*;
import java.awt.*;
public class Animation  extends Applet
{
	Image pic;
	public void init()
	{
		pic = getImage(getDocumentBase(),"bike.jpg");
	}
	public void paint(Graphics g)
	{
		for(int i=0;i<500;i++)
		{
			g.drawImage(pic, i, 30, this);
			
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e){}
		}
	}
}
/* <applet code=Animation.class width=500 height=500></applet> */