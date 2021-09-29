//Program 2 on Event Handling	-	KeyListener
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public abstract  class key extends Applet implements KeyListener
{
	String msg=" ";
	int x=10,y=20;
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		showStatus("Kew Down");
	}
	
	public void keyReleased(KeyEvent ke)
	{
		showStatus("Kew Up");
	}
	
	public void keyTyped(KeyEvent ke)
	{
		msg+=ke.getKeyChar();
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}
//<applet code=key width=300 height=100></applet>
