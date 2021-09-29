//TreeSet
import java.util.*;
class treeset
{
	public static void main(String ar[])
	{
		Set t=new TreeSet();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);								//'add' method do not add duplicate values
		System.out.println(t);
		//t.clear();							// delete/remove all elements
		System.out.println(t.remove(3));		// First reamove '3' the tell True/False
		System.out.println(t);
		System.out.println(t.contains(2));		// True/False
		System.out.println("Size: "+t.size());
		Object c[]=t.toArray();					// Convert TreeSet to Array
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);
		
	}
}
