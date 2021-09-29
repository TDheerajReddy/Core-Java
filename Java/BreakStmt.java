//Break Statement
import java.io.*;
class BreakStmt
{
	public static void main(String ar[])throws Exception
	{
		int x,sum=0;
		DataInputStream d=new DataInputStream(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter the 10 Value");
			x=Integer.parseInt(d.readLine());
			if(x<0)
				break;
			sum=sum+x;
		}
		System.out.println("Sum of +ve Numbers:"+sum);
	}
}
