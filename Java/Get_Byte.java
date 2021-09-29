//getBytes()		based on ASCII code
import java.util.Scanner;
class Get_Byte
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings to find Characters OR Special Symbols ASCII Code: ");
		String s=sc.nextLine();
		byte b[]=new byte[s.length()];
		s.getBytes(0,s.length(),b,0);				//'b' is the Byte Array and '0' is the Byte Array Start position
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]+" : "+(char)b[i]);
	}
}
