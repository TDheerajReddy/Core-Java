//Exception	try-catch Exception class		17-02-2021
class DivideNumFinally
{
	public static void main(String arg[])
	{
		try
		{
			int a,b,ans;
			System.out.println("Hellow");
			a=Integer.parseInt(arg[0]);
					System.out.println("Hellow 1");
			b=Integer.parseInt(arg[1]);
			System.out.println("Hellow 2");
			
			ans=a/b;
			System.out.println("Result is: "+ans);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ENTER ATLEAST TWO INTEGER NUMBER!");
		}
		finally
		{
			System.out.println("HELLOW FINALLY BLOCK");
		}
		System.out.println("Bye");

	}
}
