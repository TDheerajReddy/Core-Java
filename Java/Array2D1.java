//2-D Array Eg-1
class Array2D1
{
	public static void main(String s[])
	{
		int x=1;
		int a[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			a[i][j]=x++;							//Post Increment
			System.out.print(a[i][j]+"\t");			//Print at same line
			}
			System.out.println();					//For Next Line
		}
	}
}
