//Exception	try-catch		17-02-2021
class DivideNumTryCatch
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
		catch(ArithmeticException e)
		{
			System.out.println("SECOND NUMBER CAN NOT BE ZERO, NOT DIVIDED BY ZERO!");
		}		
		catch(NumberFormatException e)
		{
			System.out.println("ENTER ONLY INTEGER NUMBER!");
		}
		/*catch(Exception e)
		{
			System.out.println("Exception : Error");
		}*/
		System.out.println("Bye");
	}
}
