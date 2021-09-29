//Sample Program on Read using a Char
import java.io.*;
public class FIS_Read_Char
{
	public static void main(String ar[])throws Exception
	{
		int c;
		System.out.println("Read the Data:- ");
		FileInputStream in=new FileInputStream("D:/part1.txt");
		while((c=in.read())!=-1)
			System.out.print((char)c);
		
	}
}
