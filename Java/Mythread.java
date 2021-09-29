//Program2 on Threading
class Mythread extends Thread	//from Mythread the base class is a Thread class
{
	Mythread()				//Constructor
	{
		super("Child");		//super keyword:- it just calls the Base class(Thread) and rename as a 'Child'
		start();			//start the thread
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName()+" : "+i);
				Thread.sleep(500);		//here '500' is the miliseconds
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String s[])throws Exception
	{
		Mythread m1=new Mythread();
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
			Thread.sleep(1000);
		}
		//m1.start();
	}
}

//what we introduce:- is a for loop, even the for loop can be broken and another thread can be introduced by the Thread class