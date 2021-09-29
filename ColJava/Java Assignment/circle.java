class circle
{
	double a=15,pi=3.14;
	double area(double r)
	{
		point p=new point(r);
		double d=p.area(pi);
		return d;
	}
	
	public static void main(String arg[])
	{	circle c=new circle();
		System.out.println("Area of Circle: "+c.area(c.a));
	}
}

class point
{
	double radius;
	point(double r)
	{
		this.radius=r;
	}
	double area(double pi)
	{
		return (pi*radius*radius);
	}
}
