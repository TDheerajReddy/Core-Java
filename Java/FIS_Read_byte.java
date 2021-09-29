//Sample Program on Read using Byte
import java.io.*;
class FIS_Read_byte
{
	public static void main(String ar[])throws Exception
	{
		int i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter File name with Extension:- ");
		FileInputStream f=new FileInputStream(br.readLine());
		byte b[]=new byte[f.available()];								//file Available or Not
		f.read(b);														//left to rigth
	
		for(i=0;i<b.length;i++)
		{
			System.out.print((char)b[i]);
		}
		
		/*	String s=new string(b,0,b.length());
			System.out.println(s);
		*/
	}
}		//D:/first.txt
