//Vector Program 1
import java.util.*;
class vect1
{
	public static void main(String ar[])
	{
		Vector v=new Vector(3);				//Default [10]	0-9
		System.out.println("Capacity: "+v.capacity());	//3	0-2
		System.out.println("Size: "+v.size());
		v.addElement("Flow");
		v.addElement("Border");
		v.addElement("Grid");
		v.addElement("Card");
		System.out.println(v);
		System.out.println("Size: "+v.size());	//4
		System.out.println("Capacity: "+v.capacity());		//if you add more than 3 elements then the capacity will be increased by 3, so =6
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			Object obj=e.nextElement();
			System.out.println(obj);
		}		
	}
}
