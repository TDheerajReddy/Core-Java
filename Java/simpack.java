//Break Statement
import third.sample1;
import java.util.Scanner;
class simpack
{
	public static void main(String g[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		sample1 s1=new sample1();
		s1.numdisp(a,b);
		System.out.println(s1.strdisp("Java Learner"));
	}
}
