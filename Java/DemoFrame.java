//Program 1 on Frame (Default Layout	-	BorderLayout)	
import java.awt.*;			//for components
import java.awt.event.*;	//using event package for Event
public class DemoFrame extends Frame
{
	Button b1;
	TextField t1,t2;
	Label l1,l2;
	DemoFrame()							//Constructor
	{
		setSize(getToolkit().getScreenSize());		//it first take the screen size then, it set the size.
		setLayout(new FlowLayout());
		l1=new Label("Username");
		l2=new Label("Password");
		t1=new TextField(20);
		t2=new TextField(10);
		b1=new Button("Login");
		add(l1);
		add(t1);	add(l2);	add(t2);
		add(b1);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)		//to check ,the window is closing
			{
				System.out.println("Window Close");
				dispose();
				System.exit(0);
			}
		});
	}
	public static void main(String argd[])
	{
		DemoFrame df=new DemoFrame();
		df.setVisible(true);		//Frame is set Visible
		df.setSize(200,300);		//width,height
		df.setLocation(300,200);	//X axis,Y axis
	}
}