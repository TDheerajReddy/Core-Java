//Words Count 
import java.util.Scanner;
class Count_Words
{
	public static void main(String ar[])
	{
		String s;
		int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Sentence: ");
		s=sc.nextLine();
		
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==32)		//count 'white spaces'=32,		space=32 in ASCII code
			{
				count++;
			}
		}
		System.out.println("Number of White Spaces: "+count);
	}
}
