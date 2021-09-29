//Program on Layout Manager	-	Card Layout
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class CardDemo extends Applet implements ActionListener		//'ActionListener' is a Interface , which will listen to information/action/data/command from the Button
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Panel p1,p2,c1,c2,c3;					//Card in the form of pannels.	Buttons placed in the pannels and pannels will contain info
	CardLayout cd;
	public void init()
	{
		setLayout(new BorderLayout());
		b1=new Button("One");
		b2=new Button("Two");
		b3=new Button("Three");
		b4=new Button("Four");
		b5=new Button("Five");
		b6=new Button("Six");
		b7=new Button("Card1");
		b8=new Button("Card2");
		b9=new Button("Card3");
		
		p1=new Panel();
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		
		p2=new Panel();
		cd=new CardLayout();
		p2.setLayout(cd);				//set pannel2's layout as CardLayout
		
		c1=new Panel();
		c1.setBackground(Color.red);
		c1.add(b1);
		c1.add(b2);
		p2.add("Card1",c1);				//c1 Text names as 'Card1'	//c1 is a pannel	//pannel inside pannel
		
		c2=new Panel();
		c2.setBackground(Color.cyan);
		c2.add(b3);
		c2.add(b4);
		p2.add("Card2",c2);				//pannel inside multiple pannels (c1,c2,c3)
		
		c3=new Panel();
		c3.setBackground(Color.blue);
		c3.add(b5);
		c3.add(b6);
		p2.add("Card3",c3);
		
		add(p1,"West");
		add(p2,"Center");
		b7.addActionListener(this);		//add 'ActionListener' to the b7,b8 & b9 Buttons to perform actions
		b8.addActionListener(this);
		b9.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)			//'actionPerformed' is a predefined method	//'ActionEvent' is a class
	{
		if(ae.getSource()==b7)
			cd.show(p2,"Card1");
		else if(ae.getSource()==b8)
			cd.show(p2,"Card2");
		else
			cd.show(p2,"Card3");
	}
		
}
//<applet code=CardDemo height=300 width=400></applet>
