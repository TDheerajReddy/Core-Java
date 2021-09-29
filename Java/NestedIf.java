import java.io.*;
class NestedIf
{
	public static void main(String q[])throws Exception
	{
		int m1,m2,m3,m4,m5,tot;
		float avg;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 5 Marks");
		m1=Integer.parseInt(br.readLine());
		m2=Integer.parseInt(br.readLine());
		m3=Integer.parseInt(br.readLine());
		m4=Integer.parseInt(br.readLine());
		m5=Integer.parseInt(br.readLine());
		tot=m1+m2+m3+m4+m5;
		avg=tot/5;
		System.out.println("Total: "+tot);
		System.out.println("Avereage: "+avg);
		System.out.println("Student Details:");
		System.out.println("Mark1: "+m1);
		System.out.println("Mark2: "+m2);
		System.out.println("Mark3: "+m3);
		System.out.println("Mark4: "+m4);
		System.out.println("Mark5: "+m5);
		if(m1>=35&&m2>=35&&m3>=35&&m4>=35&&m5>=35)
		{
			if(avg>90&&avg<=100)
				System.out.println("A+ Grade");
			else if(avg>=80&&avg<=90)
				System.out.println("A Grade");
			else if(avg>=70&&avg<80)
				System.out.println("B Grade");
			else
				System.out.println("C Grade");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}