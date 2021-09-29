//Hash Table Program
import java.util.*;
class hash
{
	public static void main(String ar[])
	{
		Hashtable ht=new Hashtable();		//'Hashtable' is class
		ht.put("C101","Java");
		ht.put("C102","J2EE");
		ht.put("C103","J2ME");
		System.out.println(ht);				
		Enumeration e=ht.keys();			//'Enumeration' is a class, //ht.keys(like:- C101,C102,C103) goes to Enumerated(count)
		while(e.hasMoreElements())
		{
			Object obj=e.nextElement();		//'Object' is a class
			System.out.println(obj+"\t"+ht.get(obj));		//print:- C101	Java
		}
		System.out.println(ht.get("C101"));
	}
}
