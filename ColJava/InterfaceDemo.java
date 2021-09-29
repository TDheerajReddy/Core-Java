//Interface		23-12-20
interface Shape
{
	double area();
	void drow();
}

//Rect sub-class
class Rect implements Shape
{
	//it must overrride drow() & area() method
	double w,h;
	Rect()
	{
		w=h=1;
	}
	Rect(double w,double h)
	{
		this.w=w;
		this.h=h;
	}
	
	public double area()
	{
		return w*h;
	}
	public void drow()
	{
		System.out.println("Hellow Rect");
	}
}

//Circle sub-class
class Circle implements Shape
{
	//it must overrride drow() & area() method
	double r;
	Circle()
	{
		r=1;
	}
	Circle(double r)
	{
		this.r=r;
	}
	
	public double area()
	{
		return 3.14*r*r;
	}
	public void drow()
	{
		System.out.println("Hellow Circle");
	}
}

//main Class
class InterfaceDemo
{
	public static void main(String args[])
	{
		Shape p;
		Rect r1=new Rect(5,4);
		Circle c1=new Circle(10);
		
		double c,d;
		
		//System.out.println("\n"+r1);
		p=r1;				//up-casting
		c=p.area();
		System.out.println(c);
		p.drow();
		
		//System.out.println("\n"+c1);
		p=c1;				//up-casting
		p.drow();
		d=p.area();
		System.out.println(d);
		
	}
}
/*
Output
20.0
Hellow Rect
Hellow Circle
314.0
*/