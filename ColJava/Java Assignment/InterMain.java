interface Interf1
{
	double pi=3.14;
}
interface Interf2
{
	void display();
}
class Circle implements Interf1,Interf2
{
	public void display()
	{
		System.out.println("Interf1: "+Interf1.pi);
		System.out.println("Hellow Interf2");
	}
}

class InterMain
{
	public static void main(String arg[])
	{
		Interf2 i2;
		Circle c=new Circle();
		i2=c;
		i2.display();
	}
}