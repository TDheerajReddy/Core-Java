import java.io.*;
class Buffer1
{
	public static void main(String f[])throws Exception
	{
		int acno;
		String cus_name;
		float bal;
		char g;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Account No.:");
		acno=Integer.parseInt(br.readLine());
		System.out.println("Enter Customer Name");
		cus_name=br.readLine();
		System.out.println("Enter Opening Balance");
		bal=Float.parseFloat(br.readLine());
		System.out.println("Enter Gender m or f");
		g=(char)br.read();
		System.out.println("Customer Details");
		System.out.println("Account No.: "+acno);
		System.out.println("Customer Name: "+cus_name);
		System.out.println("Opening Balance: "+bal);
		System.out.println("Gender: "+g);
	}
}