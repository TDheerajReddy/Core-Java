import string.*;		//"string" is a package and "*" is for import all classes
import java.util.Scanner;
class m1
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		len l=new len();
		System.out.println("Enter a String to calculate Word Length: ");
		l.getlength(sc.nextLine());		// = 8 with space
		concatenate c=new concatenate();
		System.out.println("Enter Two String: ");
		c.getconcat(sc.nextLine(),sc.nextLine());
	}
}
