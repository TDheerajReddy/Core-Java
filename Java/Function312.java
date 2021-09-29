class Function312
{
	void compare(String s, String s1)		//With Arguments,No Return Type (WANR)
	{
		System.out.println("Equal: "+s.equals(s1));
	}
	public static void main(String args[])
	{
		Function312 c=new Function312();
		c.compare("welcome","Welcome");
	}
}