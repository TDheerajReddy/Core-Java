//Static Variable
class check
{
	static int i=7;			//Global variable	//if not initialize 'i' then default value is ZERO (0)		//when we declare static variable then automatically 'static{};' class created
	void stat_Vble()
	{
		System.out.println(i);
		i++;
	}
	void normal_Vble()
	{
		int j=7;
		System.out.println(j);
		j++;
	}
	public static void main(String ar[])
	{
		check c=new check();
		c.stat_Vble();			//7
		c.stat_Vble();			//8
		c.stat_Vble();			//9
		c.normal_Vble();		//7
		c.normal_Vble();		//7
		c.normal_Vble();		//7
	}
}
