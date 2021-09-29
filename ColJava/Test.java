//Static Binding		23-11-20
class Test
{
	public void display()
	{
		System.out.println("\nIt is a normal display method");
	}
	public void display(String msg)
	{
		System.out.println("\n"+msg);
	}
	
	public static void main(String ar[])
	{
		Test t=new Test();
		t.display();					//Static Binding
		t.display("Hellow Java");		//Static Binding
	}
}
