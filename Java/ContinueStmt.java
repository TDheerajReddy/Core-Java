//Continue Statement
class ContinueStmt
{
	public static void main(String ar[])
	{
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				continue;		//Skip 3
			}
			System.out.println(i);
		}
	}
}
