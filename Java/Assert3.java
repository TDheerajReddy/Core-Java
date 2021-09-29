//Condition
class Assert3
{
	public static void main(String ar[])
	{
		int i=Integer.parseInt(ar[0]);
		if(i%3==0)
		{
			System.out.println("First");
		}
		else if(i%3==1)
		{
			System.out.println("First1");
		}
		else
		{
			assert false:"Error";		//If False the program stop here an execut
			System.out.println("First3");
		}
	}
}
