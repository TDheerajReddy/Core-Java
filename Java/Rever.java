//Reverse the String without using a 'reverse' function
class Rever
{
	public static void main(String ar[])
	{
		int f=0,k=0;
		String s=ar[0];					//hello
		System.out.println("Original String: "+s);
		char c[]=s.toCharArray();		//h e l l o
		char c1[]=new char[s.length()];	//c1[5]
		int n=s.length();				//n=5
		for(int i=n-1;i>=0;i--)			//i=4;4>=0
		{
			c1[k]=c[i];
			k++;
		}
		String s1=new String(c1,0,c1.length);
		System.out.println("Reversed String: "+s1);
		for(int i=0;i<c.length;i++)		//i<5
		{
			if(c[i]==c1[i])
				f++;
		}
		System.out.println("Check Palindrome: ");
		if(f==n)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}