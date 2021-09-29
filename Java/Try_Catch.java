//try-catch Exception Example
class Try_Catch
{
	public static void main(String ar[])
	{
		int a=10,b=0,c;		//b=0, Run Time Error
		try
		{
			c=a/b;
			System.out.println("Value of c: "+c);
		}
		catch(Exception e)		//Error shorten for better Understanding
		{
			System.out.println(e);
		}
	}
}


/* //ArrayIndexOutOfBounds Exception
class ArrayIndex
{
	public static void main(String ar[])
	{
		try
		{
			int a[]={1,2,3};
			System.out.println("Assray : "+a[6]);
		}
		catch(ArrayIndexOutOfBoundsException sioe)
		
		{
			System.out.println(sioe);
		}
	}
} */


/* //StringIndexOutOfBounds Exception
class StringIndex
{
	public static void main(String ar[])
	{
		try
		{
			String s="Raja";
			//System.out.println(s.charAt(3));
			System.out.println(s.charAt(9));			//"charAt()"Pre-Defined Method :- To find the position of a particular character
		}
		catch(StringIndexOutOfBoundsException sioe)		//Runtime Exception
		{
			System.out.println(sioe);
		}
	}
} */