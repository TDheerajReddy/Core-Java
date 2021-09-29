//Do-While Loop(Count the Even numbers)
class DoWhile
{
	public static void main(String ar[])
	{
		int i=1,count=0;
		System.out.print("Even Numbers Are: ");
		do
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
				count++;
			}
			i++;
		}
		while(i<=12);
		System.out.println("\nNumber of Even Numbers: "+count);
	}
}