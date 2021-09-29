//HashSet Program
import java.util.*;
class hash_set
{
	public static void main(String args[])
	{
		HashSet set=new HashSet();		//does not allow duplicate values
		set.add("zerin");				//order not gauranteed
		set.add("null");
		set.add("This");
		set.add("is");
		set.add("is");
		set.add("a");
		set.add("a");
		set.add("Ganeshan");
		set.add("Test");
		System.out.println(set.size());	//with dup=9, without dup=7
		Iterator i=set.iterator();		//as 'for loop', check each item
		while(i.hasNext())				//"hasNext()" method comes under Iterator class
		{								//check next line value
			Object o=i.next();			//'Object' is a class	//'next()' to move next
			System.out.println(o);		
		}
		
		
	}
}
