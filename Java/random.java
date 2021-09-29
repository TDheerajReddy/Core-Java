//Random Acce File
import java.io.*;
public class random
{
	public static void main(String ar[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		RandomAccessFile raf1=new RandomAccessFile("file2.txt","rw");			//checking a file with Read/Write permissions
		byte b[];
		System.out.println("Enter the contents of the file");
		String s=br.readLine();
		do
		{
			b=s.getBytes();
			raf1.write(b);		//right to left
			s=br.readLine();
		}
		while(!s.equalsIgnoreCase("Exit"));
		System.out.println("File Created");
		System.out.println("Reading from the file:-");
		raf1.seek(0);			//start reading a file from '0'(first)
		byte b1[]=new byte[(int)raf1.length()];
		raf1.read(b1);
		for(int i=0;i<b1.length;i++)
		{
			System.out.print((char)b1[i]);
		}
	}
}
// "seek(0)" method is reading a file which comes under the RandomAccesFile.
// Existing file data to be erased from '0' to where you stopped writting. And overwrite data from '0'.