//Constructor Overloading
import java.util.Scanner;
class ConsOvrld
{
	ConsOvrld()
	{
		System.out.println("This is Default Constructor\n");
	}
	ConsOvrld(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("The Addition result is: "+c+"\n");
	}
	ConsOvrld(double d1,double d2)
	{
		double d3;
		d3=d1*d2;
		System.out.println("The Multiplication result is: "+d3+"\n");
	}
	ConsOvrld(String s)
	{
		System.out.println("Hellow "+s);
	}
	
	public static void main(String ar[])
	{
		int a,b;
		double c,d;
		String s;
		
		Scanner sc=new Scanner(System.in);
		ConsOvrld co=new ConsOvrld();
		
		System.out.println("Enter any Name:");
		s=sc.nextLine();
		ConsOvrld co1=new ConsOvrld(s);
		
		System.out.println("Enter Two Integer Value:");
		a=sc.nextInt();
		b=sc.nextInt();
		ConsOvrld co2=new ConsOvrld(a,b);		
		
		System.out.println("Enter Two Double Value:");
		c=sc.nextDouble();
		d=sc.nextDouble();
		ConsOvrld co3=new ConsOvrld(c,d);	
		
	}
}
