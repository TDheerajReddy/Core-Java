//InputStreamReader
import java.io.*;
public class file15
{
	public static void main(String ar[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Name");
		String data=br.readLine();
		System.out.println(data);		
	}
}
