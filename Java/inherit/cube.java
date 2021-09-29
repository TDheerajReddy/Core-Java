//Package with Inheritence/Package with two classes that are Inherited Itself
package inherit;
public class cube extends square		//"extends" keyword:- "cube" Inherit the properties of the class "square"
{
	public void getB(int n)
	{
		System.out.println("Derived Class: "+(n*n*n));
	}
}