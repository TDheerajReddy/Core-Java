//Method Overriding
class First
{
	void disp()
	{
		System.out.println("This is from 'First' Class");
	}
}

class Second extends First		//Properties of 'First' Class is Inherited in 'Second' Class
{
	void disp()
	{
		System.out.println("This is from 'Second' Class");
	}
}

class MethOverrding
{
	public static void main(String k[])
	{
		First f;				//Refference Variable //for short name
		f=new First();			//'f' acts as an object for 'First' Class
		f.disp();
		
		f=new Second();			//'f' acts as an object for 'Second' Class
		f.disp();
	}
}
