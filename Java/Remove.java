//Reemove selected word with Strings
import java.util.Scanner;
class Remove
{
	public static void main(String ar[])
	{
		int x=0;
		String s="welcome";				//0-6=7
		char c[]=s.toCharArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Index: ");
		int index=sc.nextInt();
		for(int i=0;i<c.length;i++)		//c.length=7
		{
			if(index==i)
			{
				x=1;
				System.out.print(" ");
				continue;
				
			}
			System.out.print(c[i]);	//w e l c o m e
		}
		if(x==0)
		{
			System.out.println("\n Out of Range");	//Exception(Error)
		}
	}
}