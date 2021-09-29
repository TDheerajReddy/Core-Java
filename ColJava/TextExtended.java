//Parameterized Constructor		20-10-20
class TextExtended
{
	int a,b;
	public TextExtended()
	{
		System.out.println("Default Constructor\n");
	}
	
	public TextExtended(int x,int y,int z)
	{
		System.out.println("3 int Parameterized Constructor\n");
	}
	
	public TextExtended(int x,int y)
	{
		System.out.println("2 int Parameterized Constructor\n");
		a=x;
		b=y;
	}
	
	{																//this empty block goes to Constructor of any type when we call OR creat Object.
		System.out.println("Will it Compile ?");					//it automaticall goes to all 3 "TextExtended()" constructors. 
	}
	
	public static void main(String ar[])
	{
		TextExtended p=new TextExtended();
		TextExtended q=new TextExtended(4,5);
		TextExtended r=new TextExtended(6,7,8);
		p.display();
		q.display();
		r.display();
	}
	
	public void display()
	{
		System.out.println("a = "+a+", b = "+b);
	}
}
