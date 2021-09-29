//Star Pattern
/*

    *
   **
  ***
 ****
*****

*/
class Star5
{
	
	public static void main(String args[])
	{
		int i,j,k,l;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=5;j++)
			{	
				if(j>=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			for(k=1;k<=5;k++)
				{
					if(j>=k)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}				
				}
			System.out.println();
		}
	/*	for(k=1;k<=5;k++)
		{
			for(l=1;l<=5;l++)
			{
				if(k>=l)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/		
	}
}
