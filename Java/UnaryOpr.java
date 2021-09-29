class UnaryOpr
{
	public static void main(String s[])
	{
		int a,b;
		a=Integer.parseInt(s[0]);					//a = 6, b = 0
		b=++a;								//a = 7, b= 7
		System.out.println("Pre Increment\n a = "+a+"\tb = "+b);
		b=a++;								//a = 8, b = 7
		System.out.println("Post Increment\n a = "+a+"\tb = "+b);
		b=--a;								//a = 7, b = 7		
		System.out.println("Pre Decrement\n a = "+a+"\tb = "+b);
		b=a--;								//a = 6, b = 7
		System.out.println("Post Decrement\n a = "+a+"\tb = "+b);
	}
}