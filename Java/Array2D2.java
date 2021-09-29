//2-D Array Eg-1
import java.util.Scanner;
class Array2D2
{
	public static void main(String s[])
	{
		int a[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 9 values");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display the Matrix:-");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.println(a[i][j]+"\t");
			}
			System.out.print("\n");					//For Next Line
		}
	}
}
