//Program 1 Frame using Threading
import java.util.*;				//for 'nextInt'
import java.awt.*;
import java.awt.event.*;
public class square extends Frame implements Runnable
{
	Thread t1;
	Label l1,l2,l3;
	public square()							//Constructor
	{
		//setLayout(new FlowLayout());
		setLayout(new GridLayout(1,3,10,10));	//row,column,Hgap,Vgap
		setSize(getToolkit().getScreenSize());
		setForeground(Color.white);			//Font Colour
		setFont(new Font("Ariel",Font.BOLD,23));
		
		l1=new Label(" Red ");	add(l1);
		l1.setBackground(Color.red);
		
		l2=new Label(" Green ");	add(l2);
		l2.setBackground(Color.green);
		
		l3=new Label(" Blue ");	add(l3);
		l3.setBackground(Color.blue);
		
		t1=new Thread(this);
		t1.start();
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent ae)
			{
				dispose();
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
				Random r=new Random();
				
				l1.setBackground(new Color(r.nextInt(255),0,0));
				l2.setBackground(new Color(0,r.nextInt(255),0));
				l3.setBackground(new Color(0,0,r.nextInt(255)));
				t1.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String ar[])
	{
		square c=new square();
		c.show();							//Showing the Frame
	}
}