//Reemove selected word with Strings
import java.util.Scanner;
class Str_Function
{
	public static void main(String ar[])
	{
		int x=0;
		String s1="welcome";				//0-6=7
		String s2="WELCOME";
		System.out.println("String s1: "+s1);
		System.out.println("String s2: "+s2);
		
		System.out.println("Starts With l:"+s1.startsWith("l"));				//False
		System.out.println("Length: "+s1.length());								//7
		System.out.println("charAt(3): "+s1.charAt(3));							//c
		System.out.println("EndsWith(m): "+s1.endsWith("m"));					//m
		System.out.println("IndexOf(m): "+s1.indexOf("m"));						//5
		System.out.println("LastIndexOf(e): "+s1.lastIndexOf("e"));				//6
		System.out.println("SubString(2): "+s1.substring(2));					//lcome
		System.out.println("Substring(3,6): "+s1.substring(3,6));				//com
		System.out.println("Uppercase: "+s1.toUpperCase());						//s1=WELCOME
		System.out.println("Lowercase: "+s2.toLowerCase());						//s2=welcome
		System.out.println("Replace(w,d): "+s1.replace("w","d"));				//delcome
		System.out.println("s1.equals(s2): "+s1.equals(s2));					//False
		System.out.println("s1.equalsIgnoreCase(s2): "+s1.equalsIgnoreCase(s2));//True
		System.out.println("Concating Two Strings: "+s1.concat(s2));			//Merge/Joins Two Strings
		System.out.println(s1);
		String s3=s1.toUpperCase();
		System.out.println(s3);		
	}
}