//(b*h)/2	Triangle area
//l*w		Rectangle area
//double b,h,l,w;

abstract class shape
{
	abstract double area();
	abstract void display();
}
class Rectangle extends shape
{
	double l,w;
	Rectangle(double l, double w)
	{
		this.l=l;
		this.w=w;
	}
	double area()
	{
		return l*w;
	}
	void display()
	{
		System.out.println("\nHellow Rectangle");
	}
}
class Triangle extends shape
{
	double b,h;
	Triangle(double b, double h)
	{
		this.b=b;
		this.h=h;
	}
	double area()
	{
		return ((b*h)/2);
	}
	void display()
	{
		System.out.println("\nHellow Triangle");
	}
}
class ShapeMain
{
	public static void main(String arg[])
	{
		shape s;
		Rectangle r=new Rectangle(9,6);
		s=r;
		s.display();
		double a=s.area();
		System.out.println("Area of Rectangle: "+a);	//54.0
		
		Triangle t=new Triangle(10,6);
		s=t;
		s.display();
		a=s.area();
		System.out.println("Area of Triangle: "+a);	//30.0
	}
}