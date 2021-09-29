//SequenceInputStream
import java.io.*;
public class file11
{
	public static void main(String ar[])throws Exception
	{
		SequenceInputStream in=new SequenceInputStream(new FileInputStream("E:/fat.txt"), new FileInputStream("E:/first.txt"));
		SequenceInputStream sis=new SequenceInputStream(in, new FileInputStream("E:/part1.txt"));
		
		int c;
		while((c=sis.read())!=-1)				//((c=in.read())!=-1)  OR  ((c=sis.read())!=-1)
			System.out.print((char)c);
		//in.close();
		sis.close();
		
	}
}
