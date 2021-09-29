//28-04-21
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("MyThread started....");
		for(int i=0;i<10;i++)
		{
			System.out.println("MyThread: "+i);
		}
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("MyThread Exiting");
	}
}

class MainThread
{
	public static void main(String arg[])
	{
		System.out.println("MainThread started..");
		MyThread mt=new MyThread();
		mt.start();		//Responsible for calling "run()" method
		for(int i=10;i>0;i--)
		{
			System.out.println("MainThread: "+i);
		}
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("MainThread Exiting");
	}
}