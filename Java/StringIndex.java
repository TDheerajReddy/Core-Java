//StringIndexOutOfBounds Exception
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
}