//Inner class Program 1
class one				//Outer Class
{
	class two				//Inner Class
	{
		void get()				//Inner class Method
		{
			System.out.println("Inside class");
		}
	}
}

class in
{
	public static void main(String ar[])
	{
		one o=new one();			//object for outer class
		o.new two().get();			//'two()' is object for inner class & '.get()' is to call method	//creating the object for inner class
	}
}
