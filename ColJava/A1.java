//
class A1
{
	int x=10;					// Instance/non-static variable
	static int y=20;			// static variable
	void show()					// non-static method
	{
		System.out.println("Non-Static");
		System.out.println(x);
		System.out.println(y);
	}
	static void display()		// static method
	{
		A1 obj=new A1();
		System.out.println("Static");
		System.out.println(obj.x);
		//System.out.println(x);		//error: non-static variable x cannot be referenced from a static context
		System.out.println(y);
	}
}
