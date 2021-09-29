class RelationalOpr
{
	public static void main(String s[])
		{
		int a,b;
		a=Integer.parseInt(s[0]);
		b=Integer.parseInt(s[1]);
		System.out.println(a+"<"+b+"="+(a<b));
		System.out.println(a+">"+b+"="+(a>b));
		System.out.println(a+"<="+b+"="+(a<=b));
		System.out.println(a+">="+b+"="+(a>=b));
		System.out.println(a+"=="+b+"="+(a==b));
		System.out.println(a+"!="+b+"="+(a!=b));
	}
}