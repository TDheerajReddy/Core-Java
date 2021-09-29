import java.util.Scanner;
class Assignment15
{
	public static void main(String args[])
	{
		int n1,n2,n3,n4,n5,total;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		n4=sc.nextInt();
		n5=sc.nextInt();
		total=n1+n2+n3+n4+n5;
		System.out.println("Total: "+total);
		avg=total/5;
		System.out.println("Average: "+avg);
	}
}