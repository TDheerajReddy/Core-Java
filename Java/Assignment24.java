//
import java.util.Scanner;
class Assignment24
{
	
	public static void main(String ar[])
	{
		int p=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Positive Numbers:-");
		while(true)
		{
			p=sc.nextInt();
			if(p<=-1)
			{
				break;
			}
			if(p==0)
			{
				System.out.println("Enter a Positive Number !!!");
			}
		}
		
	}
}
