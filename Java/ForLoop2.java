class ForLoop2
{
	public static void main(String ar[])
	{
		int i,n,f=1;
		n=Integer.parseInt(ar[0]);
		for(i=1;i<=n;i++)
		{
			f=f*i;						//1*1= 1*2= 2*3= 6*4= 24*5= 120
		}
		System.out.println("Fact Value: "+f);
	}
}