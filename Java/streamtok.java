//StreamTokenizer		//count words and numbers but not count Special Symbols
import java.io.*;
class streamtok			//ignore the whitspace
{
	public static void main(String ar[])throws Exception
	{
		FileInputStream fr=new FileInputStream("file2.txt");
		StreamTokenizer input=new StreamTokenizer(fr);
		int count=0,count1=0;
		int tok;
		while((tok=input.nextToken())!=StreamTokenizer.TT_EOF)
		{
			if(tok==StreamTokenizer.TT_WORD)
			{
				count++;
			}
			if(tok==StreamTokenizer.TT_NUMBER)		//.TT.Number
			{
				//System.out.println(input.nval);
				count1++;
			}
		}
		System.out.println("The Number of Words in the file: "+count);
		System.out.println("The Number of Digits in the file: "+count1);
	}
}
