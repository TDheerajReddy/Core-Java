//throw & throws
class SmallRollNoException extends Exception
{
}
class BigRollNoException extends Exception
{
}
class A
{
	public void check(int num)throws SmallRollNoException, BigRollNoException
	{
		if(num<1001)
		{
			SmallRollNoException obj=new SmallRollNoException();
			throw obj;
		}
		else if(num>9999)
		{
			BigRollNoException obj=new BigRollNoException();
			throw obj;
		}
	}
}
class MyExcep
{
	public static void main(String ar[])
	{
		java.util.Scanner obj=new java.util.Scanner(System.in);
		System.out.println("Enter the roll number:");
		int roll=obj.nextInt();
		try
		{
			System.out.println("Hellow Try Block.");
			A p=new A();
			p.check(roll);
			System.out.println("Valid Roll Number....");
		}
		catch(SmallRollNoException e)
		{
			System.out.println("ROLL NUMBER CAN NOT BE LESS THAN 1001 , "+e);
		}
		catch(BigRollNoException e)
		{
			System.out.println("ROLL NUMBER CAN NOT BE GREATER THAN 9999 , "+e);
		}
		finally
		{
			System.out.println("Thanks :)");
		}
	}
}
