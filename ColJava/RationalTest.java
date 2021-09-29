// call by reference		11-11-20
class Rational
{
	int p,q;
	public Rational()
	{
	}
	public Rational(int a,int b)
	{
		p=a;	//2
		q=b;	//3
		
	}
	public void display()
	{
		System.out.println(p+"\t"+q);
	}
	public Rational add(Rational x)
	{
		Rational y=new Rational();
		y.p=p*x.q + q*x.p;			//2*5 + 3*4	= 22
		y.q=q*x.q;					//3*5 =15
		return(y);
	}
}

class RationalTest
{
	public static void main(String ar[])
	{
		Rational r=new Rational(2,3);
		Rational s=new Rational(4,5);
		System.out.println("Rational R & S");
		Rational t;			//reference only
		t=r.add(s);
		t.display();
	}
}
