//Delete a File or Dir
import java.io.*;
class file4
{
	public static void main(String s[])throws IOException
	{
		File f1=new File("D:/../javaf/file4.txt");				//c:/java/file.txt
		//c:/tc
		//c:/tc/file1.c
		if(f1.exists())
		{
			System.out.println("The file Name is: "+f1.getName());
			System.out.println("The file Path is: "+f1.getPath());
			System.out.println("Absolute Path is: "+f1.getAbsolutePath());
			System.out.println(f1.length());
			System.out.println("The Parent Name is: "+f1.getParent());
			System.out.println(f1.isFile()?"File Exists":"File Not Exists");
			System.out.println(f1.isDirectory()?"Directory Exists":"Directory Not Exists");
			System.out.println(f1.canRead()?"It was a Read only file":"Not a Read only file");
			System.out.println(f1.canWrite()?"File can 'Write'":"File can 'Not Write'");
			System.out.println(f1.isHidden()?"Hidden File":"Not a Hidden File");
		}
		else
			System.out.println("The required file is not found!");	
	}
}														
