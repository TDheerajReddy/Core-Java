// Print Writer Program
import java.io.*;
class printwriter
{
	public static void main(String ar[])throws Exception
	{
		PrintWriter out1=new PrintWriter(System.out,true);		//This is how the PrintWriter should be passed
		out1.println("Welcome in the Windows 7");
		out1.println("Hellow");				//Write on a console(Command Prompt)
	}
}
