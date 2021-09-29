import java.io.*;
class Operator
{
	public static void main(String s[])throws Exception
	{
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Values of: ");
		System.out.println("a:");
		a=Integer.parseInt(br.readLine());
		System.out.println("b:");
		b=Integer.parseInt(br.readLine());


		// UnaryOpr
		System.out.println("\n\nUnary Operator: ");			//a = 6, b = 0
		System.out.println("\na = "+a+"\tb = "+b);
		b=++a;								//a = 7, b= 7
		System.out.println("Pre Increment\n a = "+a+"\tb = "+b);
		b=a++;								//a = 8, b = 7
		System.out.println("Post Increment\n a = "+a+"\tb = "+b);
		b=--a;								//a = 7, b = 7
		System.out.println("Pre Decrement\n a = "+a+"\tb = "+b);
		b=a--;								//a = 6, b = 7
		System.out.println("Post Decrement\n a = "+a+"\tb = "+b);


		// BitwiseOpr
		System.out.println("\n\nBitwise Operator: ");
		System.out.println("\na = "+a+"\tb = "+b);
		System.out.println(a+"&"+b+"="+(a&b));		//if both value is True(1);
		System.out.println(a+"|"+b+"="+(a|b));		//if either bit is 1
		System.out.println(a+"^"+b+"="+(a^b));		//if both bits are Different(XOR)
		System.out.println(a+"<<"+b+"="+(a<<b));	//Left Shift bit
		System.out.println(a+">>"+b+"="+(a>>b));	//Right Shift bit
		System.out.println("a = "+~a);				//Inverted the bit in "bitwise" but in "int" it just incremented by 1
		System.out.println("b = "+~b);


		// RelationalOpr
		System.out.println("\n\nRelational Operator: ");
		System.out.println("\na = "+a+"\tb = "+b);
		System.out.println(a+"<"+b+"="+(a<b));
		System.out.println(a+">"+b+"="+(a>b));
		System.out.println(a+"<="+b+"="+(a<=b));
		System.out.println(a+">="+b+"="+(a>=b));
		System.out.println(a+"=="+b+"="+(a==b));
		System.out.println(a+"!="+b+"="+(a!=b));


		// LogicalOpr
		System.out.println("\n\nLogical Operator: ");
		System.out.println("\na = "+a+"\tb = "+b);
		System.out.println("Logical AND: "+(a>b && a>=b));
		System.out.println("Logical OR: "+(a>b || a>=b));
		System.out.println("Logical NOT: "+!(a>b));
		
		// ConditionalOpr
		System.out.println("\n\nConditional Operator: ");
		System.out.println("\na = "+a+"\tb = "+b);
		c=(a>b)?a:b;
		System.out.println("Ans: "+c);
	}
}