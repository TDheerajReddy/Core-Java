//Default Constructor
import java.io.*;
class ConsDefault
{
	ConsDefault()
	{
		System.out.println("This is Default Constructor");
	}
	void test()
	{
		System.out.println("This is Normal Method");
	}
	public static void main(String ar[])throws Exception
	{
		ConsDefault cd=new ConsDefault();			//Calling Constructor
		cd.test();
	}
}
