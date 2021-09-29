//Program on Layout Manager	-	Border Layout		//Forms-Rows & Columns
import java.applet.*;
import java.awt.*;
public class Myborder extends Applet
{
	Button b1,b2,b3,b4;
	TextArea ta;							//can have multi row of characters
	public void init()
	{
		setLayout(new BorderLayout());
		b1=new Button("north");
		b2=new Button("south");
		b3=new Button("east");
		b4=new Button("west");
		
		ta=new TextArea(40,40);		//pixels
		
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add("East",b3);
		add("West",b4);
		add("Center",ta);
	}
}
//<applet code=Myborder height=500 width=600></applet>
