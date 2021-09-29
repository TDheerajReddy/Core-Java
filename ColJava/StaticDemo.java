//29-9-20
class StaticDemo
{
	int x=10;
	static int y=20;		//share
	void show()
	{
		System.out.println(x+"\t"+y);
	}
	void increment()
	{
		x++;
		y++;
	}
}
