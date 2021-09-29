//Vector Program 2
import java.io.*;
import java.util.*;
class vect2
{
	public static void main(String st[])throws Exception
	{
		Vector v=new Vector();
		v.addElement(st[0]);				//give input from cmd
		v.addElement(st[1]);
		v.addElement(st[2]);
		v.addElement(st[3]);
		v.addElement(st[4]);
		System.out.println("Size: "+v.size());
		System.out.println("Element: "+v.elementAt(2));		//Index value
		System.out.println("First Data: "+v.firstElement());	//it's a method
		System.out.println("Last Data: "+v.lastElement());
		int index=2;
		System.out.println("Data: "+v.get(index-1));
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		while(true)
		{
			switch(i)
			{
				case 1: System.out.println("Enter the Element to Add:- ");
				//String s=br.readLine();
				//v.addElement(s);
				v.addElement(br.readLine());
				break;
				
				case 2: System.out.println("Enter the Element and Position to Add:- ");
				String s1=br.readLine();
				int j=Integer.parseInt(br.readLine());
				v.insertElementAt(s1,j-1);		//insert element(s1) at position(j-1)
				break;
				
				case 3: 
				Enumeration enum1;
				enum1=v.elements();
				while(enum1.hasMoreElements())
					System.out.println(enum1.nextElement());
				break;
				
				case 4: System.out.println("Enter the Position of the Element to Delete:- ");
				int s2=Integer.parseInt(br.readLine());
				v.removeElementAt(s2-1);
				break;
				
				case 5:
				System.exit(0);
			}
			System.out.println("\n\nEnter Your Choice:- ");
			System.out.println("\n1.Add an Element to the End: ");
			System.out.println("\n2.Insert a Element: ");
			System.out.println("\n3.View Elements: ");
			System.out.println("\n4.Delete an Element: ");
			System.out.println("\n5.Exit ");
			i=Integer.parseInt(br.readLine());
		}
	}
}

//We can even after initializing the value, you can keep increasing the number of elements to that particular vector
//Vector is Dynamic
