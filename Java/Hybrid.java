//Hybrid (Inheritance/Interface)
class Hybrid
{
	public static void main(String ar[])
	{
		studmarks ob=new studmarks(78,89,90);
		ob.getdetails("Sashi","S12010");
		ob.getsportsmark(67);
		ob.display();
	}
}

interface sports
{
	void getsportsmark(int sportsmark);
	//public abstract void getsportmark(int sportsmark);
}

interface details
{
	void getdetails(String name,String id);
	//public abstract void getdetails(String name,String id);
}

class studinfo implements details
{
	public void getdetails(String na,String i)
	{
		System.out.println("Name	:	"+na);
		System.out.println("Roll No	:	"+i);
	}
}


class studmarks extends studinfo implements sports
{
	int mark1,mark2,mark3,sptsmark;
	studmarks(int m1,int m2,int m3)		//constructor
	{
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	public void getsportsmark(int mark)
	{
		sptsmark=mark;
	}
	void display()
	{
		System.out.println("Mark1	:	"+mark1);
		System.out.println("Mark2	:	"+mark2);
		System.out.println("Mark3	:	"+mark3);
		System.out.println("Sports Marks	:	"+sptsmark);
	}
}

//Interfaces can be used to Overcome the problem of Hybrid