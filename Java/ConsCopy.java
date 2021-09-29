//Copy Constructor
import java.util.Scanner;
class ConsCopy
{
	int sno;
	String sname;
	ConsCopy(int a,String s)
	{
		System.out.println("Constructor Called");
		sno=a;
		sname=s;
	}
	ConsCopy(ConsCopy cpy)
	{
		sno=cpy.sno;
		sname=cpy.sname;
	}
	void putDetails()
	{
		System.out.println("Sno: "+sno);
		System.out.println("Sname: "+sname);
	}
	public static void main(String ar[])
	{
		ConsCopy cc=new ConsCopy(2943,"Rajesh");
		cc.putDetails();
		ConsCopy ccc=new ConsCopy(cc);
		ccc.putDetails();
	}
}
