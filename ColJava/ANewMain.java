//26-8-20
class ANewMain
{
	public static void main(String ar[])
	{
		// class_name object_name=new class_name();
		ANew an=new ANew();
		System.out.println(an.a);		//fetch 'ANew' class Varialbe with object
		an.add();						//call 'add()' method through object_name
		System.out.println(an.b);		//fetch 'ANew' class Varialbe with object of the class
	}
}
