interface Bank
{
	void display();
}
class Account implements Bank
{
	public void display()
	{
		System.out.println("Account Class");
	}
}
class Customer extends Account implements Bank
{
	public void display()
	{
		System.out.println("Customer Class");
	}	
}

class Q9
{
	public static void main(String arg[])
	{
		Bank b;
		Account a=new Account();
		b=a;
		b.display();
		Customer c=new Customer();
		b=c;
		b.display();
		
	}
}