//White Space Count 
import java.util.Scanner;
class Space_Count
{
	public static void main(String ar[])
	{
		String s;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		s=sc.nextLine();
		
		char c[]=new char[s.length()];
		s.getChars(0,s.length(),c,0);
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==32)		//count 'white spaces'=32,		space=32 in ASCII code
				count++;
		}
		System.out.println("Number of White Spaces: "+count);
	}
}
