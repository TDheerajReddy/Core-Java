//Inner Package/Nested Package
package shape.triangle;
public class star
{
	public void get_triangle(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print("*\t");
			System.out.println();
		}
	}
}
