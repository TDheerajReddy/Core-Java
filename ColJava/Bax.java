//26-10-20
class Bax
{
	double w,h,l;
	Bax()
	{
	}
	Bax(double a,double b,double c)
	{
		w=a;
		h=b;
		l=c;
	}
	double area()
	{
		return 2*(w*h*l+l+w);
	}
	double volume()
	{
		return w*h*l;
	}
}
