//25-5-21	With Synchronization Block
class Table
{
	void printTable(int n)
	{	synchronized(this)
		{							//Synchronized Block
			for(int i=1;i<=10;i++)
			{
				System.out.println(n*i);
				try{Thread.sleep(500);}catch(Exception e){System.out.println(e);}
			}
		}
	}
}

class Threading1 extends Thread
{
	Table t;
	Threading1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);	//Table of 5, 5 = n
	}
}

class Threading2 extends Thread
{
	Table t;
	Threading2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(10);	//Table of 10, 10 = n
	}
}

class ThreadWithSyn2
{
	public static void main(String arg[])
	{
		Table obj = new Table();		//only one object
		Threading1 t1 = new Threading1(obj);
		Threading2 t2 = new Threading2(obj);
		t1.start();
		t2.start();
	}
}