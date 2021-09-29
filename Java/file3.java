//Delete a File or Dir
import java.io.*;
public class file3
{
	public static void main(String s[])
	{
		String na=s[0];
		File f1=new File(na);
		if(f1.exists())
		{
			if(f1.delete())
				System.out.println("File Deleted");
			else
				System.out.println("File was not Deleted");			//it only deletes empty Dir or single files
		}
		else
			System.out.println("File does not Exists");
	
	}
}														
