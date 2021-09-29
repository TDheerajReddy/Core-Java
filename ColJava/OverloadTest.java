//Method Overloading(Polimorphism)		3-11-20
class AbcaOverl
{
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
}

class OverloadTest	
{
	public static void main(String ar[])
	{
		AbcaOverl ao=new AbcaOverl();
		int x=10,y=20,z,w;
		z=ao.add(x,y);
		System.out.println(z);		//30
		
		double d=10.5,e=20.6,g;
		g=ao.add(d,e);
		System.out.println(g);		//31.1
		
		w=30;
		z=ao.add(x,y,w);
		System.out.println(z);		//60
	}
}
