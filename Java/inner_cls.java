//Inner Class Program 2
import java.io.*;
class function1
{
	int m,k=0,i,j;
	void wordjoin(String s,String s1)		// hi java
	{
		char join[]=new char[s.length() + s1.length()];		//6
		char c[]=s.toCharArray();		//hi
		char c1[]=s1.toCharArray();		//java
		
		for(i=0;i<c.length;i++)			//c.length=2
		{
			join[i]=c[i];
		}
		for(j=i;j<join.length;j++)			//j=2; join.length=6
		{
			join[j]=c1[k];
			k++;
		}
		System.out.println(join);
	}
	class function2
	{
		void getindex(String s,char c)		//welcome	o
		{
			//character index s.indexof('s')
			int i;
			char a[]=s.toCharArray();
			for(i=0;i<a.length;i++)
			{
				if(a[i]==c)
				{
					System.out.println("Index: "+i);
					break;
				}
			}
			if(i==s.length())		//entire word search but letter not found
			{
				System.out.println("Letter not Found!!");
			}
		}
	}
}
class inner_cls
{
	public static void main(String ar[])throws Exception
	{
		String x,y,z;
		char p;
		DataInputStream dis=new DataInputStream(System.in);
		
		System.out.println("Enter 2 Names to Concatenate: ");
		x=dis.readLine();
		y=dis.readLine();
		
		System.out.println("Enter the Name and a Character: ");
		z=dis.readLine();
		p=(char)dis.read();
		
		function1 f=new function1();
		f.wordjoin(x,y);
		f.new function2().getindex(z,p);		//creating the object for inner class(function2)
		//f.wordjoin("hi","java");
		//f.new function2().getindex("welcome","o");
	}
}