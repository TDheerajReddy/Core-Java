//Extending an interface	(multi interface/inheritance)
interface intef1
{
	void method1();
	void method2();					//method calling	//methods in an interface are implicitly "public" & "abstract" automatically.
}

interface intef2 extends intef1
{
	void method3();					//method calling from interface
}

class example implements intef2		//include intef1 also	//Multiple interfaces
{
	public void method1()
	{
		System.out.println("\nImplement Method 1");
		System.out.println("The formula to find the Area of the Square is: a^2");
	}
	public void method2()
	{
		System.out.println("\nImplement Method 2");
		System.out.println("The formula to find the Area of the Triangle is: 0.5*b*h");
	}
	public void method3()
	{
		System.out.println("\nImplement Method 3");
		System.out.println("The formula to find the Area of the Rectangle is: l*b");
	}
}

class multiple
{
	public static void main(String st[])
	{
		intef2 a=new example();		//example a=new example();
		a.method1();
		a.method2();
		a.method3();
	}
}