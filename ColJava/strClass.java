//String
class strClass
{
	public static void main(String ar[])
	{
		String p="this is computer";
		int a,b,c,d;
		a=p.indexOf('s');
		b=p.indexOf('s',7);
		c=p.indexOf("is");
		d=p.indexOf("is",3);
		System.out.println(a+", "+b+", "+c+", "+d);
	}
}
