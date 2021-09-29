// Print Stream Program
import java.io.*;
class printstream
{
	public static void main(String ar[])throws Exception
	{
		PrintStream out1=new PrintStream("D:/fat.txt");						//It also file created
		System.out.println("File Created: ");
		out1.println("hai this is print stream class constructor");			//Write text in a file, it also remove all data and overwrite it
		
	}
}
