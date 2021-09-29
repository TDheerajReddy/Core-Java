//Prime Number
import java.util.Scanner;
class PrimeNum
{	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
	
		double i,m=0,f=0;
		
		System.out.println("Enter a Number");
		double num=sc.nextInt();	//Number for checking
		
		m=num/2;
		if(num==0 || num==1)
		{
			System.out.println(num+" is not a Prime Number");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(num%i==0)
				{
					System.out.println(num+" is not a Prime Number "+m);
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.println(num+" is a Prime Number "+m);
			}
		}
		
	}
		
}
