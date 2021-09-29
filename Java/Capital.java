//getBytes()		based on ASCII code
import java.util.Scanner;
class Capital
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name in Lower Case: ");
		String s=sc.nextLine();
		
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>=97 && c[i]<=122)
				c[i]=(char)(c[i]-32);
		}
		System.out.println(c);
	}
}
