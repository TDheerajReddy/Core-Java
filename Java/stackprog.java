//Stack Program
import java.io.*;
import java.util.*;
class stackprog
{
	public static void main(String ar[])throws Exception
	{
		Stack s=new Stack();
		s.push("One");
		s.push("Two");
		s.push("Three");
		System.out.println(s);
		System.out.println("Enter a Value or type 'Exit' to quit");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		while(!s1.equalsIgnoreCase("exit"))
		{
			s.push(s1);
			System.out.println("Enter a Value or type 'Exit'");
			s1=br.readLine();
		}
		System.out.println("\n"+s);						//pint all elements i the stack
		System.out.println("Peek: "+s.peek()+"\n\n");		//print top of the stack element
		while(s.empty()==false)
		{
			if(true)
			{
				System.out.println("pop: "+s.pop());		//deleting elements
				System.out.println(s);
			}
		}
		if(s.empty()==true)
		{
			System.out.println("Stack is Empty");
		}
	}
}
