//
import interpack.inter;
import java.io.*;
class impl implements inter
{
	String na,na1;
	public void getLength()throws Exception
	{
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the name for Find the Length");
		na=dis.readLine();
		//int n=na.length();
		System.out.println("Length	:	"+na.length());
	}
	public void getCompare()throws Exception
	{
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the Two names");
		na=dis.readLine();
		na1=dis.readLine();
		if(na.compareTo(na1)==0)
			System.out.println("Equal String.");
		else if(na.compareTo(na1)>0)
			System.out.println("First String are Greater.");
		else
			System.out.println("Second String are Greater.");
	}
	public void getChar()throws Exception
	{
	
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the String");
		na=dis.readLine();
		System.out.println("Enter the Position");
		int n1=Integer.parseInt(dis.readLine());
		System.out.println("Letter	:	"+na.charAt(n1-1));
	}
}


class mainpack
{
	public static void main(String ar[])throws Exception
	{
		int ch,ch1;
		impl i=new impl();
		DataInputStream dis=new DataInputStream(System.in);
		do
		{
			System.out.println("1.Length\n2.Compare Two Strings\n3.Find the Character Positon\n");
			System.out.println("Enter the Choice");
			ch=Integer.parseInt(dis.readLine());
			switch(ch)
			{
				case 1:	i.getLength();
				break;
				
				case 2:	i.getCompare();
				break;
				
				case 3:	i.getChar();
				break;
			}
			System.out.println("Do you want continue(1/0)");
			ch1=Integer.parseInt(dis.readLine());
		}while(ch1==1);
	}
}
