//05-05-21
class MyThreadImp implements Runnable
{
	public void run()
	{
		System.out.println("MyThreadImp Started....");
		for(int i=0;i<10;i++)
		{
			System.out.println("MyThreadImp: "+i);
		
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("MyThreadImp Exiting");
	}
}

class MainThreadImp
{
	public static void main(String arg[])
	{
		//"main()" method is also a thread
		System.out.println("MainThreadImp Started..");
		MyThreadImp mt=new MyThreadImp();
		Thread t1=new Thread(mt);
		t1.start();			//Responsible for calling "run()" method
		for(int i=10;i>0;i--)
		{
			System.out.println("MainThreadImp: "+i);
		
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("MainThreadImp Exiting");
	}
}