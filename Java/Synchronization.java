//Program3 on Threading
class syn
{
	synchronized static public void display(String s)			//'synchronized' is a keyword
	{
		try
		{
			for(int i=1;i<=3;i++)
			{
				Thread.currentThread().sleep(500);
				System.out.println(s+" "+i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("end");
		}
	}
}

class Synchronization extends Thread		//java Synchronization
{
	Synchronization(String s)				//Constructor
	{
		super(s);							//Thread(base class) named as 's'
		start();
	}
	public void run()
	{
		syn.display(Thread.currentThread().getName());			//pass the value 'String s' in display method.
	}
	public static void main(String st[])
	{
		Synchronization ch1=new Synchronization("One");
		Synchronization ch2=new Synchronization("Two");
		Synchronization ch3=new Synchronization("Three");		//'One','Two','Three' is passing the Synchronization constructor's "String s" argument.
		ch2.setPriority(Thread.MIN_PRIORITY);					//run at last, But it is not neccesary //But it is work on very slow on its processing speed
	}
}