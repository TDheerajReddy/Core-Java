//Program 1 on Event Handling	-	get info from keyboard and print it
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public abstract class KeyAdap extends Applet implements KeyListener
{
	int x=10,y=20;
	String msg="";
	public void init()
	{
		addKeyListener(new KeyAdapter()				
		{
			public void keyTyped(KeyEvent ke)		
			{
				msg+=ke.getKeyChar();
				repaint();							
			}
		});
		//get Characters from keys.
		//'KeyEvent' is a class implements 'KeyListener' Interface, But 'KeyListener' interface also implements 'KeyEvent' class
		//"repaint()" is going paint method interface we type
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);					//we can not edit, only type
	}
	
}

//<applet code="KeyAdap.class" height=100 width=300></applet>
