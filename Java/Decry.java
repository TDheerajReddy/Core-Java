// Encrypt the file
import java.io.*;
public class Decry
{
	public static void main(String d[])
	{
		try
		{
			FileInputStream f=new FileInputStream(d[0]);		//Type Encrypted file name	//cmd line argument Input //Read the File
			FileOutputStream f1=new FileOutputStream(d[1]);		//Type new file name  for Decrypte the file(like Rename)
			String ch="";
			int c;
			
			while((c=f.read())!=-1)
			{
				ch+=(char)(c+5);		//Character(c)+5 //ASCII values //'ch+' means Append/Merge //Add any algo to Encrypt the file
			}			
			byte b[]=ch.getBytes();			
			f1.write(b);
			f.close();
			f1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}		// java Decry D:\ecrypted.txt D:\decrypted.txt
