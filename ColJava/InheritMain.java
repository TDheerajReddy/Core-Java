//Inheritance		28-10-20
class InheritMain
{
	public static void main(String ar[])
	{
		Abca a = new Abca();
		Bbca b = new Bbca();
		Cbca c = new Cbca();
		
		//System.out.println(a.x);	// not printed and error gives, because it is a 'private' Access Modifier
		
		System.out.println("\nTry to get data member of Object 'a'...............");
		System.out.println(a.y);
		System.out.println(a.z);
		System.out.println(a.w);
		
		System.out.println("\nTry to get data member of Object 'b'...............");
		System.out.println(b.y);
		System.out.println(b.z);
		System.out.println(b.w);
		
		System.out.println("\nTry to get data member of Object 'c'...............");
		System.out.println(c.y);	//20
		System.out.println(c.z);	//30
		System.out.println(c.w);	//40
		System.out.println(c.x1);	//50
	}
}
