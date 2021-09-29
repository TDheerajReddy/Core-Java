//Nested FOR Loop
class NestedFor
{
	public static void main(String ar[])
	{
		int x=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(++x+"\t");
			}
			System.out.println();
		}
	}
}