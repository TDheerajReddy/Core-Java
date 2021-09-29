//Else-If Statement
import java.io.*;
class ElseIf
{
	public static void main(String p[])throws Exception
	{
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the Character");
		char c=(char)dis.read();
		if(c>='0' && c<='9')					//Identify the Character Program
		System.out.println("Number");
		else if(c>='a' &&c<='z')
		System.out.println("Lowercase");
		else
		System.out.println("Uppercase");
	}
}