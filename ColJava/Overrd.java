//Method Overriding
class AOver
{
	void show()
	{
		System.out.println("Hi A Class");
	}
}

class BOver extends AOver
{
	/*void show()
	{
		System.out.println("Hi B Class");
	}*/
}

class COver extends BOver
{
	/*void show()
	{
		System.out.println("Hi C Class");
	}*/
}

class Overrd
{
	public static void main(String ar[])
	{
		COver co=new COver();
		co.show();
	}
}
