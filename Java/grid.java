//Program on Layout Manager	-	Grid Layout		//Forms-Rows & Columns
import java.applet.*;
import java.awt.*;
public class grid extends Applet
{
	Button b1,b2,b3,b4;
	public void init()
	{
		setLayout(new GridLayout());
		b1=new Button("One");
		b2=new Button("Two");
		b3=new Button("Three");
		b4=new Button("Four");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
}
//<applet code=grid height=500 width=600></applet>
