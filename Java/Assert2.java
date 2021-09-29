class Assert2
{
	public static void main(String ar[])
	{
		int n=Integer.parseInt(ar[0]);
		try
		{
			System.out.println("Testing...");
			assert n%2==0:"ODD Number";		//if false then print this /If false then program stops here and execute
			System.out.println("EVEN Number");
		}
		catch(AssertionError e)
		{
			System.out.println(e.getMessage());
		}
	}
}
