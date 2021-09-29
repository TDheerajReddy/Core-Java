//05-05-21	Creating Multiple Thread
class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("MyThread 1 Started....");
		for(int i=0;i<10;i++)
		{
			System.out.println("MyThread 1: "+i);
		
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("MyThread 1 Exiting");
	}
}

class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("MyThread 2 Started....");
		for(int i=0;i<10;i++)
		{
			System.out.println("MyThread 2: "+i);
		
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("MyThread 2 Exiting");
	}
}

class MyThread3 extends Thread
{
	public void run()
	{
		System.out.println("MyThread 3 Started....");
		for(int i=0;i<10;i++)
		{
			System.out.println("MyThread 3: "+i);
		
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("MyThread 3 Exiting");
	}
}
class MainThreadMor
{
	public static void main(String arg[])
	{
		//"main()" method is also a thread
		System.out.println("MainThreadMor Started..");
		
		MyThread1 mt1=new MyThread1();
		MyThread2 mt2=new MyThread2();
		MyThread3 mt3=new MyThread3();
		mt1.start();
		mt2.start();
		mt3.start();
		
		System.out.println("MainThreadMor Exiting");
	}
}