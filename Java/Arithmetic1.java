class Arithmetic1
{
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println("Add: "+(a+b));
		System.out.println("Sub: "+(a-b));
		System.out.println("Mul: "+(a*b));
		System.out.println("Div: "+(a/b));
		System.out.println("Mod: "+(a%b));
	}
}