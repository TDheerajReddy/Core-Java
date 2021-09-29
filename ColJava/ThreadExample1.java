//27-04-2021
class ThreadExample1
{
	public static void main(String ar[])
	{
		// "main()" method is also a thread
		Thread t=Thread.currentThread();
		System.out.println(t.getName() +"\t"+ t.getPriority());
		System.out.println("Change the Name & Priority of the Thread");
		t.setName("myThread");
		t.setPriority(3);
		System.out.println("Sleep the Thread for 5 sec.");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("After changing the Name & Priority");
		System.out.println(t.getName() +"\t"+ t.getPriority());
	}
}
