//Map Program
import java.util.*;
class Map1
{
	public static void main(String ar[])
	{
		Map m=new HashMap();
		System.out.println(m.isEmpty());		//True/False
		m.put(1,"One");
		m.put(2,"Two");
		m.put(3,"Three");
		m.put(4,"Four");
		Map m1=new HashMap();
		m1.put(5,"Five");
		m1.put(6,"Six");
		System.out.println(m);
		System.out.println(m.get(3));
		System.out.println(m.isEmpty());
		System.out.println("Size: "+m.size());
		m.putAll(m1);
		System.out.println(m);
		System.out.println(m1);
	}
}
