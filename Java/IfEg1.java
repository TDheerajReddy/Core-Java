//If Statements
import java.io.*;
class IfEg1
{
	public static void main(String ar[])throws Exception
	{
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter a Character");
		char c=(char)dis.read();
		if(c>='a' && c<='z')
		System.out.println("Lowercase");
	}
}