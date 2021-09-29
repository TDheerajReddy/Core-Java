//14-10-20
class Box
{
	int a;			//default value is 0
	boolean b; 
	char c;
	double d;
	String s;
	public static void main(String args[])
	{
		Box B=new Box();
		System.out.println("Int: "+B.a);
		System.out.println("Boolean: "+B.b);
		System.out.println("Char: "+B.c);		// in char null(0) value is white space
		System.out.println("Double: "+B.d);
		System.out.println("String: "+B.s);		//in string 0 value is = null
	}
}
