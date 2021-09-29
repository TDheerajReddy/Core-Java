//Sample Program on Read using Byte
import java.io.*;
class FIS_Read_byte
{
	public static void main(String ar[])throws Exception
	{
		int i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter File name with Extension:- ");
		FileOutputStream f=new FileOutputStream(br.readLine());
		f.readLine(b);														//left to rigth
		byte b[]=new byte[f.available()];								//file Available or Not
		
		
		for(i=0;i<b.length;i++)
			System.out.print((char)b[i]);
		
		/*	String s=new string(b,0,b.length());
			System.out.println(s);
		*/
	}
}		//E:/first.txt
