//Link List Program
import java.io.*;
import java.util.*;
class LinkList1
{
	public static void main(String q[])throws Exception
	{
		LinkedList l=new LinkedList();
		int ch,pos;
		String ele;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("LinkedList");
		do
		{
			System.out.println("\nEnter Your Choice: ");
			System.out.println("\n1.Create");
			System.out.println("\n2.Insert");
			System.out.println("\n3.Replace by position");
			System.out.println("\n4.View");
			System.out.println("\n5.Remove by Element");
			System.out.println("\n6.Remove by Position");
			
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:	System.out.println("\n\nLinked List Created");
				break;
				
				case 2:	System.out.println("\nEnter the Element: ");
				ele=br.readLine();
				l.add(ele);
				System.out.println("\nSuccessfully Inserted");
				break;
				
				case 3:	System.out.println("\nEnter the Element:");
				ele=br.readLine();
				System.out.println("\nEnter the position");
				pos=Integer.parseInt(br.readLine());
				l.set(pos-1,ele);
				System.out.println("\nSuccessfully Inserted");
				break;
				
				case 4:	System.out.println("\nThe Elements in the Linked List are:-\n  ");
				System.out.println(l);				
				break;
				
				case 5:	System.out.println("\nEnter the Element: ");
				ele=br.readLine();
				l.remove(ele);
				System.out.println("\nElement Successfully Removed");
				break;
				
				case 6:	System.out.println("\nEnter the Position: ");
				pos=Integer.parseInt(br.readLine());
				l.remove(l.get(pos-1));
				System.out.println("\nElement Successfully Removed");
				break;
				
				default:
				break;
			}
		}while(ch<7);
	}
}
