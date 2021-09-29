//Interface Program 1
interface inter
{
	public abstract void getdata();		//"public abstract void getdata()" is by default, we can simply use	'void getdata()' also
	public static final int a=1;		//"public static final int a=1;" is by default, we can simply type/use	'int a=1;'
}

class impl implements inter
{
	public void getdata()
	{
		System.out.println("Method for getting data");
	}
	void display()
	{
		//a++;							//error: can't assign value to final variable a
		System.out.println("Value of a: "+a);
	}
}

class interref
{
	public static void main(String sr[])
	{
		//impl i=new impl();
		//i.getdata();
		//i.display();
		inter r;			//obj for interface 'inter'
		r=new impl();		//refference	
		r.getdata();
		((impl)r).display();	//down casting___runtime
		
	}
}