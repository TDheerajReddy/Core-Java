//1-D Array
import java.util.Scanner;
class Array1D
{
	public static void main(String ar[])
	{
		int i,n,t=0;
		float avg;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number Marks");
		n=kb.nextInt();
		
		int []a=new int[n];
		System.out.println("Enter the "+n+" Marks");
		for(i=0;i<n;i++)
		{
			a[i]=kb.nextInt();
		}
		System.out.println("The values are:- ");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
			t=t+a[i];
		}
		System.out.println("Total: "+t);
		avg=t/n;
		System.out.println("Average: "+avg);
	}
}
