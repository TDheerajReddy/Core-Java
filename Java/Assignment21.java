//
import java.util.Scanner;
class Assignment21
{
	
	public static void main(String ar[])
	{
		int choice;
		float Grade1;
		float Grade2;
		float Grade3;
		float Grade4;
		Scanner sc=new Scanner(System.in);
		System.out.println("The HRA for employees is calculated-");
		System.out.println("Select your Grade- \n 1 for Grade 1 \n 2 for Grade 2 \n 3 for Grade 3 \n 4 for Grade 4");
		a:
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				Grade1=10000*30/100;
				System.out.println("Grade 1 Salary:- "+Grade1);
				break;
			
			case 2:
				Grade2=7500*20/100;
				System.out.println("Grade 2 Salary:- "+Grade2);
				break;
				
			case 3:
				Grade3=5000*15/100;
				System.out.println("Grade 3 Salary:- "+Grade3);
				break;
			
			case 4:
				Grade4=2000*10/100;
				System.out.println("Grade 4 Salary:- "+Grade4);
				break;

			default:
				System.out.println("Invalid Grade Selection!!!");
		
		}
		
	}
}
