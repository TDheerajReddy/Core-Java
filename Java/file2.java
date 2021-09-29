//List/Display files located in the Directory
import java.io.*;
public class file2
{
	public static void main(String s[])
	{
		File f1=new File(s[0]);							// E:\java
		if(f1.exists())									//if 'file exists then
		{
			if(f1.isDirectory())						//if 'f1' is a Directory
			{
				String data[]=f1.list();				//List files in 'f1' Dir.
				for(int i=0;i<data.length;i++)
				{
					System.out.println(data[i]);		//print names of the files.
				}
			}
		}
	}
}														//java file2 E:\java
