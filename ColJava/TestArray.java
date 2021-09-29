//1-D Array		1-12-20
class TestArray
{
	public static void main(String ar[])
	{
		double[] myList={1.99,22.9,7.2,3.5};
		for(int i=0;i<myList.length;i++)
		{
			System.out.println(myList[i]);
		}
		
		//Finding the largest element
		double max=myList[0];
		for(int i=0;i<myList.length;i++)
		{
			if(myList[i]>max)
			{
				max=myList[i];
			}
		}
		
		System.out.println("\nMax element is: "+max);
		System.out.println(myList.length);
	}
}
