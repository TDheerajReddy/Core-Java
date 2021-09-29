//Using Two Assert
class Assert1
{
	public static void main(String ar[])
	{
		try
		{
			System.out.println("Testing...");
			assert true: "Condition is true, so we won't see this";
			assert false: "If assertion are ON, we'll see this";
		}
		catch(AssertionError e)
		{
			e.printStackTrace();
		}
	}
}
