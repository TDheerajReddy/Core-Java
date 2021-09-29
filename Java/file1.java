//Create Directory
import java.io.*;
public class file1
{
	public static void main(String ar[])
	{
		File f2=new File("E:/welcome");		//'File' is a Pre-defined class
		if(f2.mkdir())
			System.out.println("Directory Created");
		else
			System.out.println("Already Exists");		
	}
}
