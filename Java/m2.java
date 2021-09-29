//Package with Inheritence/Package with two classes that are Inherited Itself
import inherit.*;		//"string" is a package and "*" is for import all classes
import java.util.Scanner;
class m2
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		cube c=new cube();				//No object created for class "square",	Object is created for class "cube"
		System.out.println("Enter a Value for Square: ");
		c.getA(sc.nextInt());			//Aquire the properties of Class "square"
		System.out.println("Enter a Value for Cube: ");
		c.getB(sc.nextInt());
	}
}
