//Sample Program on Write using a Char
import java.io.*;
public class FOS_Write_Char
{
	public static void main(String ar[])throws Exception
	{
		FileOutputStream out=new FileOutputStream("D:/part1.txt");		//created if not exist
		int c;
		System.out.println("Enter the data and Type '$' to terminate:- ");
		while((c=System.in.read())!='$')
			out.write(c);												//it Write as a char
		
		out.close();
		
	}
}
