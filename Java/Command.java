import java.util.Scanner;
class Command
{
	public static void main(String s[])
	{
		int id;
		String name;
		System.out.println("Enter value: ");
		id=Integer.parseInt(s[0]);
		name=s[1];
		System.out.println("Employee id: "+id);
		System.out.println("Employee Name: "+name);
	}
}