//
import java.util.Scanner;
class Assignment26
{
	
	public static void main(String args[])
	{
		int arr[]=new int[5]; 
		int i=0;
		int j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Values");
		
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
	
		for(i=0;i<5;i++)
		{
			for(j=1;j<6;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Type a Non-duplicate value!!!");
				}
			}
		}		
		
	}
}

