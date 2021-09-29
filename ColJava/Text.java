//Parameterized Constructor		20-10-20
class Text
{
	int a;
	public Text(int x)
	{
		a=x;
	}
	{																//this empty block goes to Constructor of any type when we call OR creat Object.
		System.out.println("Will it Compile.....????");				//it automaticall goes to "Text()" constructor.
	}
	
	public static void main(String ar[])
	{
		Text p=new Text(7);
		Text q=new Text(8);
		Text r=new Text(8);
		p.display();
		q.display();
	}
	
	public void display()
	{
		System.out.println("a = "+a);
	}
}
