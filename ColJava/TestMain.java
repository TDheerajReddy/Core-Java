//Static Binding & Dynamic Binding		25-11-20		Overriding
class TestA
{
	public void display()
	{
		System.out.println("Display A");
	}
}
class TestB extends TestA
{
	public void display()
	{
		System.out.println("Display B");
	}
}
class TestC extends TestB
{
	public void display()
	{
		System.out.println("Display C");
	}
}
	
class TestMain
{
	public static void main(String ar[])
	{
		TestA x=new TestA();
		TestB y=new TestB();
		TestC z=new TestC();
		//x.display();				//Static Bindig
		
		//callMe(x);				//Dynamic Binding //error: error: incompatible types: TestA cannot be converted to TestB
		callMe(y);
		callMe(z);
	}
	
	public static void callMe(TestB p)
	{
		p.display();
	}
}

/*	
	*'new' keyword - Allocate memory at Runt-time.
	*Method body execute at Run-time.
	*Deside Run-time which object is passed.
*/
