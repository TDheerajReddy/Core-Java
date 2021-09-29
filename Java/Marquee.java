////Program 2 Frame using Threading
import java.awt.*;
import java.awt.event.*;
public class Marquee extends Frame implements Runnable		//in this, 'Runnable' is the  part of the awt package
{
	Label l1;
	Thread t1; int x,n;
	public Marquee()
	{
		setLayout(null);
		setSize(getToolkit().getScreenSize());
		System.out.println(getToolkit().getScreenSize());
		x=0;n=10;
		
		l1=new Label("Welcome");
		l1.setFont(new Font("Monotype Corsiva",Font.PLAIN,30));
		l1.setBackground(new Color(123,234,123));
		l1.setForeground(Color.magenta);
		l1.setBounds(x,100,150,50);			//X,Y,width,hieght
		add(l1);
		t1=new Thread(this);
		t1.start();
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void run()
	{
		try
		{
			while(true)
			{
				x=x+n;			//0+10		//move 10 pixels right
				l1.setBounds(x,100,150,50);
				Thread.sleep(100);
				if(x>=824 || x<=0)
					n=n*(-1);		//-10	//Label will stop at particular point
			}
		}		//minus(-) will bring the text to the left
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String ar[])
	{
		Marquee m=new Marquee();
		m.setVisible(true);
	}
}
