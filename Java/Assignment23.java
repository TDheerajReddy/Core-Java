//Assignment23
import java.io.*;
class Assignment23
{
	public static void main(String ar[])throws Exception
	{
		int n,temp,r,fact,sum=0;
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Check for Strong Number:");
		n=Integer.parseInt(d.readLine());
		temp=n;
		while(n>0)
		{
			r=n%10;
			fact=1;
			for(int i=r;i>=1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		n=temp;
		if(sum==n)
		{
			System.out.println("Strong Number: "+sum);
		}
		else
		{
			System.out.println("Not a Strong Number: ");
		}
	}
}
