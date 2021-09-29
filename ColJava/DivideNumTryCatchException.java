//Exception	try-catch Exception class		17-02-2021
class DivideNumTryCatchException
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
		catch(ArithmeticException e)
		{
			System.out.println("SECOND NUMBER CAN NOT BE ZERO, NOT DIVIDED BY ZERO!");
		}		
		catch(Exception e)
		{
			System.out.println("The Error is : "+e);
		}
		System.out.println("Bye");
	}
}

/* if you interchange the catch blocks then is gives error, that is :-	DivideNumTryCatchException.java:22: error: exception ArithmeticException has already been caught
                catch(ArithmeticException e)
                ^
1 error
*/