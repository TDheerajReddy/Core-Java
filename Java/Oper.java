class Oper		//Operator
{
	float a,b;

	void Add(char c)
	{ System.out.println(a+""+c+""+b+"="+(a+b)); }
	
	void Sub(char c)
	{ System.out.println(a+""+c+""+b+"="+(a-b)); }
	
	void Mul(char c)
	{ System.out.println(a+""+c+""+b+"="+(a*b)); }
	
	void Div(char c)
	{ System.out.println(a+""+c+""+b+"="+(a/b)); }
	
	void GetNumber(float x,float y)
	{	
		a=x;
		b=y;
	}

	public static void main(String ar[])
	{
		Oper obj=new Oper();
		obj.GetNumber(12,23);
		obj.Add('+');
		obj.Sub('-');
		obj.Mul('*');
		obj.Div('/');
	}
}