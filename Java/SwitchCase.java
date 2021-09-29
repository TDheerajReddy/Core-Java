import java.io.*;
class SwitchCase
{
	public static void main(String ar[])throws Exception
	{
		char choice;
		int a,b;
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter your values for a & b");
		a=Integer.parseInt(d.readLine());
		b=Integer.parseInt(d.readLine());
		System.out.println("Enter Symbols for choice");
		choice=(char)d.read();
		switch(choice)
		{
			case'+':
			System.out.println("Sum: "+(a+b));
			break;
			
			case'-':
			System.out.println("Sub: "+(a-b));
			break;
			
			case'*':
			System.out.println("Mul: "+(a*b));
			break;
			
			case'/':
			System.out.println("Div: "+(a/b));
			break;
			
			case'%':
			System.out.println("Mod: "+(a%b));
			break;
			
			default:
			System.out.println("Invalid Choice!");
		}
	}
}	