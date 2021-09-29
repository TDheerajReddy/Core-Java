class BitwiseOpr
{
	public static void main(String s[])
	{
		int a,b;
		a=Integer.parseInt(s[0]);
		b=Integer.parseInt(s[1]);
		System.out.println(a+"&"+b+"="+(a&b));		//if both value is True(1);
		System.out.println(a+"|"+b+"="+(a|b));		//if either bit is 1
		System.out.println(a+"^"+b+"="+(a^b));		//if both bits are Different(XOR)
		System.out.println(a+"<<"+b+"="+(a<<b));	//Left Shift bit
		System.out.println(a+">>"+b+"="+(a>>b));	//Right Shift bit
		System.out.println(~a);				//Inverted the bit in "bitwise" but in "int" it just incremented by 1
	}
}