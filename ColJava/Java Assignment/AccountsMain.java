abstract class Accounts
{
	double balance;
	long accountNumber;
	char accountHoldersName;
	
	abstract double withdrawl();
	abstract double deposit();
	abstract double display();
}

class AccountsMain extends Accounts
{
	java.util.Scanner obj=new java.util.Scanner(System.in);
	public static void main(String arg[])
	{
		Accounts a;
		AccountsMain am=new AccountsMain();
		a=am;
		//a.withdrawl();
		//a.deposit();
		//a.display();

		System.out.println("Balance : "+ a.display());
	}
	
	double withdrawl()
	{
		System.out.println("Do You Want To Withdrawl Money ? \n\t Press YES for Y & NO for N");
		char confirm;
		confirm = obj.next().charAt(0);
		if((confirm == 'y') || (confirm == 'Y'))
		{
			double w;
			System.out.println("Enter Withdrawl Ammount: ");
			w=obj.nextDouble();
			return w;
		}
		else
		{
			return 0;
		}
	}
	double deposit()
	{
		System.out.println("Do You Want To Deposite Money ? \n\t Press YES for Y & NO for N");
		char confirm;
		confirm = obj.next().charAt(0);
		if((confirm == 'y') || (confirm == 'Y'))
		{
			double d;
			System.out.println("Enter Deposit Ammount: ");
			d=obj.nextDouble();
			return d;
		}
		else
		{
			return 0;
		}
	}
	double display()
	{
		System.out.println("Enter Account Number: ");
		accountNumber=obj.nextInt();
		System.out.println("\nEnter Account Holder's Name: ");
		accountHoldersName=obj.next().charAt(0);
		System.out.println("Enter your Balance: ");
		balance=obj.nextDouble();
		System.out.println(".");
		balance=( balance + deposit() ) - withdrawl();
		return (balance);
	}
}