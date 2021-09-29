//Parameterized Constructor
import java.util.Scanner;
class ConsParam
{
	int eno;
	String ename;
	ConsParam(int eno1,String ename1)
	{
		eno=eno1;
		ename=ename1;
	}
	void disp()
	{
		System.out.println("Employee id: "+eno);
		System.out.println("Employee Name: "+ename);
	}
	public static void main(String ar[])
	{
		int no;
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter Employee Name: ");
		String name=scn.nextLine();
		
		System.out.println("Enter Employee id: ");
		no=scn.nextInt();
		
		ConsParam cp=new ConsParam(no,name);			//Calling Constructor
		cp.disp();
	}
}
