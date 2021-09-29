//DataOutputStream
import java.io.*;
public class file9
{
	public static void main(String ar[])throws Exception
	{
		DataOutputStream out=new DataOutputStream(new FileOutputStream("E:/data.txt"));
		out.writeInt(24);
		out.writeFloat(74.76f);			//'f' for float because double is default
		out.writeBoolean(true);
		out.writeChar('a');				//only one char write
		//out.writeLine("welcome");
		out.close();					
		DataInputStream in=new DataInputStream(new FileInputStream("E:/data.txt"));
		System.out.println(in.readInt());
		System.out.println(in.readFloat());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		//System.out.println(in.readLine());
		in.close();		
	}
}
