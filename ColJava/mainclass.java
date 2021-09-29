//
public class mainclass
{
	public static void main(String args[])
	{
		System.out.println("\nExecution starts from here Main()");
		mainclass obj=new mainclass();
		obj.main(5);
		double value = obj.main(3,12.45);
		System.out.println(value);
		
	}
	
	void main(int ar)
	{
		System.out.println("Override int main()");
	}
	
	double main(int i,double d)
	{
		System.out.println("Override double main()");
		return d;
		
	}
}
