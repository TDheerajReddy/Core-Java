//Program1 on Threading
import java.io.*;
class fatthread
{
	public static void main(String j[])throws Exception
	{
		five f=new five();			//These class is sub-classes of Thread class
		ten t=new ten();			//These class is sub-classes of Thread class
		thirteen t3=new thirteen();	//These class is sub-classes of Thread class
		f.start();
		t.start();
		t3.start();					//It goes randamely enter in the CPU & give the Unsequential answer(Random ans)
	}
}

class five extends Thread			//here Thread is a base class	//Thread is a Pre-define Class under the java.lang package	//& java.lang package is automatically imported
{
	public void run()				//void run is a method in Thread class
	{
		for(int i=1;i<=5;i++)
			System.out.println(i+" Fives are "+i*5);
	}
}

class ten extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(i+" Tens are "+i*10);
	}
}

class thirteen extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(i+" Thirteens are "+i*13);
	}
}