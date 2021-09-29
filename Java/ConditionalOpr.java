import java.util.Scanner;
class ConditionalOpr
{
	public static void main(String s[])
	{
		int a,b,c;
		a=Integer.parseInt(s[0]);
		b=Integer.parseInt(s[1]);
		c=(a>b)?a:b;
		System.out.println("Ans: "+c);
	}
}