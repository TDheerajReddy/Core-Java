import java.io.*;
class Assignment6
{
	public static void main(String ar[])throws Exception
	{
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter a Character");
		char c=(char)dis.read();
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println(c+" is a Vowel");
		}
		if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
		{
			System.out.println(c+" is a Consonant");
		}
	}
}