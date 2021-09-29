import java.io.*;
class DIS
{
	public static void main(String j[])throws Exception
	{
		int pid;
		String pname;
		double pprice;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter Product id:");
		pid=Integer.parseInt(dis.readLine());
		System.out.println("Enter Product Name:");
		pname=dis.readLine();
		System.out.println("Product Price:");
		pprice=Double.parseDouble(dis.readLine());
		System.out.println("Product Deatails:");
		System.out.println("Product id "+pid);
		System.out.println("Product Name "+pname);
		System.out.println("Product Price "+pprice);
	}
}