//
class StaticMember
{
	public static void main(String ar[])
	{
		A1 obj=new A1();
		
		// Try to access method of class A1 using object
		obj.show();			//non-staticonly through object
		obj.display();
		
		// Try to access method of class A1 using Class Name
		//A1.show();		//non-static method show() cannot be referenced from a static context
		A1.display();
		
	}
}
