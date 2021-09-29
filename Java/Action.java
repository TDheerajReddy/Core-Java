//Program 3 on Event Handling	-	ActionListener Interface
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Action extends Applet implements ActionListener
{
	Button b1,b2;
	TextField t1,t2,t3;
	public void init()
	{
		t1=new TextField(25);
		t2=new TextField(25);
		t3=new TextField(25);
		b1=new Button("Add");
		b2=new Button("Sub");
		
		add(t1);		add(t2);
		add(b1);		add(b2);
				add(t3);
				
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		int c;
		if(ae.getSource()==b1)		//==Add
			c=a+b;
		else
			c=a-b;
		t3.setText(String.valueOf(c));
	}
}
//<applet code=Action width=500 height=600></applet>
