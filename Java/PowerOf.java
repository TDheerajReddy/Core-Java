//Power Of Base
import java.util.Scanner;
class PowerOf
{
	
	public static void main(String args[])
	{
		int a,b,p;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Base: ");
		a=sc.nextInt();
		b=a;
		System.out.println("Power: ");
		p=sc.nextInt();
		while(p>1)
		{
			a=a*b;
			p=p-1;
		}
		System.out.println("Ans = "+a);		
	}
}
