//Method OverLoading
class MethOverld
{
	int a,b,c;			//Instance Variable - Implicity Intialized to Zero(0)
	float ans;
	
	void mul()
	{
		a=10;			//b=c=0
		System.out.println("The First Method");
	}
	
	void mul(int a1,int b1)
	{
		a=a1;		//c=0
		b=b1;
		System.out.println("The Second Method");
	}
	
	void mul(int a1,int b1,int c1)
	{
		a=a1;
		b=b1;
		c=c1;
		System.out.println("The Third Method");
	}
	
	void put()
	{
		ans=a+b+c;
		System.out.println(ans);
	}
	
	public static void main(String st[])
	{
		MethOverld meth=new MethOverld();		//default
		meth.mul();
		meth.put();
		meth.mul(20,30);
		meth.put();
		meth.mul(10,20,30);
		meth.put();
	}
}
