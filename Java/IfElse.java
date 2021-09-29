//If-Else Statement
import java.io.*;
class IfElse
{
	public static void main(String p[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int eve;
		System.out.println("Enter the Number");
		eve=Integer.parseInt(br.readLine());
		if(eve%2==0)					//Even-Odd Program
		System.out.println("Even Number");
		else
		System.out.println("Odd Number");
	}
}