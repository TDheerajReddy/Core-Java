//ArrayIndexOutOfBounds Exception
class ArrayIndex
{
	public static void main(String ar[])
	{
		try
		{
			int a[]={1,2,3};
			System.out.println("Array : "+a[6]);
		}
		catch(ArrayIndexOutOfBoundsException sioe)
		
		{
			System.out.println(sioe);
		}
	}
}